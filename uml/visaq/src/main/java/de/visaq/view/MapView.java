package de.visaq.view;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.airquality.ParticulateMatter;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.navbar.Navbar;
import de.visaq.view.overlay.factory.InterpolationOverlayFactory;
import de.visaq.view.overlay.factory.OverlayBuilder;
import de.visaq.view.overlay.factory.OverlayFactory;
import de.visaq.view.overlay.factory.SensorOverlayFactory;
import def.leaflet.l.Bounds;
import def.leaflet.l.Map;

/**
 * Map View creates the view for the Map using the Map Overlay allowing the user to see the Map as
 * well as the Legend, Timeline and SensorOverview.
 */
public class MapView extends View {
    public final Map map;
    public final Navbar navbar;
    private AirQualityData currentAirQualityData;
    private OverlayBuilder overlayBuilder;
    ArrayList<OverlayFactory> overlayFactories;
    private Legend legend;
    private SensorOverview sensorOverview;
    
    
    /**
     * Construct a MapView using the provided Map and Legend.
     * 
     * @param map    The Map instance
     * @param legend The Legend instance
     */
    public MapView(Map map, Navbar navbar) {
        this.map = map;
        this.navbar = navbar;
        currentAirQualityData = new ParticulateMatter();
        legend = new Legend(currentAirQualityData);
        overlayFactories = new ArrayList<OverlayFactory>();
        OverlayFactory sensorOverlayFactory = new SensorOverlayFactory();
        OverlayFactory interpolationOverlayFactory = new InterpolationOverlayFactory();
        overlayFactories.add(sensorOverlayFactory);
        overlayFactories.add(interpolationOverlayFactory);
        overlayBuilder = new OverlayBuilder(overlayFactories);
		overlayBuilder.buildOverlays(currentAirQualityData, map.getBounds());
    }

    @Override
    public void show() {
    	legend.show();
    	// TODO Auto-generated method stub

    }
    


    /**
     * Shows the Timeline for the historical data.
     */
    public void showTimeline() {

    }

    /**
     * Change the current Air Quality Data Overlay and the matching Legend
     * 
     * @param airQualityData
     */
    public void airqualityDataQuery(AirQualityData airQualityData) {
    	currentAirQualityData = airQualityData;
    	legend = new Legend(currentAirQualityData);
    	overlayBuilder.buildOverlays(currentAirQualityData, map.getBounds());
    }
    

    
    /**
     * Is activated when to user marks a point or a sensor on the map.
     * Shows the Sidebar containing the different information to either the chosen Point or the
     * Sensor.
     *
     * 
     * @param coordinates
     */
    public void mapDataQuery(JSONObject coordinates)	{
    	sensorOverview = new SensorOverview(coordinates, currentAirQualityData);
    	sensorOverview.show();
    }
}
