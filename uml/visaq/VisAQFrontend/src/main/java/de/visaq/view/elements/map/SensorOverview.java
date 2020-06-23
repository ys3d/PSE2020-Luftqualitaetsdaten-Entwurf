package de.visaq.view.elements.map;

import java.time.Instant;

import org.javatuples.Pair;
import org.json.JSONObject;

import de.visaq.model.FeatureOfInterest;
import de.visaq.model.Observation;
import de.visaq.model.Sensor;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.diagram.Diagram;
import de.visaq.view.elements.diagram.LineDiagram;
import de.visaq.view.elements.navbar.ToolbarElement;

/**
 * Sensor Overview (also referred to as Sidebar) is used to show interpolated Point Data on the Map
 * or Data of a specific Sensor. It can show various Diagrams and different types of Air Quality
 * Data. It also provides an assessment of the danger due to specific types of pollution.
 */

public class SensorOverview implements ToolbarElement {

    public final AirQualityData[] airQualityDatas = null;
    private AirQualityData currentAirQualityData;
    private Diagram diagram;
    private String start = "default";
    private String end = "default";
    private Pair<FeatureOfInterest, Observation> data;

    public SensorOverview(JSONObject coordinates, AirQualityData currentAirQualityData,
            Instant time) {
        this.currentAirQualityData = currentAirQualityData;
        this.diagram = new LineDiagram(data, start, end);
    }

    public SensorOverview(Sensor sensor, AirQualityData currentAirQualityData, Instant time) {
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
