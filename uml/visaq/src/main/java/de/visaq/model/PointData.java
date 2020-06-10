package de.visaq.model;

import java.awt.Point;
import java.time.LocalDateTime;

import de.visaq.model.sensorthings.ObservedProperty;

public class PointData implements Data {
	
	private final Point point;
	private final ObservedProperty property;
	private final LocalDateTime dateTime;
	private final double value;
	
	
	public PointData(Point point, ObservedProperty property, LocalDateTime dateTime, double value) {
		super();
		this.point = point;
		this.property = property;
		this.dateTime = dateTime;
		this.value = value;
	}

	public Point getPoint() {
		return point;
	}

	public ObservedProperty getObservedProperty() {
		return property;
	}

	public double getValue() {
		return value;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

}
