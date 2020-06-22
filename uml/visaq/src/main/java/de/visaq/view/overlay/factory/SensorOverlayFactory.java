package de.visaq.view.overlay.factory;

import de.visaq.model.sensorthings.Datastream;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.Layer;

/*
 * Creates a Map Overlay that shows the the Sensor Data measured by multiple Sensors . 
 */
public class SensorOverlayFactory implements OverlayFactory {

    @Override // ???????????????????????????
    public Layer build(AirQualityData airquality, Datastream datastream) {
        return null;
    }

}
