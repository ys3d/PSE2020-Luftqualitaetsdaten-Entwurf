package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.DatastreamController;
import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

/**
 * <p>Representation of the Datastream entity in the OGC SensorThings API</p>
 * <p>Datastreams group {@link Observation}s on the same {@link ObservedProperty} and {@link Sensor}</p>
 * @see <a href="https://developers.sensorup.com/docs/#datastreams_post">https://developers.sensorup.com/docs/#datastreams_post</a>
 */
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
	
	
	/**
	 * Constructs a new {@link Datastream}
	 * @param id The identifier of the {@link Datastream} in the SensorThings standard
	 * @param selfUrl The URL which links to this object on the given SensorThings database
	 * @param name The name of the {@link Datastream}
	 * @param description The description of the {@link Datastream}
	 * @param properties Several properties given by the database
	 * @param observationTypeLink URL leading to a documentation about the Observation Type
	 * @param sensorLink Link to the {@link Sensor}
	 * @param thingLink Link to the {@link Thing}
	 * @param observationsLink Links to the {@link Observation}
	 * @param unitOfMeasurement The Unit of Measurement
	 * @param observedPropertyLink Link to the {@link ObservedProperty}
	 */
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

	/**
	 * {@inheritDoc}
	 */
	public Object getPropertyByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * {@inheritDoc}
	 */
	public boolean hasProperties(String key) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
