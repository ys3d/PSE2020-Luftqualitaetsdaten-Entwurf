package de.visaq.model.sensorthings;

import java.util.HashMap;

import de.visaq.controller.link.SingleNavigationLink;

public class Thing implements SensorthingsProperties, Sensorthings {
	private final String id;
	private final SingleNavigationLink<Thing> selfLink;
	private final String description;
	private final String name;
	private final HashMap<String, Object> properties;
	private final SingleNavigationLink<Datastream> datastreamsLink;
	private final SingleNavigationLink<HistoricalLocation> historicalLocationsLink;
	private final SingleNavigationLink<Location> locationsLink;
	
	public Thing(String id, SingleNavigationLink<Thing> selfLink, String description, String name,
			HashMap<String, Object> properties, SingleNavigationLink<Datastream> datastreamsLink,
			SingleNavigationLink<HistoricalLocation> historicalLocationsLink, SingleNavigationLink<Location> locationsLink) {
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

	public SingleNavigationLink<Thing> getSelfLink() {
		return selfLink;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public SingleNavigationLink<Datastream> getDatastreamsLink() {
		return datastreamsLink;
	}

	public SingleNavigationLink<HistoricalLocation> getHistoricalLocationsLink() {
		return historicalLocationsLink;
	}

	public SingleNavigationLink<Location> getLocationsLink() {
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
