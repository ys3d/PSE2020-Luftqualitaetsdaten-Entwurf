package de.visaq.view.overlay.factory;

import java.time.Instant;
import java.util.ArrayList;

import org.javatuples.Pair;

import de.visaq.model.FeatureOfInterest;
import de.visaq.model.Observation;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.LatLngBounds;
import def.leaflet.l.Layer;

/*
 * Access point to the overlay factory. It builds overlays for maps using the special factories.
 */
public class OverlayBuilder {

    private ArrayList<OverlayFactory> factories = null;

    /**
     * Default Builder uses Sensor Overlay Factory and Interpolation Overlay Factory.
     */
    public OverlayBuilder() {
    }

    /**
     * Builder for building overlays with the given factories.
     * 
     * @param factories Are the Overlay Factories used to fabricate Map Overlays
     */
    public OverlayBuilder(ArrayList<OverlayFactory> factories) {
    }

    /**
     * @param airquality Is the Observed Property of the Sensors.
     * @param pointdata  Is the data of the Sensors that is used to create the Map Overlay
     * @return A list of Overlays that where build by using the given factories.
     */
    public ArrayList<Layer> buildOverlays(AirQualityData airquality, LatLngBounds latLngBounds,
            Instant time) {
        FeatureOfInterest featureOfInterest = null;
        Observation observation = null;
        Pair<FeatureOfInterest, Observation> data = null;
        ArrayList<Layer> layers = new ArrayList<Layer>();
        for (OverlayFactory factory : factories) {
            layers.add(factory.build(airquality, data));
        }
        return layers;
    }

    public ArrayList<Layer> buildExpertOverlays(AirQualityData airquality,
            LatLngBounds latLngBounds, ArrayList<?> selectedSensortypes, Instant time) {
        ArrayList<Layer> layers = new ArrayList<Layer>();
        return layers;

    }

}
