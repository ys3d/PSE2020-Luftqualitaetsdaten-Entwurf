package de.visaq.view;

import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.Timeline;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.Map;
import de.visaq.view.theme.ColorTheme;

public class MapView extends View {
	
	private Map map;
	
	private SensorOverview sensoroverview;
	
	private Legend legend;

	public MapView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
	public void showSensoroverview() {
		
	}
	
	public void showLegend() {
		
	}
	
	public void showTimeline() {
		
	}
	
	public Map getMap() {
		return this.map;
		
	}
	
	private void setMap(Map map) {
		this.map = map;
	}
	
	public SensorOverview getSensorOverview() {
		return this.sensoroverview;
		
	}
	
	private void setSensorOverview(SensorOverview sensoroverview) {
		this.sensoroverview = sensoroverview;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
