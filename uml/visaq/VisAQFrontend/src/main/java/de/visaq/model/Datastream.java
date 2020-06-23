package de.visaq.model;

import java.util.Map;

/**
 * <p>
 * Representation of the Datastream entity in the OGC SensorThings API.
 * </p>
 * <p>
 * Datastreams group {@link Observation}s on the same {@link ObservedProperty} and {@link Sensor}
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#datastreams_post">https://developers.sensorup.com/docs/#datastreams_post</a>
 */
public class Datastream extends Sensorthings<Datastream> implements SensorthingsProperties {
    public final String name;
    public final String description;
    public final UnitOfMeasurement unitOfMeasurement;

    /**
     * Constructs a new {@link Datastream}.
     * 
     * @param id                The identifier of the {@link Datastream} in the SensorThings
     *                          standard
     * @param selfUrl           The URL which links to this object on the given SensorThings
     *                          database
     * @param name              The name of the {@link Datastream}
     * @param description       The description of the {@link Datastream}
     * @param properties        Several properties given by the database
     * @param unitOfMeasurement The Unit of Measurement
     */
    public Datastream(String id, String selfUrl, String name, String description,
            Map<String, Object> properties, String observationTypeLink,
            UnitOfMeasurement unitOfMeasurement) {
        super(id, selfUrl);
        this.name = name;
        this.description = description;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getPropertyByKey(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasProperties(String key) {
        // TODO Auto-generated method stub
        return false;
    }

}
