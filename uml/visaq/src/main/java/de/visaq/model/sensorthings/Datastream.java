package de.visaq.model.sensorthings;

import de.visaq.controller.link.NavigationLink;

public class Datastream implements Sensorthings {
	private final String id;
	private final String name;
	private final String description;
	private final UnitOfMeasurement unitOfMeasurement;
	//REST request that this datastream was retrieved from
	private final NavigationLink<Datastream> selfLink;
	//URL of some definition regarding this observation
	private final String observationTypeLink;
	private final NavigationLink<Observation> observationsLink;
	private final NavigationLink<Sensor> sensorLink;
	private final NavigationLink<Thing> thingLink;

	

	public Datastream(String id, String name, String description, UnitOfMeasurement unitOfMeasurement,
			NavigationLink<Datastream> selfLink, String observationTypeLink,
			NavigationLink<Observation> observationsLink, NavigationLink<Sensor> sensorLink,
			NavigationLink<Thing> thingLink) {
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

	public NavigationLink<Datastream> getSelfLink() {
		return selfLink;
	}

	public String getObservationTypeLink() {
		return observationTypeLink;
	}

	public NavigationLink<Observation> getObservationsLink() {
		return observationsLink;
	}

	public NavigationLink<Sensor> getSensorLink() {
		return sensorLink;
	}

	public NavigationLink<Thing> getThingLink() {
		return thingLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
