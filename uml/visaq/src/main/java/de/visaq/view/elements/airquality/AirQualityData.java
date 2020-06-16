
package de.visaq.view.elements.airquality;

import java.awt.Color;

import de.visaq.view.theme.ColorTheme;

/**
 * Object used for creating the shown colors for the different Legends and Interpolation Views.
 */
public abstract class AirQualityData {
    public static final String NAME = "";

    public abstract Color getPrimaryColor(ColorTheme colorTheme);

    public abstract Color getSecondaryColor(ColorTheme colorTheme);
}
