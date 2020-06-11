package de.visaq.model.sensorthings;

import java.util.HashMap;

public class ObservedProperty implements SensorthingsProperties {
	private final String id;
	private final String name;
	private final String definition;
	private final String description;
	private final HashMap<String, Object> properties;
	private final NavigationLink datastreamsLink;
	private final NavigationLink selfLink;
	
	public ObservedProperty(String id, String name, String definition, String description,
			HashMap<String, Object> properties, NavigationLink datastreamsLink, NavigationLink selfLink) {
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


	public NavigationLink getDatastreamsLink() {
		return datastreamsLink;
	}


	public NavigationLink getSelfLink() {
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