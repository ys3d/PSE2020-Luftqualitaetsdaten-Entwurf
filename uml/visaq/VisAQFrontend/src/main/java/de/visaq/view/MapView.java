package de.visaq.view;

import java.time.Instant;
import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.model.Sensor;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.SensorOverview;
import de.visaq.view.elements.navbar.ExpertViewFilter;
import de.visaq.view.elements.navbar.SearchBar;
import de.visaq.view.elements.navbar.Timeline;
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
    private SearchBar searchBar;
    private AirQualityData currentAirQualityData;
    private boolean expertView;
    private ExpertViewFilter expertViewFilter;
    private boolean historicalView;
    private Timeline timeline;
    private Instant time;

    /**
     * Construct a MapView using the provided Map.
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
        this.overlayFactories.add(sensorOverlayFactory);
        this.overlayFactories.add(interpolationOverlayFactory);
        this.overlayBuilder = new OverlayBuilder(overlayFactories);
        addOverlays();
        this.timeline = new Timeline();
    }

    @Override
    public void show() {
        legend.show();
        if (historicalView) {
            showTimeline();
        }
        // TODO Auto-generated method stub

    }

    /**
     * A Time Data Query occurs when the controller on the timeline is moved. The method set the
     * time of the data query.
     * 
     * @param time
     */
    public void timeDataQuery(Instant time) {
        assert (historicalView);
        this.time = time;
    }

    /**
     * Is activated when to user marks a point on the map. Shows the Sidebar containing the
     * different information to either the chosen Point or the Sensor.
     *
     * @param coordinates
     */
    public void mapDataQueryCoordinates(JSONObject coordinates) {
        sensorOverview = new SensorOverview(coordinates, currentAirQualityData, this.time);
        sensorOverview.show();
    }

    /**
     * Is activated when to user marks a sensor on the map. Shows the Sidebar containing the
     * different information to either the chosen Point or the Sensor.
     *
     * @param coordinates
     */
    public void mapDataQuerySensor(Sensor sensor) {
        sensorOverview = new SensorOverview(sensor, currentAirQualityData, this.time);
        sensorOverview.show();
    }

    @Override
    public void update(SearchBar searchBar, AirQualityData currentAirQualityData,
            boolean expertView, ExpertViewFilter expertViewFilter, boolean historicalView) {
        this.searchBar = searchBar;
        this.currentAirQualityData = currentAirQualityData;
        this.expertView = expertView;
        this.expertViewFilter = expertViewFilter;
        this.historicalView = historicalView;
        airQualityDataQuery(currentAirQualityData);
    }

    /**
     * Shows the Timeline for the historical data.
     */
    private void showTimeline() {
        timeline.show();
    }

    /**
     * Change the current Air Quality Data Overlay and the matching Legend if the Air Quality Data
     * is changed in the Navbar instance.
     * 
     * @param airQualityData
     */
    private void airQualityDataQuery(AirQualityData airQualityData) {
        currentAirQualityData = airQualityData;
        legend = new Legend(currentAirQualityData);
        removeOverlays();
        addOverlays();
    }

    /**
     * Adds Overlays to the instance Map of Map View.
     */
    private void addOverlays() {
        if (!historicalView) {
            time = Instant.now();
        }
        if (expertView) {
            layers = overlayBuilder.buildExpertOverlays(currentAirQualityData, map.getBounds(),
                    expertViewFilter.getSelectedSensors(), time);
        } else {
            layers = overlayBuilder.buildOverlays(currentAirQualityData, map.getBounds(), time);
        }
    }

    /**
     * Removes Overlays from the Map instance.
     */
    private void removeOverlays() {

    }
}
