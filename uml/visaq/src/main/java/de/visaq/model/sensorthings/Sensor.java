package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.SensorController;
import de.visaq.controller.link.MultiNavigationLink;

/**
 * <p>
 * Representation of the Sensors entity in the OGC SensorThings API.
 * </p>
 * <p>
 * A Sensor in SensorThings API is an instrument that observes a property or phenomenon with the
 * goal of producing an estimate of the value of the property.
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#sensors_post">https://developers.sensorup.com/docs/#sensors_post</a>
 */
public class Sensor extends Sensorthings<Sensor> implements SensorthingsProperties {
    public final String description;
    public final String name;
    public final Map<String, Object> properties;
    public final MultiNavigationLink<Datastream> datastreamsLink;

    /**
     * Constructs a new {@link Sensor}.
     * 
     * @param id              The identifier of the {@link Sensor} in the SensorThings standard
     * @param selfUrl         The URL which links to this object on the given SensorThings database
     * @param description     The description of the {@link Sensor}
     * @param name            The name of the {@link Sensor}
     * @param properties      Several properties of the {@link Sensor}
     * @param datastreamsLink Links to the {@link Datastream}
     */
    public Sensor(String id, String selfUrl, String description, String name,
            Map<String, Object> properties, MultiNavigationLink<Datastream> datastreamsLink) {
        super(id, selfUrl);
        this.description = description;
        this.name = name;
        this.properties = properties;
        this.datastreamsLink = datastreamsLink;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public SensorController getController() {
        return new SensorController();
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
