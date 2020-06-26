
package de.visaq.view.elements.airquality;

import java.awt.Color;

/**
 * Object used for creating the shown colors for the different Legends and Interpolation Views.
 */
public abstract class AirQualityData {
    
    /**
     * Name of the Airqualitydata.
     */
    public final String name;
    
    /**
     * Sole constructor of the class.
     * 
     * @param name  The name
     */
    public AirQualityData(String name)  {
        this.name = name;
    }
    
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
}
