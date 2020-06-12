package de.visaq.model.sensorthings;

import java.awt.Point;

import de.visaq.controller.link.SingleNavigationLink;

public class Location extends Sensorthings {
	public final String name;
	public final String description;
	//TODO: Check if point is the only possible value
	public final Point location;
	public final SingleNavigationLink<HistoricalLocation> historicalLocationLink;


	public Location(String id, SingleNavigationLink<HistoricalLocation> selfLink, String name, String description, Point location, SingleNavigationLink<HistoricalLocation> historicalLocationLink) {
		super(id, selfLink);
		this.name = name;
		this.description = description;
		this.location = location;
		this.historicalLocationLink = historicalLocationLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
