package de.visaq.view.elements;
import de.visaq.view.elements.diagram.Diagram;

/*
 * SensorOverview also called Sidebar is used when the user clicks on an interpoled place on the map
 * or the information of a sensor is to be shown. It shows the data of the sensor.
 * Shown is a diagram with the historical data and also all 4 possible AirQualityDatas. It also shows 
 * some informations to the danger level of the data. 
 */

public class SensorOverview implements ToolbarElement{
	
	Diagram diagram;
	
	/*
	 * shows the given diagram
	 * @param diagram: given diagram with historical data
	 */
	public void showDiagram(Diagram diagram) {
	}

	/*
	 * sets the diagram
	 * @param specificDiagram sets the diagram
	 */
	private void setDiagram(Diagram specificDiagram) {
		this.diagram = specificDiagram;
	}
	
	/*
	 * getter for the diagram
	 * @return diagram with the historical data
	 */
	public Diagram getDiagram() {
		return diagram;
	}
	
	/*
	 * gets the text from the property
	 * @param key to the file
	 * @return the text
	 */
	public String getText(String key) {
		return null;
	}

	/*
	 * shows the Sidebar
	 */
	public void show() {
		
	}
}
