package de.visaq.view.elements.diagram;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;

public class BarDiagram extends Diagram {

	private FeatureOfInterest featuresOfInterest;

    public LineDiagram(FeatureOfInterest featuresOfInterest, AirQualityData airQualityData, String start,
			String end) {
		super(featuresOfInterest, airQualityData, title, start, end);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drawDiagram() {
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sensorController.getAll();
	}
}
