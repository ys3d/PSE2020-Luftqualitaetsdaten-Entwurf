package de.visaq.model.sensorthings;

//import java.time.Instant;
import java.util.Map;

import de.visaq.controller.DatastreamController;
import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

public class Datastream extends Sensorthings<Datastream> implements SensorthingsProperties {
	public final String name;
	public final String description;
	public final UnitOfMeasurement unitOfMeasurement;
	//URL of some definition regarding this observation
	public final String observationTypeLink;
	public final MultiNavigationLink<Observation> observationsLink;
	public final SingleNavigationLink<Sensor> sensorLink;
	public final SingleNavigationLink<Thing> thingLink;
//	public final Instant phenomenonTime;
//	public final Instant resultTime;

	public Datastream(
			String id, 
			String selfUrl, 
			String name, 
			String description, 
			Map<String, Object> properties, 
			String observationTypeLink,
//			Instant phenomenonTime,
//			Instant resultTime,
			SingleNavigationLink<Sensor> sensorLink,
			SingleNavigationLink<Thing> thingLink,
			MultiNavigationLink<Observation> observationsLink,
			UnitOfMeasurement unitOfMeasurement,
			SingleNavigationLink<ObservedProperty> observedPropertyLink) {
		super(id, selfUrl);
		this.name = name;
		this.description = description;
		this.unitOfMeasurement = unitOfMeasurement;
		this.observationTypeLink = observationTypeLink;
		this.observationsLink = observationsLink;
//		this.resultTime = resultTime;
//		this.phenomenonTime = phenomenonTime;
		this.sensorLink = sensorLink;
		this.thingLink = thingLink;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public DatastreamController getController() {
		return new DatastreamController();
	}

	@Override
	public Object getPropertyByKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasProperties() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
