package de.visaq.model;

import java.time.Instant;

/**
 * <p>
 * Representation of the {@link HistoricalLocation} entity in the OGC SensorThings API.
 * </p>
 * <p>
 * {@link HistoricalLocation} provides time for the stored Location
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#historicalLocations_get">https://developers.sensorup.com/docs/#historicalLocations_get</a>
 */
public class HistoricalLocation extends Sensorthings<HistoricalLocation>
        implements SensorthingsTimeStamp {
    public final Instant time;

    /**
     * Constructs a new {@link HistoricalLocation}.
     * 
     * @param id            The identifier of the {@link HistoricalLocation} in the SensorThings
     *                      standard
     * @param selfUrl       The URL which links to this object on the given SensorThings database
     * @param time          The time
     * @param thingLink     Link to the {@link Thing}
     * @param locationsLink Links to the {@link Location}s
     */
    public HistoricalLocation(String id, String selfUrl, Instant time) {
        super(id, selfUrl);
        this.time = time;
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
    public boolean isOlder(SensorthingsTimeStamp other) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isNewer(SensorthingsTimeStamp other) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEqualOld(SensorthingsTimeStamp other) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instant getTimeStamp() {
        // TODO Auto-generated method stub
        return null;
    }
}
