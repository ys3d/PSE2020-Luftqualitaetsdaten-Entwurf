package de.visaq.model.sensorthings;

import java.util.HashMap;

public class Thing {
	private final int id;
	private final NavigationLink selfLink;
	private final String description;
	private final String name;
	private final HashMap<String, String> properties;
	private final NavigationLink datastreamsLink;
	private final NavigationLink historicalLocationsLink;
	private final NavigationLink locationsLink;
	
	public Thing(int id, NavigationLink selfLink, String description, String name, HashMap<String, String> properties,
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
}
