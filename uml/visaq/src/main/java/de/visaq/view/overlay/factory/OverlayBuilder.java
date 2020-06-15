package de.visaq.view.overlay.factory;

import java.util.ArrayList;

import de.visaq.model.PointData;
import de.visaq.view.elements.map.MapOverlay;

/*
 * Access point to the overlay factory. It builds overlays for maps using the special factories.
 */
public class OverlayBuilder {
	
	private OverlayFactory[] factories = null;
	
	/**
	 * Default Builder uses Sensor Overlay Factory and Interpolation Overlay Factory.
	 */
	public OverlayBuilder() {
	}

	 /**
	  * Builder for building overlays with the given factories.
	  * 
	  * @param factories	Are the Overlay Factories used to fabricate Map Overlays	 
	  */
	public OverlayBuilder(OverlayFactory[] factories)	{	
	}
	
	/**
	 * 
	 * @param pointdata 	Is the data of the Sensors that is used to create the Map Overlay
	 * @return				A list of Overlays that where build by using the given factories.
	 */
	public ArrayList<MapOverlay> buildOverlays(ArrayList<PointData> pointdata)	{
		return null;
	}
}
