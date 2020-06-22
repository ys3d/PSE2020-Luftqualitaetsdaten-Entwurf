package de.visaq.view.elements.diagram;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;

public class BarDiagram implements Diagram {

	public final SensorController sensorController = new SensorController();
	public final FeatureOfInterest featuresOfInterest;
	public final AirQualityData airQualityData;
	private String start;
	private String end;
	
	
	public BarDiagram(FeatureOfInterest featuresOfInterest, AirQualityData airQualityData, String start, String end) {
	this.featuresOfInterest = featuresOfInterest;
	this.airQualityData = airQualityData;
	this.setStart(start);
	this.setEnd(end);
	}

	@Override
	public void drawDiagram() {
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sensorController.getAll();
		
	}

	@Override
	public void showDiagram() {
		// TODO Auto-generated method stub
		
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
}
