package de.visaq.view;

import org.json.JSONObject;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.overlay.factory.OverlayBuilder;
import def.leaflet.l.Map;

/**
 * Map View creates the view for the Map using the Map Overlay allowing the user to see the Map as
 * well as the Legend, Timeline and SensorOverview.
 */
public class MapView extends View {
    public final Map map;
    private OverlayBuilder overlayBuilder;
    private Legend legend;
    private SensorOverview sensoroverview;
    private SensorController sensorController= new SensorController();
    
    /**
     * Construct a MapView using the provided Map and Legend.
     * 
     * @param map    The Map instance
     * @param legend The Legend instance
     */
    public MapView(Map map) {
        this.map = map;
    }

    @Override
    public void show() {
        showLegend();
    	// TODO Auto-generated method stub

    }

    /**
     * Shows the Sidebar containing the different information to either the chosen Point or the
     * Sensor.
     */
    private void showSensoroverview() {

    }

    /**
     * Shows the Legend for the interpolation.
     */
    private void showLegend() {

    }

    /**
     * Shows the Timeline for the historical data.
     */
    public void showTimeline() {

    }
    
    public void dataQuery(JSONObject coordinates)	{
    	//!!!!!!!!!!!!!!!!!!!!!!!
    	sensorController.getAll();
    	showSensoroverview();
    }
    
    

	public SensorOverview getSensoroverview() {
		return sensoroverview;
	}

	public void setSensoroverview(SensorOverview sensoroverview) {
		this.sensoroverview = sensoroverview;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public OverlayBuilder getOverlayBuilder() {
		return overlayBuilder;
	}

	public void setOverlayBuilder(OverlayBuilder overlayBuilder) {
		this.overlayBuilder = overlayBuilder;
	}
}
