package de.visaq.model.sensorthings;

import java.awt.Point;

public class Location {
	private final String id;
	private final String name;
	private final String description;
	//TODO: Check if point is the only possible value
	private final Point location;
	private final NavigationLink historicalLocationLink;


	public Location(String id, String name, String description, Point location, NavigationLink historicalLocationLink) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.historicalLocationLink = historicalLocationLink;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public Point getLocation() {
		return location;
	}

	public NavigationLink getHistoricalLocationLink() {
		return historicalLocationLink;
	}
}
