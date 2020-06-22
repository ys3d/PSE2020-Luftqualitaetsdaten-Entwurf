package de.visaq.view.elements.map;

import org.json.JSONObject;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.diagram.Diagram;
import de.visaq.view.elements.diagram.LineDiagram;
import de.visaq.view.elements.toolbar.ToolbarElement;

/**
 * Sensor Overview (also referred to as Sidebar) is used to show interpolated Point Data on the Map
 * or Data of a specific Sensor. It can show various Diagrams and different types of Air Quality
 * Data. It also provides an assessment of the danger due to specific types of pollution.
 */

public class SensorOverview implements ToolbarElement {
	
	public final AirQualityData[] airQualityDatas;
	private AirQualityData currentAirQualityData;
	private SensorController sensorController = new SensorController();
    private Diagram diagram;
    private String start = "default";
    private String end = "default";

    public SensorOverview(JSONObject coordinates, AirQualityData currentAirQualityData) {
    	this.currentAirQualityData = currentAirQualityData;
        this.diagram = new LineDiagram(featuresOfInterest, currentAirQualityData, start, end);
    }

    @Override
    public void show() {
    	diagram.drawDiagram();
    	diagram.showDiagram();
    	//Query for sensordata concerning the four datatypes
    }
    
    public void selectTimeframe(String start, String end) {
    	this.diagram = new LineDiagram(featuresOfInterest, currentAirQualityData, start, end);
    }

	public Diagram getDiagram() {
		return diagram;
	}

	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}
	
}
