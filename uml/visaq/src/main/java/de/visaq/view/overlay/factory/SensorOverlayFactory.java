package de.visaq.view.overlay.factory;

import java.util.ArrayList;

import de.visaq.model.PointData;
import de.visaq.view.elements.AirQualityData;
import def.leaflet.l.Layer;

/*
 * Creates a Map Overlay that shows the the Sensor Data measured by multiple Sensors . 
 */
public class SensorOverlayFactory extends OverlayFactory {


	public SensorOverlayFactory(AirQualityData airQualityData) {
		super(airQualityData);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Layer build(ArrayList<PointData> pointdata) {
		// TODO Auto-generated method stub
		return null;
	}

}
