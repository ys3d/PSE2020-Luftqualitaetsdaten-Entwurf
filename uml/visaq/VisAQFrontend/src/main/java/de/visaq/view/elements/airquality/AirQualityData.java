
package de.visaq.view.elements.airquality;

import java.awt.Color;

/**
 * Object used for creating the shown colors for the different Legends and Interpolation Views.
 */
public abstract class AirQualityData {
	
	private Color primaryColor;
	private Color secondaryColor;
    public final String name = "";
    
    /**
     * Getter for the primary color to draw the interpolation and legend
     * @return primary Color of the AirQualityData used in interpolation and legend
     */
    public abstract Color getPrimaryColor();

    /**
     * Getter for the secondary color to draw the interpolation and legend
     * @return secondary Color of the AirQualityData used in interpolation and legend
     */
    public abstract Color getSecondaryColor();
}
