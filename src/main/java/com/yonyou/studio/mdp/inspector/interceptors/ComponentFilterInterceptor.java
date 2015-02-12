package com.yonyou.studio.mdp.inspector.interceptors;

import java.io.File;

import com.yonyou.studio.mdp.inspector.AnalyseContext;
import com.yonyou.studio.mdp.inspector.JobInterceptor;
import com.yonyou.studio.mdp.inspector.Utils.StringUtils;
import com.yonyou.studio.mdp.inspector.defination.ComponentDefination;

public class ComponentFilterInterceptor implements JobInterceptor {

	@Override
	public boolean before(AnalyseContext context, File file) {
		ComponentDefination def = context.componentDefination(file);
		if (StringUtils.isEmpty(def.getComponent().getId())) {
			throw new RuntimeException(String.format("Ԫ�����ļ�:%s��ʽ�������id����Ϊ��",
					file));
		}
		return StringUtils.contains(def.getComponent().getId(),
				context.getCondition());
	}

	@Override
	public void after(AnalyseContext context, File file) {
	}

}
