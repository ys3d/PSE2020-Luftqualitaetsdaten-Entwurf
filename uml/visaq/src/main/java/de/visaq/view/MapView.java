package de.visaq.view;

import de.visaq.view.elements.SensorOverview;
import de.visaq.view.elements.Timeline;
import de.visaq.view.theme.ColorTheme;
import def.leaflet.l.Map;

/*
 * Map View creates the view for the Map using the Map Overlay allowing the user to 
 * see the Map as well as the Legend, Timeline and SensorOverview 
 */
public class MapView extends View {
	
	private Map map;
	private SensorOverview sensoroverview;
	private Legend legend;

	/*
	 * The Constructor sets the used Language and Color Theme
	 */
	public MapView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	 /*
	  * Shows the Sidebar containing the different information to either the chosen Point or the Sensor
	  */
	public void showSensoroverview() {
		
	}
	
	/*
	 * Shows the Legend for the interpolation
	 */
	public void showLegend() {
		
	}
	
	/*
	 * Shows the Timeline for the historical data
	 */
	public void showTimeline() {
		
	}
	
	/*
	 * Getter for the Map
	 * @return The used Map
	 */
	public Map getMap() {
		return this.map;
		
	}
<<<<<<< HEAD

	/*
	 * Setter for the Map
	 * @param The Map
	 */
>>>>>>> master
	public void setMap(Map map) {
		this.map = map;
	}
	
	/*
	 * Getter for the Sidebar
	 * @return The Sidebar
	 */
	public SensorOverview getSensorOverview() {
		return this.sensoroverview;
		
	}

		this.sensoroverview = sensoroverview;
	}

	/*
	 * Getter for the Legend instance
	 * @return The Legend instance
	 */
	public Legend getLegend() {
		return legend;
	}

	/*
	 * Sets the later used Legend instance
	 * @param The Legend instance
	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
