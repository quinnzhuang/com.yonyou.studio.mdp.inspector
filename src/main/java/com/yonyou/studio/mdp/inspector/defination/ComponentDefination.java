package com.yonyou.studio.mdp.inspector.defination;

import java.io.File;

import com.yonyou.studio.mdp.inspector.xml.AggregationRelation;
import com.yonyou.studio.mdp.inspector.xml.Busiitfconnection;
import com.yonyou.studio.mdp.inspector.xml.Busioperation;
import com.yonyou.studio.mdp.inspector.xml.Component;
import com.yonyou.studio.mdp.inspector.xml.DependConnection;
import com.yonyou.studio.mdp.inspector.xml.Entity;
import com.yonyou.studio.mdp.inspector.xml.Enumerate;
import com.yonyou.studio.mdp.inspector.xml.Opinterface;

public interface ComponentDefination {
	
	Component getComponent();

	String[] getTableNames();

	Entity getMainEntity();

	Entity[] getEntities();
	
	Enumerate[] getEnumerates();
	
	Busioperation[] getBusioperations();
	
	Opinterface[] getOpinterfaces();
	
	DependConnection[] getDependConnections();
	
	Busiitfconnection[] getBusiitfconnections();
	
	AggregationRelation[] getAggregationRelations();
	
	File getFile();

}
