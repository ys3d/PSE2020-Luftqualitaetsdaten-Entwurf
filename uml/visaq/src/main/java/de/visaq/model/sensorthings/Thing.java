package de.visaq.model.sensorthings;

import java.util.HashMap;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

public class Thing extends Sensorthings implements SensorthingsProperties {
	public final String description;
	public final String name;
	public final HashMap<String, Object> properties;
	public final MultiNavigationLink<Datastream> datastreamsLink;
	public final MultiNavigationLink<HistoricalLocation> historicalLocationsLink;
	public final MultiNavigationLink<Location> locationsLink;
	
	public Thing(String id, SingleNavigationLink<Thing> selfLink, String description, String name,
			HashMap<String, Object> properties, MultiNavigationLink<Datastream> datastreamsLink,
			MultiNavigationLink<HistoricalLocation> historicalLocationsLink, MultiNavigationLink<Location> locationsLink) {
		super(id, selfLink);
		this.description = description;
		this.name = name;
		this.properties = properties;
		this.datastreamsLink = datastreamsLink;
		this.historicalLocationsLink = historicalLocationsLink;
		this.locationsLink = locationsLink;
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
