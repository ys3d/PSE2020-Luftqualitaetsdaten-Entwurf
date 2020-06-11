package de.visaq.model.sensorthings;

import java.awt.Point;

import de.visaq.controller.link.NavigationLink;

public class Location implements Sensorthings {
	private final String id;
	private final String name;
	private final String description;
	//TODO: Check if point is the only possible value
	private final Point location;
	private final NavigationLink<HistoricalLocation> historicalLocationLink;


	public Location(String id, String name, String description, Point location, NavigationLink<HistoricalLocation> historicalLocationLink) {
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

	public NavigationLink<HistoricalLocation> getHistoricalLocationLink() {
		return historicalLocationLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
