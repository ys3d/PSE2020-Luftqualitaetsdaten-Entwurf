package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.ObservedPropertyController;
import de.visaq.controller.link.MultiNavigationLink;

/**
 * <p>
 * Representation of the ObservedProperty entity in the OGC SensorThings API.
 * </p>
 * <p>
 * An ObservedProperty specifies the phenomenon of an {@link Observation}.
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#observedProperties_post">https://developers.sensorup.com/docs/#observedProperties_post</a>
 */
public class ObservedProperty extends Sensorthings<ObservedProperty>
        implements SensorthingsProperties {
    public final String name;
    public final String definition;
    public final String description;
    public final Map<String, Object> properties;
    public final MultiNavigationLink<Datastream> datastreamsLink;

    /**
     * Constructs a new {@link ObservedProperty}.
     * 
     * @param id              The identifier of the {@link ObservedProperty} in the SensorThings
     *                        standard
     * @param selfUrl         The URL which links to this object on the given SensorThings database
     * @param description     The description of the {@link ObservedProperty}
     * @param name            The name of the {@link ObservedProperty}
     * @param properties      The properties of the Observed Property
     * @param definition      A URL which links to a definition of the {@link ObservedProperty}
     * @param datastreamsLink Links to {@link Datastream}s
     */
    public ObservedProperty(String id, String selfUrl, boolean relative, String description,
            String name, Map<String, Object> properties, String definition,
            MultiNavigationLink<Datastream> datastreamsLink) {
        super(id, selfUrl, relative);
        this.name = name;
        this.definition = definition;
        this.description = description;
        this.properties = properties;
        this.datastreamsLink = datastreamsLink;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getPropertyByKey(String key) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasProperties(String key) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public ObservedPropertyController getController() {
        return new ObservedPropertyController();
    }
}