package de.visaq.view.overlay.factory;

import java.util.ArrayList;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;
import def.leaflet.l.Bounds;
import def.leaflet.l.Layer;
import def.leaflet.l.control.Layers;

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
	 * @param airquality 	Is the Observed Property of the Sensors.
	 * @param pointdata 	Is the data of the Sensors that is used to create the Map Overlay
	 * @return				A list of Overlays that where build by using the given factories.
	 */
	public ArrayList<Layer> buildOverlays(AirQualityData airquality, Bounds bounds )	{
		ArrayList<Layer> layers = new ArrayList<Layer>();
		for(OverlayFactory factory : factories)	{
			layers.add(factory.build(airquality, bounds));
		}
		return layers;
	}

	public OverlayFactory[] getFactories() {
		return factories;
	}

	public void setFactories(OverlayFactory[] factories) {
		this.factories = factories;
	}
}
