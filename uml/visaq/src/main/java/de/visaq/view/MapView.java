package de.visaq.view;

import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.Timeline;
import de.visaq.view.elements.map.Legend;
import de.visaq.view.elements.map.Map;
import de.visaq.view.theme.ColorTheme;

/*
 * Mapview creates the view for the Map using the map-overlay allowing the user to 
 * see the map as well as the Legend, Timeline and Sensoroverview 
 */

public class MapView extends View {
	
	private Map map;
	private SensorOverview sensoroverview;
	private Legend legend;

	/*
	 * The Constructor sets the used language and color theme
	 */
	public MapView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	/*
	 * shows the Mapview
	 */
	public void show() {
		// TODO Auto-generated method stub
		
	}
	 /*
	  * showSensoroverview(): shows the Sidebar containing the different information to either the chosen point or the sensor
	  */
	public void showSensoroverview() {
		
	}
	
	/*
	 * showLegend(): shows the Legend for the interpolation
	 */
	public void showLegend() {
		
	}
	
	/*
	 * showTimeline(): shows the timeline for the historical data
	 */
	public void showTimeline() {
		
	}
	
	/*
	 * getter for the map
	 * @return the used map
	 */
	public Map getMap() {
		return this.map;
		
	}

	/*
	 * setter for the map
	 * @param map sets the used map
	 */
	private void setMap(Map map) {
		this.map = map;
	}
	
	/*
	 * getter for the sidebar
	 * @return the set sidebar
	 */
	public SensorOverview getSensorOverview() {
		return this.sensoroverview;
		
	}
	
	/*
	 * sets the used sidebar
	 * @param sensoroverview
	 */
	private void setSensorOverview(SensorOverview sensoroverview) {
		this.sensoroverview = sensoroverview;
	}

	/*
	 * getter for the set legend
	 * @return the later shown legend
	 */
	public Legend getLegend() {
		return legend;
	}

	/*
	 * sets the later used legend
	 * @param legend the initiated legend
	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
