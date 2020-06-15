package de.visaq.view.elements.AirQuality;

import java.awt.Color;

/*
 *AirQualityData allows the classes that extend it to create Objects of that type and to set their name as well as their
 *Colors used in the interpolation and legend 
 */

public abstract class AirQualityData {
	/*
	 * Name of the data type
	 */
	private String name;
	/*
	 * Primary color used to portray the overlay
	 */
	private Color primaryColor;
	/*
	 * secondary color used to portray the overlay
	 */
	private Color secondaryColor;
	
	/*
	 * Constructor constructing the data
	 */
	public AirQualityData(String name, Color primaryColor, Color secondaryColor) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
	}
	/*
	 * Getter and setters used for the attitudes
	 */
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
