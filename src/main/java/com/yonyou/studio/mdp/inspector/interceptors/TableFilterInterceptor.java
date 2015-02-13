package com.yonyou.studio.mdp.inspector.interceptors;

import java.io.File;

import com.yonyou.studio.mdp.inspector.AnalyseContext;
import com.yonyou.studio.mdp.inspector.JobInterceptor;
import com.yonyou.studio.mdp.inspector.Utils.StringUtils;
import com.yonyou.studio.mdp.inspector.defination.ComponentDefination;

public class TableFilterInterceptor implements JobInterceptor {

	@Override
	public boolean before(AnalyseContext context, File file) {
		ComponentDefination def = context.componentDefination(file);
		if (!StringUtils.isEmpty(def.getTableNames())) {
			return StringUtils.contains(def.getTableNames(),
					context.getCondition()) > -1;
		}
		return false;
	}

	@Override
	public void after(AnalyseContext context, File file) {

	}

}
