package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.ThingController;
import de.visaq.controller.link.MultiNavigationLink;

public class Thing extends Sensorthings<Thing> implements SensorthingsProperties {
	public final String description;
	public final String name;
	public final Map<String, Object> properties;
	public final MultiNavigationLink<Datastream> datastreamsLink;
	public final MultiNavigationLink<HistoricalLocation> historicalLocationsLink;
	public final MultiNavigationLink<Location> locationsLink;
	
	public Thing(String id, String selfUrl, String description, String name,
			Map<String, Object> properties, MultiNavigationLink<Datastream> datastreamsLink,
			MultiNavigationLink<HistoricalLocation> historicalLocationsLink, MultiNavigationLink<Location> locationsLink) {
		super(id, selfUrl);
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

	@Override
	public ThingController getController() {
		return new ThingController();
	}
}
