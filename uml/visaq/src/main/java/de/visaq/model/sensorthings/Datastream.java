package de.visaq.model.sensorthings;

public class Datastream {
	private final String id;
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
	private final ObservedProperty observedProperty;

	public Datastream(String id, String name, String description, UnitOfMeasurement unitOfMeasurement, NavigationLink selfLink,
			String observationTypeLink, NavigationLink observationsLink, NavigationLink sensorLink,
			NavigationLink thingLink, ObservedProperty observedProperty) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitOfMeasurement = unitOfMeasurement;
		this.selfLink = selfLink;
		this.observationTypeLink = observationTypeLink;
		this.observationsLink = observationsLink;
		this.sensorLink = sensorLink;
		this.thingLink = thingLink;
		this.observedProperty = observedProperty;
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

	public NavigationLink getSelfLink() {
		return selfLink;
	}

	public String getObservationTypeLink() {
		return observationTypeLink;
	}

	public NavigationLink getObservationsLink() {
		return observationsLink;
	}

	public NavigationLink getSensorLink() {
		return sensorLink;
	}

	public NavigationLink getThingLink() {
		return thingLink;
	}

	public ObservedProperty getObservedProperty() {
		return observedProperty;
	}
	
	
	
}
