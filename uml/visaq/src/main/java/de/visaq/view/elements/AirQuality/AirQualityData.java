
package de.visaq.view.elements.AirQuality;

import java.awt.Color;

/*
 * Object used for creating the shown colors for the different Legends and Interpolation Overlays
 * 
 */
public abstract class AirQualityData {

	private String name;
	private Color primaryColor;
	private Color secondaryColor;

	/*
	 * Constructor for the AirQualityData used for the coloration of the Legend and the Interpolation
	 * @param The name of the pollution Type
	 * @param The primaryColor used for the Legend and Interpolation
	 * @param The secondaryColor used for the Legend and Interpolation
	 */
	public AirQualityData(String name, Color primaryColor, Color secondaryColor) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
	}

	/*
	 * Getter for the name of the data type
	 * @return The name of the type
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Setter for the name of the data type
	 * @param The name of the type
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Getter for the primary color of the data type
	 * @return The primaryColor
	 */
	public Color getPrimaryColor() {
		return primaryColor;
	}

	/*
	 * Setter for the primary color of the type
	 * @param The primarycolor of the type when shown as a Legend or 
	 * Interpolation
	 */
	private void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	/*
	 * Getter for the name of the data type
	 * @return The secondaryColor
	 */
	public Color getSecondaryColor() {
		return secondaryColor;
	}

	/*
	 * Setter for the secondary color
	 * @param The secondaryColor of the type when shown as a Legend or 
	 * Interpolation
	 */
	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	
}
