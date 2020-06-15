package de.visaq.view.elements;
import de.visaq.view.elements.diagram.Diagram;

/*
 * SensorOverview also called Sidebar is used when the user clicks on an interpoled place on the map
 * or the information of a sensor is to be shown. It shows the data of the sensor.
 * Shown is a diagram with the historical data and also all 4 possible AirQualityDatas. It also shows 
 * some informations to the danger level of the data. 
 */

public class SensorOverview implements ToolbarElement{
	/*
	 * The shown Diagram that is set by the setter
	 */
	Diagram diagram;
	/*
	 * What will be shown in the SensorOverview
	 */
	public void showDiagram(Diagram diagram) {
	}
	/*
	 * Getter and setter for the Diagram type
	 */
	private void setDiagram(Diagram specificDiagram) {
		this.diagram = specificDiagram;
	}
	
	public Diagram getDiagram() {
		return diagram;
	}
	/*
	 * getText(): gets the text shown in the SensorOverview in the by the user chosen language.
	 */
	public String getText(String key) {
		return null;
	}
	/*
	 * The show() method is from the ToolbarElement and shows the SensorOverview.
	 */
	public void show() {
		
	}
}
