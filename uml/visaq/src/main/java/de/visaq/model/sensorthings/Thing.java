package de.visaq.model.sensorthings;

import java.util.HashMap;

public class Thing implements SensorthingsProperties {
	private final String id;
	private final NavigationLink selfLink;
	private final String description;
	private final String name;
	private final HashMap<String, Object> properties;
	private final NavigationLink datastreamsLink;
	private final NavigationLink historicalLocationsLink;
	private final NavigationLink locationsLink;
	
	public Thing(String id, NavigationLink selfLink, String description, String name, HashMap<String, Object> properties,
			NavigationLink datastreamsLink, NavigationLink historicalLocationsLink, NavigationLink locationsLink) {
		this.id = id;
		this.selfLink = selfLink;
		this.description = description;
		this.name = name;
		this.properties = properties;
		this.datastreamsLink = datastreamsLink;
		this.historicalLocationsLink = historicalLocationsLink;
		this.locationsLink = locationsLink;
	}

	public String getId() {
		return id;
	}

	public NavigationLink getSelfLink() {
		return selfLink;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public NavigationLink getDatastreamsLink() {
		return datastreamsLink;
	}

	public NavigationLink getHistoricalLocationsLink() {
		return historicalLocationsLink;
	}

	public NavigationLink getLocationsLink() {
		return locationsLink;
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
