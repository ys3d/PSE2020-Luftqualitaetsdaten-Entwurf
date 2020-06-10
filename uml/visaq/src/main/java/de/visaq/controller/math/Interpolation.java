package de.visaq.controller.math;

import java.awt.Point;

import de.visaq.model.PointData;
import de.visaq.model.sensorthings.ObservedProperty;
import de.visaq.model.sensorthings.Thing;

public interface Interpolation {
	public PointData interpolate(Point location, ObservedProperty observedProperty , Thing... things);
}
