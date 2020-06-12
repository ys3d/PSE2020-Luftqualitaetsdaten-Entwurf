package de.visaq.model.sensorthings;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

public class Datastream extends Sensorthings {
	public final String name;
	public final String description;
	public final UnitOfMeasurement unitOfMeasurement;
	//URL of some definition regarding this observation
	public final String observationTypeLink;
	public final MultiNavigationLink<Observation> observationsLink;
	public final SingleNavigationLink<Sensor> sensorLink;
	public final SingleNavigationLink<Thing> thingLink;

	public Datastream(String id, String name, String description, UnitOfMeasurement unitOfMeasurement,
			SingleNavigationLink<Datastream> selfLink, String observationTypeLink,
			MultiNavigationLink<Observation> observationsLink, SingleNavigationLink<Sensor> sensorLink,
			SingleNavigationLink<Thing> thingLink) {
		super(id, selfLink);
		this.name = name;
		this.description = description;
		this.unitOfMeasurement = unitOfMeasurement;
		this.observationTypeLink = observationTypeLink;
		this.observationsLink = observationsLink;
		this.sensorLink = sensorLink;
		this.thingLink = thingLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
