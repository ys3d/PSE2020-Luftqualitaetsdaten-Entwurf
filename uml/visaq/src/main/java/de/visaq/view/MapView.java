package de.visaq.view;

import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.Timeline;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.Map;
import de.visaq.view.theme.ColorTheme;

/*
 * Mapview creates the view for the Map using the map-overlay allowing the user to 
 * see the map as well as the Legend, Timeline and Sensoroverview 
 * The Constructor sets the used language and color theme
 * show(): shows the Mapview
 * showLegend(): shows the Legend for the interpolation
 * showSensoroverview(): shows the Sidebar containing the different information to either the chosen point or the sensor
 * The getter and setters are used to set and get the specific information
 */

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
