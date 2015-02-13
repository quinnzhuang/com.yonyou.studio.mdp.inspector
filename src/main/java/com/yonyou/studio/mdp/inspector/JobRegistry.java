package com.yonyou.studio.mdp.inspector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhuangkun
 * @param <T>
 */
public class JobRegistry {
	
	private List<JobRegistration> allJobs = new LinkedList<>();
	
	public void registJob(JobRegistration job) {
		allJobs.add(job);
	}
	
	public void unregistJob(JobRegistration job) {
		allJobs.remove(job);
	}
	
	public JobRegistration[] getRegistedJobs() {
		return allJobs.toArray(new JobRegistration[0]);
	}
	
	public static class JobRegistration {
		
		private final AnalyseJob job;
		
		private final String name;
		
		private final String desc;
		
		private List<JobInterceptor> interceptors = new ArrayList<>();
		
		public JobRegistration(AnalyseJob job, String name, String desc) {
			this.job = job;
			this.name = name;
			this.desc = desc;
		}

		public AnalyseJob getJob() {
			return job;
		}

		public String getName() {
			return name;
		}

		public String getDesc() {
			return desc;
		}
		
		public void registInterceptor(JobInterceptor interceptor) {
			interceptors.add(interceptor);
		}
		
		public JobInterceptor[] getInterceptors() {
			return interceptors.toArray(new JobInterceptor[0]);
		}
		
	}

}
