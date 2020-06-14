package de.visaq.view.elements;

import java.awt.Color;

/*
 *AirQualityData allows the classes that extend it to create Objects of that type and to set their name as well as their
 *Colors used in the interpolation and legend 
 */

public abstract class AirQualityData {
	
	private String name;
	private Color primaryColor;
	private Color secondaryColor;
	
	public AirQualityData(String name, Color primaryColor, Color secondaryColor) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	public Color getSecondaryColor() {
		return secondaryColor;
	}

	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	
}
