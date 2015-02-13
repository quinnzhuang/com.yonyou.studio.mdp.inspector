package com.yonyou.studio.mdp.inspector;

import java.io.File;

public interface AnalyseJob {

	void analyse(AnalyseContext context, File file) throws InterruptedException;
	
	void output(AnalyseContext context);

}
