package de.visaq.view.elements.map;

import org.json.JSONObject;

import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.diagram.Diagram;
import de.visaq.view.elements.diagram.LineDiagram;
import de.visaq.view.elements.toolbar.NavbarElement;

/**
 * Sensor Overview (also referred to as Sidebar) is used to show interpolated Point Data on the Map
 * or Data of a specific Sensor. It can show various Diagrams and different types of Air Quality
 * Data. It also provides an assessment of the danger due to specific types of pollution.
 */

public class SensorOverview implements NavbarElement {

    public final AirQualityData[] airQualityDatas = null;
    private AirQualityData currentAirQualityData;
    private Diagram diagram;
    private String start = "default";
    private String end = "default";
    private JSONObject data;

    public SensorOverview(JSONObject coordinates, AirQualityData currentAirQualityData) {
        this.currentAirQualityData = currentAirQualityData;
        this.diagram = new LineDiagram(data, start, end);
    }

    @Override
    public void show() {
        diagram.drawDiagram();
        diagram.showDiagram();
        // Query for sensordata concerning the four datatypes
    }

    public void selectTimeframe(String start, String end) {
        this.diagram = new LineDiagram(data, start, end);
    }

}
