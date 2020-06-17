package de.visaq.view;

import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.Map;

/**
 * Map View creates the view for the Map using the Map Overlay allowing the user to see the Map as
 * well as the Legend, Timeline and SensorOverview.
 */
public class MapView extends View {
    public final Map map;
    public final Legend legend;

    /**
     * Construct a MapView using the provided Map and Legend.
     * 
     * @param map    The Map instance
     * @param legend The Legend instance
     */
    public MapView(Map map, Legend legend) {
        this.map = map;
        this.legend = legend;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    /**
     * Shows the Sidebar containing the different information to either the chosen Point or the
     * Sensor.
     */
    public void showSensoroverview() {

    }

    /**
     * Shows the Legend for the interpolation.
     */
    public void showLegend() {

    }

    /**
     * Shows the Timeline for the historical data.
     */
    public void showTimeline() {

    }
}
