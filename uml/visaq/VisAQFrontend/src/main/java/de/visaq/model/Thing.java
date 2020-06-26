package de.visaq.model;

import java.util.Map;

/**
 * <p>
 * Representation of the Things entity in the OGC SensorThings API.
 * </p>
 * <p>
 * A Thing is an object of the physical world (physical Things) or the information world (virtual
 * Things) that is capable of being identified and integrated into communication networks [ITU-T
 * Y.2060]. A Thing has Locations and one or more Datastreams to collect Observations.
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#things">https://developers.sensorup.com/docs/#things</a>
 */
public class Thing extends Sensorthing<Thing> implements SensorthingsProperties {
    public final String description;
    public final String name;
    public final Map<String, Object> properties;

    /**
     * Constructs a new {@link Thing}.
     * 
     * @param id                      The identifier of the {@link Thing} in the SensorThings
     *                                standard
     * @param selfUrl                 The URL which links to this object on the given SensorThings
     *                                database
     * @param description             The description of the {@link Thing}
     * @param name                    The name of the {@link Thing}
     * @param properties              Several properties of the {@link Sensor}
     * @param datastreamsLink         Links to the {@link Datastream}
     * @param historicalLocationsLink Links to the {@link HistoricalLocation}
     * @param locationsLink           Links to the {@link Location}
     */
    public Thing(String id, String selfUrl, String description, String name,
            Map<String, Object> properties) {
        super(id, selfUrl);
        this.description = description;
        this.name = name;
        this.properties = properties;
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
}
