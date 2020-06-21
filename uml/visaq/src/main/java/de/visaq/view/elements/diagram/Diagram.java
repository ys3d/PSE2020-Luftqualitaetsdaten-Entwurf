package de.visaq.view.elements.diagram;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;

public abstract class Diagram {
	
	public final String title;
	public final SensorController sensorController;
	public final AirQualityData airQualityData;
	private String start;
	private String end;
	
	
	public Diagram(SensorController sensorController, AirQualityData airQualityData, String title, String start, String end) {
	this.title = title;
	this.sensorController = sensorController;
	this.airQualityData = airQualityData;
	this.setStart(start);
	this.setEnd(end);
	}

    public void showDiagram() {
	}

    public abstract void drawDiagram();

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
