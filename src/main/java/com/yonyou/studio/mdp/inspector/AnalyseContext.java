package com.yonyou.studio.mdp.inspector;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

import com.yonyou.studio.mdp.inspector.defination.ComponentDefination;

public class AnalyseContext {
	
	private Map<File, ComponentDefination> defRegistry = new ConcurrentHashMap<>();
	
	private List<Callable<Boolean>> parseJobs = new LinkedList<>();
	
	private List<Callable<Object>> jobs = new LinkedList<>();
	
	private final String condition;
	
	private UserInterface ui;
	
	public AnalyseContext(String condition) {
		this.condition = condition;
	}
	
	public String getCondition() {
		return condition;
	}
	
	void setUi(UserInterface ui) {
		this.ui = ui;
	}
	
	public UserInterface getUi() {
		return ui;
	}
	
	public void registComponentDef(ComponentDefination componentDef) {
		defRegistry.put(componentDef.getFile(), componentDef);
	}
	
	public ComponentDefination componentDefination(File file) {
		return defRegistry.get(file);
	}
	
	public void putParseJob(Callable<Boolean> job) {
		parseJobs.add(job);
	}
	
	public void putAnalyseJob(Callable<Object> job) {
		jobs.add(job);
	}
	
	public List<Callable<Object>> getJobs() {
		return Collections.unmodifiableList(jobs);
	}
	
	public List<Callable<Boolean>> getParseJobs() {
		return Collections.unmodifiableList(parseJobs);
	} 

}
