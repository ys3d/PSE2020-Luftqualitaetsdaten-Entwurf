package de.visaq.model;

import java.awt.Point;
import java.time.LocalDateTime;

import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.ObservedProperty;

public class SensorData implements Data{
	
	private final Location location;
	private final ObservedProperty property;
	private final LocalDateTime dateTime;
	private final double value;
	

	public SensorData(Location location, ObservedProperty property, LocalDateTime dateTime, double value) {
		this.location = location;
		this.property = property;
		this.dateTime = dateTime;
		this.value = value;
	}

	public Location getLocation() {
		return location;
	}

	public ObservedProperty getObservedProperty() {
		return property;
	}

	public double getValue() {
		return value;
	}

	public Point getPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

}
