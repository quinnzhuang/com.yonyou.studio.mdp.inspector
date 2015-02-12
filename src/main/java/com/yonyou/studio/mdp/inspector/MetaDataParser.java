package com.yonyou.studio.mdp.inspector;

import java.io.File;

import javax.xml.bind.JAXBException;

import com.yonyou.studio.mdp.inspector.defination.ComponentDefination;

public interface MetaDataParser {
	
	public ComponentDefination parse(File file) throws JAXBException;
	
}
