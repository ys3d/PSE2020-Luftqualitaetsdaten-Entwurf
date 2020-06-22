package de.visaq.view.elements.diagram;

import de.visaq.controller.SensorController;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.view.elements.airquality.AirQualityData;

public class LineDiagram implements Diagram {
	
	public final Datastream datastream;
	public final String start;
	public final String end;
	
	
	public LineDiagram(Datastream datastream, String start, String end) {
		this.datastream = datastream;
		this.start = start;
		this.end = end;
	}


	@Override
	public void drawDiagram() {

	}

	@Override
	public void showDiagram() {
		// TODO Auto-generated method stub
		
	}
}
