package de.visaq.model;

import java.time.Instant;

/**
 * <p>
 * Representation of the Observation entity in the OGC SensorThings API.
 * </p>
 * <p>
 * An Observation is the act of measuring or otherwise determining the value of a property. An
 * Observation in SensorThings represents a single Sensor reading of an ObservedProperty.
 * </p>
 * 
 * @see <a href=
 *      "https://developers.sensorup.com/docs/#observations_post">https://developers.sensorup.com/docs/#observations_post</a>
 */
public class Observation extends Sensorthing<Observation> {
    public final Instant phenomenonTime;
    public final Double result;
    public final Instant resultTime;

    /**
     * Constructs a new {@link Observation}.
     * 
     * @param id                    The identifier of the {@link Observation} in the SensorThings
     *                              standard
     * @param selfUrl               The URL which links to this object on the given SensorThings
     *                              database
     * @param phenomenonTime        The time when the Observation occurred
     * @param result                The result of the {@link Observation}
     * @param resultTime            The Time of the measuring result
     * @param datastreamLink        Link to the {@link Datastream}
     * @param featureOfInterestLink Link to the {@link FeatureOfInterest}
     */
    public Observation(String id, String selfUrl, Instant phenomenonTime, Double result,
            Instant resultTime) {
        super(id, selfUrl);
        this.phenomenonTime = phenomenonTime;
        this.result = result;
        this.resultTime = resultTime;
    }
}
