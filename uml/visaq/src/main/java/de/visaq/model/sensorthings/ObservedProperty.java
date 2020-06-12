package de.visaq.model.sensorthings;

import java.util.HashMap;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

public class ObservedProperty extends Sensorthings implements SensorthingsProperties {
	public final String name;
	public final String definition;
	public final String description;
	public final HashMap<String, Object> properties;
	public final MultiNavigationLink<Datastream> datastreamsLink;
	
	public ObservedProperty(String id, String name, String definition, String description,
			HashMap<String, Object> properties, MultiNavigationLink<Datastream> datastreamsLink,
			SingleNavigationLink<ObservedProperty> selfLink) {
		super(id, selfLink);
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
}