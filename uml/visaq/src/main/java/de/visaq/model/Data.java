package de.visaq.model;

import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.ObservedProperty;

public interface Data {
	public Location getLocation();
	
	public ObservedProperty getObservedProperty();
	
	public double getValue();
	
}
