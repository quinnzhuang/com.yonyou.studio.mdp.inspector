package com.yonyou.studio.mdp.inspector.impl;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

import com.yonyou.studio.mdp.inspector.AnalyseContext;

public class ComponentExtensionJob extends MetaDataExtensionJob {

	private static final String COMPONENT_MESSAGE = "组件%s存在垂直扩展现象，文件如下：";

	@Override
	protected String getFormatMessage() {
		return COMPONENT_MESSAGE;
	}

	@Override
	public void analyse(AnalyseContext context, File file)
			throws InterruptedException {
		String componentId = context.componentDefination(file).getComponent().getId();
		map.putIfAbsent(componentId, new LinkedBlockingQueue<File>());
		map.get(componentId).put(context.componentDefination(file).getFile());		
	}

}
