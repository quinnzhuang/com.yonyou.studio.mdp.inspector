package com.yonyou.studio.mdp.inspector;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXBException;

import com.yonyou.studio.mdp.inspector.JobRegistry.JobRegistration;
import com.yonyou.studio.mdp.inspector.impl.ComponentExtensionJob;
import com.yonyou.studio.mdp.inspector.impl.MetaDataFileParser;
import com.yonyou.studio.mdp.inspector.impl.TableExtensionJob;
import com.yonyou.studio.mdp.inspector.interceptors.ComponentFilterInterceptor;
import com.yonyou.studio.mdp.inspector.interceptors.TableFilterInterceptor;

public class Analyser {

	private static final FileFilter filter = new MetaDataFileFilter();

	private MetaDataParser parser = new MetaDataFileParser();

	private UserInterface ui = new UserInterface() {

		@Override
		public void output(String msg) {
			System.out.println(msg);
		}
	};

	private JobRegistry jobRegistry = new JobRegistry();

	private ExecutorService executor = Executors.newFixedThreadPool(Runtime
			.getRuntime().availableProcessors());

	static class MetaDataFileFilter implements FileFilter {

		private static final String DOT_BMF = ".bmf";

		private static final String DOT_BPF = ".bpf";

		@Override
		public boolean accept(File file) {
			return isMetadataFileOrDir(file);
		}

		private boolean isMetadataFileOrDir(File file) {
			return file.getName().endsWith(DOT_BMF)
					|| file.getName().endsWith(DOT_BPF) || file.isDirectory();
		}
	}

	public Analyser() {
		JobRegistration componentExtJobReg = new JobRegistration(
				new ComponentExtensionJob(), "垂直扩展分析", "");
		componentExtJobReg.registInterceptor(new ComponentFilterInterceptor());
		jobRegistry.registJob(componentExtJobReg);
		JobRegistration tableExtJobReg = new JobRegistration(
				new TableExtensionJob(), "水平扩展分析", "");
		tableExtJobReg.registInterceptor(new TableFilterInterceptor());
		jobRegistry.registJob(tableExtJobReg);
	}

	public void analyze(File dir, String condition) {
		if (!dir.isDirectory()) {
			ui.output("请指定一个文件夹进行分析。");
		}
		ui.output(String.format("######开始分析文件夹:%s下文件######",
				dir.getAbsoluteFile()));
		AnalyseContext context = new AnalyseContext(condition);
		context.setUi(ui);
		collectCommands(dir, context);
		ui.output(String.format("共找到%d个文件，开始分析文件内容", context.getParseJobs()
				.size()));
		try {
			executor.invokeAll(context.getParseJobs());
		} catch (Exception e) {
			ui.output(String.format("解析元数据文件出错。错误信息：%s", e.getMessage()));
		}
		try {
			executor.invokeAll(context.getJobs());
		} catch (InterruptedException e) {
			ui.output(String.format("执行分析出错。错误信息：%s", e.getMessage()));
		}
		ui.output("######################分析完毕#########################");
		ui.output("####################开始输出结果#########################");
		outputResult(context);
	}

	private void outputResult(AnalyseContext context) {
		JobRegistration[] registations = jobRegistry.getRegistedJobs();
		for (JobRegistration registation : registations) {
			registation.getJob().output(context);
		}
	}

	private void collectCommands(File dir, final AnalyseContext context) {
		for (final File file : dir.listFiles(filter)) {
			if (file.isDirectory()) {
				collectCommands(file, context);
			} else if (file.isFile()) {
				context.putParseJob(new ParseJob(context, file,
						new Callable<Object>() {
							@Override
							public Object call() throws Exception {
								JobRegistration[] registrations = jobRegistry
										.getRegistedJobs();
								for (JobRegistration registration : registrations) {
									try {
										JobInterceptor[] interceptors = registration
												.getInterceptors();
										if (before(context, file, interceptors)) {
											registration.getJob().analyse(
													context, file);
											after(context, file, interceptors);
										}
									} catch (Exception e) {
										ui.output(String
												.format("执行分析过程出错， 出错的分析过程为：%s，文件名：%s，错误信息：%s",
														registration.getName(),
														file.getAbsolutePath(),
														e.getMessage()));
									}
								}
								return null;
							}
						}));
			}
		}
	}

	private boolean before(final AnalyseContext context, final File file,
			JobInterceptor[] interceptors) {
		if (interceptors != null) {
			for (int i = 0; i < interceptors.length; i++) {
				if (!interceptors[i].before(context, file)) {
					return false;
				}
			}
		}
		return true;
	}

	private void after(final AnalyseContext context, final File file,
			JobInterceptor[] interceptors) {
		if (interceptors != null) {
			for (int j = interceptors.length - 1; j > -1; j--) {
				interceptors[j].after(context, file);
			}
		}
	}

	private class ParseJob implements Callable<Boolean> {

		private final AnalyseContext context;

		private final File file;

		private final Callable<Object> analyseJob;

		public ParseJob(AnalyseContext context, File file,
				Callable<Object> analyseJob) {
			this.context = context;
			this.file = file;
			this.analyseJob = analyseJob;
		}

		@Override
		public Boolean call() throws Exception {
			try {
				boolean success = preParseFile(file, context);
				if (success) {
					context.putAnalyseJob(analyseJob);
				}
				return success;
			} catch (Exception e) {
				ui.output(String.format("解析文件：%s出错。错误：%s",
						file.getAbsolutePath(), e.getMessage()));
				return false;
			}
		}

	}

	private boolean preParseFile(final File file, AnalyseContext context) {
		try {
			context.registComponentDef(parser.parse(file));
		} catch (JAXBException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (args == null || args.length < 1) {
			System.out.println("请指定要分析的目录以及过滤条件，以空格分开。例如：");
			System.out.println("	D:\\uap\\modules [test]");
			return;
		}
		Analyser analyser = new Analyser();
		analyser.analyze(new File(args[0].trim()),
				args.length > 1 ? args[1].trim() : null);
	}

}
