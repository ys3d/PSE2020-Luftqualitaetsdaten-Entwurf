
package de.visaq.view.elements.airquality;

import java.awt.Color;

/**
 * Object used for creating the shown colors for the different Legends and Interpolation Views.
 */
public abstract class AirQualityData {
    private final String NAME = "";

    public abstract Color getPrimaryColor();

    public abstract Color getSecondaryColor();

    public String getName() {
        return NAME;
    }

}
