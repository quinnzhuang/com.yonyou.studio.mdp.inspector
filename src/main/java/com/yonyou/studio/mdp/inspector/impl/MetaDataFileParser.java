package com.yonyou.studio.mdp.inspector.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.yonyou.studio.mdp.inspector.MetaDataParser;
import com.yonyou.studio.mdp.inspector.defination.ComponentDefImpl;
import com.yonyou.studio.mdp.inspector.defination.ComponentDefination;
import com.yonyou.studio.mdp.inspector.xml.Component;

public class MetaDataFileParser implements MetaDataParser {

	// private static final String COMPONENT_STR = "<component";
	//
	// private static final String ENTITY_STR = "<entity";
	//
	// private static final String MAIN_ENTITY = "mainEntity";
	//
	// private static final String ATTR_ID = "id";
	//
	// private static final String ATTR_TABLE_NAME = "tableName";
	//
	// private static final String EQUAL_SIGN = "=";
	//
	// private static final String SPACE = " ";

	// private String mainEntity;
	//
	// private String tableName;

	public ComponentDefination parse(File file) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Component.class);
		Unmarshaller shaller = jaxbContext.createUnmarshaller();
		return new ComponentDefImpl(file, (Component) shaller.unmarshal(file));
	}

	// private void parse() {
	// BufferedReader reader = null;
	// try {
	// reader = new BufferedReader(new FileReader(file));
	// String line = null;
	// while ((line = reader.readLine()) != null) {
	// if (line.indexOf(COMPONENT_STR) > -1) {
	// componentId = getAttribute(line, ATTR_ID);
	// mainEntity = getAttribute(line, MAIN_ENTITY);
	// } else if (line.indexOf(ENTITY_STR) > -1) {
	// tableName = getAttribute(line, ATTR_TABLE_NAME);
	// break;
	// }
	// }
	// } catch (IOException e) {
	// e.printStackTrace();
	// } finally {
	// if (reader != null) {
	// try {
	// reader.close();
	// } catch (IOException e) {
	// }
	// }
	// }
	// }
	//
	// private String getAttribute(String line, String attrName) {
	// String[] attrs = line.split(SPACE);
	// for (String attr : attrs) {
	// if (attr.trim().length() == 0)
	// continue;
	// String[] pair = attr.split(EQUAL_SIGN);
	// if (pair[0].trim().equalsIgnoreCase(attrName)
	// && pair[1].trim().length() > 2) {
	// return pair[1].trim().substring(1, pair[1].trim().length() - 1);
	// }
	// }
	// return null;
	// }

}
