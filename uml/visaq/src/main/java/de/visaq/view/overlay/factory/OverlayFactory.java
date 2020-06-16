package de.visaq.view.overlay.factory;

import java.util.ArrayList;

import de.visaq.model.PointData;
import de.visaq.view.elements.AirQualityData;
import def.leaflet.l.Layer;

/*
 * 	Encapsulates the control over all Overlay Factories.
 */
public abstract class OverlayFactory {

	public final AirQualityData airQualityData = null;
	
	/*
	 * Sole constructor, initializes the Airquality Data.
	 */
	public OverlayFactory(AirQualityData airQualityData)	{
		
	}
	/**
	 * 
	 * @param pointdata		List of the Sensordata to construct an Map Overlay
	 * @return				A overlay for the map.
	 */
	public abstract Layer build(ArrayList<PointData> pointdata);
}
