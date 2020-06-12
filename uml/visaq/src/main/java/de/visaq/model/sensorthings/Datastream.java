package de.visaq.model.sensorthings;

import de.visaq.controller.link.SingleNavigationLink;

public class Datastream implements Sensorthings {
	private final String id;
	private final String name;
	private final String description;
	private final UnitOfMeasurement unitOfMeasurement;
	//REST request that this datastream was retrieved from
	private final SingleNavigationLink<Datastream> selfLink;
	//URL of some definition regarding this observation
	private final String observationTypeLink;
	private final SingleNavigationLink<Observation> observationsLink;
	private final SingleNavigationLink<Sensor> sensorLink;
	private final SingleNavigationLink<Thing> thingLink;

	

	public Datastream(String id, String name, String description, UnitOfMeasurement unitOfMeasurement,
			SingleNavigationLink<Datastream> selfLink, String observationTypeLink,
			SingleNavigationLink<Observation> observationsLink, SingleNavigationLink<Sensor> sensorLink,
			SingleNavigationLink<Thing> thingLink) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitOfMeasurement = unitOfMeasurement;
		this.selfLink = selfLink;
		this.observationTypeLink = observationTypeLink;
		this.observationsLink = observationsLink;
		this.sensorLink = sensorLink;
		this.thingLink = thingLink;
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

	public UnitOfMeasurement getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public SingleNavigationLink<Datastream> getSelfLink() {
		return selfLink;
	}

	public String getObservationTypeLink() {
		return observationTypeLink;
	}

	public SingleNavigationLink<Observation> getObservationsLink() {
		return observationsLink;
	}

	public SingleNavigationLink<Sensor> getSensorLink() {
		return sensorLink;
	}

	public SingleNavigationLink<Thing> getThingLink() {
		return thingLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
