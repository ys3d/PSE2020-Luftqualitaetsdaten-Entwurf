
package de.visaq.view.elements.AirQuality;

import java.awt.Color;

/*
 *AirQualityData allows the classes that extend it to create Objects of that type and to set their name as well as their
 *Colors used in the interpolation and legend 
 */

public abstract class AirQualityData {

	private String name;
	private Color primaryColor;
	private Color secondaryColor;

	/*
	 * Constructor for the AirQualitydata used for the coloration of the legend and the interpolation
	 */
	public AirQualityData(String name, Color primaryColor, Color secondaryColor) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
	}

	/*
	 * getter for the name of the data type
	 * @return name of the type
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * setter for the name of the data type
	 * @param name, name of the type
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * getter for the primary color of the data type
	 * @return primary color
	 */
	public Color getPrimaryColor() {
		return primaryColor;
	}

	/*
	 * setter for the primary color of the type
	 * @param primarycolor of the type when shown as legend or 
	 * interpolation
	 */
	private void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	/*
	 * getter for the name of the data type
	 * @return secondaryColor
	 */
	public Color getSecondaryColor() {
		return secondaryColor;
	}

	/*
	 * setter for the secondary color
	 * @param secondaryColor, secondary color of the type when shown as legend or 
	 * interpolation
	 */
	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	
}
