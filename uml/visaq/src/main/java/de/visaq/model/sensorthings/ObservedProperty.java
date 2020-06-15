package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.ObservedPropertyController;
import de.visaq.controller.link.MultiNavigationLink;

public class ObservedProperty extends Sensorthings<ObservedProperty> implements SensorthingsProperties {
	public final String name;
	public final String definition;
	public final String description;
	public final Map<String, Object> properties;
	public final MultiNavigationLink<Datastream> datastreamsLink;
	
	public ObservedProperty(String id, String selfUrl, String description, String name, Map<String, Object> properties, String definition,
			MultiNavigationLink<Datastream> datastreamsLink) {
		super(id, selfUrl);
		this.name = name;
		this.definition = definition;
		this.description = description;
		this.properties = properties;
		this.datastreamsLink = datastreamsLink;
	}
	
	public Object getPropertyByKey() {
		return null;
	}

	
	public boolean hasProperties() {
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public ObservedPropertyController getController() {
		return new ObservedPropertyController();
	}
}