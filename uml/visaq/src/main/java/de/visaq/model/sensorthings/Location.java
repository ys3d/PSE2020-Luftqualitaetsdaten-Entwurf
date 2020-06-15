package de.visaq.model.sensorthings;

import java.awt.Point;

import de.visaq.controller.LocationController;
import de.visaq.controller.link.MultiNavigationLink;

public class Location extends Sensorthings<Location> {
	public final String name;
	public final String description;
	//TODO: Check if point is the only possible value
	public final Point location;
	public final MultiNavigationLink<HistoricalLocation> historicalLocationsLink;
	public final MultiNavigationLink<Thing> thingsLink;

	public Location(String id, String selfUrl, String name, String description, Point location, MultiNavigationLink<HistoricalLocation> historicalLocationsLink, MultiNavigationLink<Thing> thingsLink) {
		super(id, selfUrl);
		this.name = name;
		this.description = description;
		this.location = location;
		this.historicalLocationsLink = historicalLocationsLink;
		this.thingsLink = thingsLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public LocationController getController() {
		return new LocationController();
	}
}
