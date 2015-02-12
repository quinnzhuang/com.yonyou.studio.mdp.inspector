package com.yonyou.studio.mdp.inspector;

import java.io.File;

public interface JobInterceptor {

	boolean before(AnalyseContext context, File file);
	
	void after(AnalyseContext context, File file);

}
