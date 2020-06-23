package de.visaq.model.sensorthings;

import java.time.Instant;

import de.visaq.controller.HistoricalLocationController;
import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

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
    public final SingleNavigationLink<Thing> thingLink;
    public final MultiNavigationLink<Location> locationsLink;

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
    public HistoricalLocation(String id, String selfUrl, boolean relative, Instant time,
            SingleNavigationLink<Thing> thingLink, MultiNavigationLink<Location> locationsLink) {
        super(id, selfUrl, relative);
        this.time = time;
        this.thingLink = thingLink;
        this.locationsLink = locationsLink;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public HistoricalLocationController getController() {
        return new HistoricalLocationController();
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
