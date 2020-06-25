
package de.visaq.view.elements.airquality;

import java.awt.Color;

/**
 * Object used for creating the shown colors for the different Legends and Interpolation Views.
 */
public abstract class AirQualityData {
    
    /**
     * Name of the Airqualitydata.
     */
    private final String name = "";
    
    /**
     * Getter for the primary color to draw the interpolation and legend.
     * @return primary Color of the Airqualitydata used in interpolation and legend
     */
    public abstract Color getPrimaryColor();

    /**
     * Getter for the secondary color to draw the interpolation and legend.
     * @return secondary Color of the Airqualitydata used in interpolation and legend
     */
    public abstract Color getSecondaryColor();

    /**
     * Getter for the Name of the Airqualitydata.
     * @return  The instance of name
     */
    public String getName() {
        return name;
    }
}
