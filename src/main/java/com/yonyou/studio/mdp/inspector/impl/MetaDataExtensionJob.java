package com.yonyou.studio.mdp.inspector.impl;

import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.yonyou.studio.mdp.inspector.AnalyseContext;
import com.yonyou.studio.mdp.inspector.AnalyseJob;

public abstract class MetaDataExtensionJob implements AnalyseJob {

	protected ConcurrentMap<String, BlockingQueue<File>> map = new ConcurrentHashMap<>();

	protected abstract String getFormatMessage();
	
	@Override
	public void output(AnalyseContext context) {
		Iterator<Entry<String, BlockingQueue<File>>> it = map.entrySet()
				.iterator();
		while (it.hasNext()) {
			Entry<String, BlockingQueue<File>> entry = it.next();
			if (entry.getValue().size() > 1) {
				context.getUi().output(String.format(getFormatMessage(), entry.getKey()));
				for (Iterator<File> iterator = entry.getValue().iterator(); iterator
						.hasNext();) {
					File file = iterator.next();
					context.getUi().output("    " + file.getAbsolutePath());
				}
			}
		}
	}
}
