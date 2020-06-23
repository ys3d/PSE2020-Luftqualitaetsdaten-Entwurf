package de.visaq.view.overlay.factory;

import org.javatuples.Pair;

import de.visaq.model.FeatureOfInterest;
import de.visaq.model.Observation;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.Layer;

/*
 * Creates a Map Overlay that shows the the Sensor Data measured by multiple Sensors . 
 */
public class SensorOverlayFactory implements OverlayFactory {

    @Override // ???????????????????????????
    public Layer build(AirQualityData airquality, Pair<FeatureOfInterest, Observation> data) {
        return null;
    }

}
