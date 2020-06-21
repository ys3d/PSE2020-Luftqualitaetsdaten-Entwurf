package de.visaq.view.elements.diagram;

import de.visaq.controller.SensorController;
import de.visaq.view.elements.airquality.AirQualityData;

public class LineDiagram extends Diagram {

    public LineDiagram(SensorController sensorController, AirQualityData airQualityData, String title, String start,
			String end) {
		super(sensorController, airQualityData, title, start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawDiagram() {
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sensorController.getAll();
	}

}
