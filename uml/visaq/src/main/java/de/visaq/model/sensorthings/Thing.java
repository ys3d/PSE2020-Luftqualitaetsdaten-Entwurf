package de.visaq.model.sensorthings;

import java.util.HashMap;

import de.visaq.controller.link.NavigationLink;

public class Thing implements SensorthingsProperties, Sensorthings {
	private final String id;
	private final NavigationLink<Thing> selfLink;
	private final String description;
	private final String name;
	private final HashMap<String, Object> properties;
	private final NavigationLink<Datastream> datastreamsLink;
	private final NavigationLink<HistoricalLocation> historicalLocationsLink;
	private final NavigationLink<Location> locationsLink;
	
	public Thing(String id, NavigationLink<Thing> selfLink, String description, String name,
			HashMap<String, Object> properties, NavigationLink<Datastream> datastreamsLink,
			NavigationLink<HistoricalLocation> historicalLocationsLink, NavigationLink<Location> locationsLink) {
		super();
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

	public NavigationLink<Thing> getSelfLink() {
		return selfLink;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public NavigationLink<Datastream> getDatastreamsLink() {
		return datastreamsLink;
	}

	public NavigationLink<HistoricalLocation> getHistoricalLocationsLink() {
		return historicalLocationsLink;
	}

	public NavigationLink<Location> getLocationsLink() {
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
