package de.visaq.view.elements;
import de.visaq.view.elements.diagram.Diagram;

public class SensorOverview implements ToolbarElement{
	
	Diagram diagram;
	
	public void showDiagram(Diagram diagram) {
	}
	
	public void setDiagram(Diagram specificDiagram) {
		this.diagram = specificDiagram;
	}
	
	public String getText(String key) {
		return null;
	}
	
	public void show() {
		
	}
}
