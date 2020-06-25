package de.visaq.view.overlay.factory;

import de.visaq.model.PointData;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.Layer;

/*
 * 	Encapsulates the control over all Overlay Factories.
 */
public interface OverlayFactory {

    /**
     * @param data Array of the Sensor Data to construct an Map Overlay
     * @return A Map Overlay for the map.
     */
    public abstract Layer build(AirQualityData airquality, PointData[] data);
}
