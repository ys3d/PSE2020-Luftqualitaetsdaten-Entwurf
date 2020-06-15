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
	/*
	 * Used to store the used map
	 */
	private Map map;
	/*
	 * Used to create a sidebar
	 */
	private SensorOverview sensoroverview;
	/*
	 * used to show the specific legend
	 */
	private Legend legend;
	/*
	 * The Constructor sets the used language and color theme
	 */
	public MapView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	/*
	 * show(): shows the Mapview
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
	 *  showTimeline(): shows the timeline for the historical data
	 */
	public void showTimeline() {
		
	}
	/*
	 * The getter and setters are used to set and get the specific information for the map
	 */
	public Map getMap() {
		return this.map;
		
	}

	private void setMap(Map map) {
		this.map = map;
	}
	/*
	 * The getter and setters are used to set and get the specific information for the SensoeOverview
	 */
	public SensorOverview getSensorOverview() {
		return this.sensoroverview;
		
	}
	
	private void setSensorOverview(SensorOverview sensoroverview) {
		this.sensoroverview = sensoroverview;
	}
	/*
	 * The getter and setters are used to set and get the specific information for the legend
	 */
	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
