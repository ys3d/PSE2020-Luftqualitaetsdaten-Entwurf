package de.visaq.model.sensorthings;

public class Datastream {
	private final String name;
	private final String description;
	private final UnitOfMeasurement unitOfMeasurement;
	//REST request that this datastream was retrieved from
	private final NavigationLink selfLink;
	//URL of some definition regarding this observation
	private final String observationTypeLink;
	private final NavigationLink observationsLink;
	private final NavigationLink sensorLink;
	private final NavigationLink thingLink;

	public Datastream(String name, String description, UnitOfMeasurement unitOfMeasurement, NavigationLink selfLink,
			String observationTypeLink, NavigationLink observationsLink, NavigationLink sensorLink,
			NavigationLink thingLink) {
		this.name = name;
		this.description = description;
		this.unitOfMeasurement = unitOfMeasurement;
		this.selfLink = selfLink;
		this.observationTypeLink = observationTypeLink;
		this.observationsLink = observationsLink;
		this.sensorLink = sensorLink;
		this.thingLink = thingLink;
	}
}
