package de.visaq.view.elements;
import de.visaq.view.elements.diagram.Diagram;

/*
 * SensorOverview also called Sidebar is used when the user clicks on an interpoled place on the map
 * or the information of a Sensor is to be shown. It shows the data of the Sensor.
 * Shown is a Diagram instance with the historical data and also all 4 possible AirQualityDatas. It also shows 
 * some informations to the danger level of the data. 
 */

public class SensorOverview implements ToolbarElement{
	
	Diagram diagram;
	
	/*
	 * Shows the diagram instance
	 * @param The diagram with historical data
	 */
	public void showDiagram(Diagram diagram) {
	}

	/*
	 * Sets the diagram instance
	 * @param specificDiagram sets the diagram instance
	 */
	private void setDiagram(Diagram specificDiagram) {
		this.diagram = specificDiagram;
	}
	
	/*
	 * Getter for the diagram instance
	 * @return The diagram instance with the historical data
	 */
	public Diagram getDiagram() {
		return diagram;
	}
	
	/*
	 * Gets the localized version of the Properties key
	 * @param key The Properties key
	 * @return Localized text
	 */
	public String getText(String key) {
		return null;
	}

	/*
	 * Shows the Sidebar
	 */
	public void show() {
		
	}
}
