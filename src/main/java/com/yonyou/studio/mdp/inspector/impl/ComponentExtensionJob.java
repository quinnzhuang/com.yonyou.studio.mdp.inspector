package com.yonyou.studio.mdp.inspector.impl;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

import com.yonyou.studio.mdp.inspector.AnalyseContext;

public class ComponentExtensionJob extends MetaDataExtensionJob {

	private static final String COMPONENT_MESSAGE = "���%s���ڴ�ֱ��չ�����ļ����£�";

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
