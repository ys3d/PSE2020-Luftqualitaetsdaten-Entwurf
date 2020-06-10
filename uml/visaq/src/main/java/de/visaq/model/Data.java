package de.visaq.model;

import java.awt.Point;

import java.time.LocalDateTime;

import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.ObservedProperty;

public interface Data {
	public Point getPoint();
	
	public ObservedProperty getObservedProperty();
	
	public double getValue();
	
	public LocalDateTime getDateTime();
	
}
