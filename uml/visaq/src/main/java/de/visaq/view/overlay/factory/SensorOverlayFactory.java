package de.visaq.view.overlay.factory;


import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.Bounds;
import def.leaflet.l.Layer;

/*
 * Creates a Map Overlay that shows the the Sensor Data measured by multiple Sensors . 
 */
public class SensorOverlayFactory implements OverlayFactory {
	
	@Override
	public Layer build(AirQualityData airquality, Bounds bound) {
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sensorController.getAll();
		return null;
	}

}
