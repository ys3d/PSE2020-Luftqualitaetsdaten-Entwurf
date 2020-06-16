package de.visaq.view.overlay.factory;

import java.util.ArrayList;

import de.visaq.model.PointData;
import de.visaq.view.elements.AirQualityData;
import def.leaflet.l.Layer;

/**
 * Creates an interpolated Map Overlay from given Sensor Data, 
 *
 */
public class InterpolationOverlayFactory extends OverlayFactory {

	public InterpolationOverlayFactory(AirQualityData airQualityData) {
		super(airQualityData);
	}

	@Override
	public Layer build(ArrayList<PointData> pointdata) {
		// TODO Auto-generated method stub
		return null;
	}

}
