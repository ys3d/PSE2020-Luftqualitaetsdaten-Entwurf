package de.visaq.view.elements.navbar;

import java.util.ArrayList;


public class ExpertViewFilter {
	
	private ArrayList<?> sensorTypes;
	
	public void show() {
	}
	
	public void setSelectedSensors(ArrayList<?> sensorTypes)	{
		
		//TODO change the sensor types to the correct version
		this.sensorTypes = sensorTypes;
	}
	
	public ArrayList<?> getSelectedSensors()	{
		return sensorTypes;
	}
}
