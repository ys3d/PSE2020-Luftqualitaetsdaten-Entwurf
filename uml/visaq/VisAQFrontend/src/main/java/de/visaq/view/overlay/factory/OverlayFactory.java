package de.visaq.view.overlay.factory;

import de.visaq.model.Datastream;
import de.visaq.view.elements.airquality.AirQualityData;

import def.leaflet.l.Layer;

/*
 * 	Encapsulates the control over all Overlay Factories.
 */
public interface OverlayFactory {

    /**
     * @param pointdata List of the Sensordata to construct an Map Overlay
     * @return A overlay for the map.
     */
    public abstract Layer build(AirQualityData airquality, Datastream datastream);
}