package com.yonyou.studio.mdp.inspector.defination;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.yonyou.studio.mdp.inspector.xml.AggregationRelation;
import com.yonyou.studio.mdp.inspector.xml.Busiitfconnection;
import com.yonyou.studio.mdp.inspector.xml.Busioperation;
import com.yonyou.studio.mdp.inspector.xml.Component;
import com.yonyou.studio.mdp.inspector.xml.DependConnection;
import com.yonyou.studio.mdp.inspector.xml.Entity;
import com.yonyou.studio.mdp.inspector.xml.Enumerate;
import com.yonyou.studio.mdp.inspector.xml.Opinterface;

public class ComponentDefImpl implements ComponentDefination {

	private final File file;

	private final Component component;

	public ComponentDefImpl(File file, Component component) {
		this.file = file;
		this.component = component;
	}

	@Override
	public String[] getTableNames() {
		List<String> tableNameList = new LinkedList<>();
		for (Entity entity : component.getCelllist().getEntity()) {
			if (!isEmpty(entity))
				tableNameList.add(entity.getTableName().trim());
		}
		return tableNameList.toArray(new String[] {});
	}

	@Override
	public Entity getMainEntity() {
		for (Entity entity : component.getCelllist().getEntity()) {
			if (entity.getId().trim().equals(component.getMainEntity())) {
				return entity;
			}
		}
		throw new RuntimeException(String.format(
				"没有与组件中mainEntity属性相匹配的实体。文件路径：%s；组件id：%s",
				file.getAbsolutePath(), component.getId()));
	}

	@Override
	public Entity[] getEntities() {
		if (isEmpty(component.getCelllist().getEntity()))
			return new Entity[] {};
		return component.getCelllist().getEntity().toArray(new Entity[0]);
	}

	private boolean isEmpty(List<?> list) {
		return list == null || list.size() == 0;
	}

	@Override
	public Enumerate[] getEnumerates() {
		if (isEmpty(component.getCelllist().getEnumerate()))
			return new Enumerate[] {};
		return component.getCelllist().getEnumerate()
				.toArray(new Enumerate[] {});
	}

	@Override
	public Busioperation[] getBusioperations() {
		if (isEmpty(component.getCelllist().getBusioperation()))
			return new Busioperation[] {};
		return component.getCelllist().getBusioperation()
				.toArray(new Busioperation[] {});
	}

	@Override
	public Opinterface[] getOpinterfaces() {
		if (isEmpty(component.getCelllist().getOpinterface()))
			return new Opinterface[] {};
		return component.getCelllist().getOpinterface()
				.toArray(new Opinterface[] {});
	}

	@Override
	public DependConnection[] getDependConnections() {
		if (isEmpty(component.getConnectlist().getDependConnection()))
			return new DependConnection[] {};
		return component.getConnectlist().getDependConnection()
				.toArray(new DependConnection[] {});
	}

	@Override
	public Busiitfconnection[] getBusiitfconnections() {
		if (isEmpty(component.getConnectlist().getBusiitfconnection()))
			return new Busiitfconnection[] {};
		return component.getConnectlist().getBusiitfconnection()
				.toArray(new Busiitfconnection[] {});
	}

	@Override
	public AggregationRelation[] getAggregationRelations() {
		if (isEmpty(component.getConnectlist().getAggregationRelation()))
			return new AggregationRelation[] {};
		return component.getConnectlist().getAggregationRelation()
				.toArray(new AggregationRelation[] {});
	}

	@Override
	public File getFile() {
		return file;
	}

	@Override
	public Component getComponent() {
		return component;
	}

	private boolean isEmpty(Entity entity) {
		return entity.getTableName() == null
				|| entity.getTableName().trim().length() == 0;
	}

}
