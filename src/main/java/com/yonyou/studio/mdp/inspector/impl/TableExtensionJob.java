package com.yonyou.studio.mdp.inspector.impl;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

import com.yonyou.studio.mdp.inspector.AnalyseContext;

public class TableExtensionJob extends MetaDataExtensionJob {

	private static final String TABLE_MESSAGE = "表名%s存在水平扩展现象，文件如下：";

	@Override
	protected String getFormatMessage() {
		return TABLE_MESSAGE;
	}

	@Override
	public void analyse(AnalyseContext context, File file)
			throws InterruptedException {
		String[] tableNames = context.componentDefination(file).getTableNames();
		for (String tableName : tableNames) {
			map.putIfAbsent(tableName, new LinkedBlockingQueue<File>());
			map.get(tableName).put(context.componentDefination(file).getFile());
		}		
	}

}
