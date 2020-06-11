package de.visaq.model.sensorthings;

import java.util.HashMap;

import de.visaq.controller.link.NavigationLink;

public class ObservedProperty implements SensorthingsProperties, Sensorthings {
	private final String id;
	private final String name;
	private final String definition;
	private final String description;
	private final HashMap<String, Object> properties;
	private final NavigationLink<Datastream> datastreamsLink;
	private final NavigationLink<ObservedProperty> selfLink;

	
	public ObservedProperty(String id, String name, String definition, String description,
			HashMap<String, Object> properties, NavigationLink<Datastream> datastreamsLink,
			NavigationLink<ObservedProperty> selfLink) {
		super();
		this.id = id;
		this.name = name;
		this.definition = definition;
		this.description = description;
		this.properties = properties;
		this.datastreamsLink = datastreamsLink;
		this.selfLink = selfLink;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDefinition() {
		return definition;
	}


	public String getDescription() {
		return description;
	}


	public NavigationLink<Datastream> getDatastreamsLink() {
		return datastreamsLink;
	}


	public NavigationLink<ObservedProperty> getSelfLink() {
		return selfLink;
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