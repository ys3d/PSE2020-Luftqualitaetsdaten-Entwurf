package de.visaq.view;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.SensorOverview;
import de.visaq.view.elements.navbar.ExpertViewFilter;
import de.visaq.view.elements.navbar.SearchBar;
import de.visaq.view.overlay.factory.InterpolationOverlayFactory;
import de.visaq.view.overlay.factory.OverlayBuilder;
import de.visaq.view.overlay.factory.OverlayFactory;
import de.visaq.view.overlay.factory.SensorOverlayFactory;
import def.leaflet.l.Layer;
import def.leaflet.l.Map;

/**
 * Map View creates the view for the Map using the Map Overlay allowing the user to see the Map as
 * well as the Legend, Timeline and SensorOverview.
 */
public class MapView extends View {
    public final Map map;
    private OverlayBuilder overlayBuilder;
    private ArrayList<OverlayFactory> overlayFactories;
    private ArrayList<Layer> layers;
    private Legend legend;
    private SensorOverview sensorOverview;
    private boolean historicalView;
    private SearchBar searchBar;
    private AirQualityData currentAirQualityData;
    boolean expertView;
    private ExpertViewFilter expertViewFilter;

    /**
     * Construct a MapView using the provided Map and Legend.
     * 
     * @param map    The Map instance
     * @param legend The Legend instance
     */
    public MapView(Map map) {
        this.map = map;
        this.legend = new Legend(currentAirQualityData);
        this.overlayFactories = new ArrayList<OverlayFactory>();
        OverlayFactory sensorOverlayFactory = new SensorOverlayFactory();
        OverlayFactory interpolationOverlayFactory = new InterpolationOverlayFactory();
        overlayFactories.add(sensorOverlayFactory);
        overlayFactories.add(interpolationOverlayFactory);
        overlayBuilder = new OverlayBuilder(overlayFactories);
        addOverlays();
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
        addOverlays();
    }

    /**
     * Is activated when to user marks a point or a sensor on the map. Shows the Sidebar containing
     * the different information to either the chosen Point or the Sensor.
     *
     * @param coordinates
     */
    public void mapDataQuery(JSONObject coordinates) {
        sensorOverview = new SensorOverview(coordinates, currentAirQualityData);
        sensorOverview.show();
    }

    private void addOverlays() {
        if (expertView) {
            layers = overlayBuilder.buildExpertOverlays(currentAirQualityData, map.getBounds(),
                    expertViewFilter.getSelectedSensors());
        } else {
            layers = overlayBuilder.buildOverlays(currentAirQualityData, map.getBounds());
        }
    }

    @Override
    public void updateNavbar(SearchBar searchBar, AirQualityData currentAirQualityData,
            boolean expertView, ExpertViewFilter expertViewFilter) {
        this.searchBar = searchBar;
        this.currentAirQualityData = currentAirQualityData;
        this.expertView = expertView;
        this.expertViewFilter = expertViewFilter;
    }
}
