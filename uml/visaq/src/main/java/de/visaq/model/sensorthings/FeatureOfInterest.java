package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.SensorthingsController;
import de.visaq.controller.link.MultiNavigationLink;

public class FeatureOfInterest extends Sensorthings<FeatureOfInterest> {
    public final String description;
    public final String name;
    public final MultiNavigationLink<Observation> observationsLink;
    public final Map<String, Object> features;
    
    /**
     * Constructs a new {@link FeatureOfInterest}.
     * @param id The identifier of the {@link FeatureOfInterest} in the SensorThings
     *           standard
     * @param selfUrl The URL which links to this object on the given SensorThings database
     * @param description The description of the {@link FeatureOfInterest}
     * @param name The name of the {@link FeatureOfInterest}
     * @param observationsLink Links to the {@link Observation}
     * @param features Features
     */
    public FeatureOfInterest(String id, String selfUrl, String description, String name,
            MultiNavigationLink<Observation> observationsLink, Map<String, Object> features) {
        super(id, selfUrl);
        this.description = description;
        this.name = name;
        this.observationsLink = observationsLink;
        this.features = features;
    }


    @Override
    public SensorthingsController<FeatureOfInterest> getController() {
        // TODO Auto-generated method stub
        return null;
    }



}
