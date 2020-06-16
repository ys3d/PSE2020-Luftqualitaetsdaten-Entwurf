package de.visaq.view;

import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.Timeline;
import de.visaq.view.theme.ColorTheme;
import def.leaflet.l.Map;

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
	
	public void setMap(Map map) {
		this.map = map;
	}
	
	public SensorOverview getSensorOverview() {
		return this.sensoroverview;
		
	}
	
	public void setSensorOverview(SensorOverview sensoroverview) {
		this.sensoroverview = sensoroverview;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
