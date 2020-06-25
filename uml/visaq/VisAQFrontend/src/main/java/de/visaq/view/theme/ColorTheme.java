package de.visaq.view.theme;

import java.awt.Color;

/**
 * Abstranct class the encapsulates the methods for Color Themes. There are different Color Themes
 * that can be desplayed theire shared functionality is in this class.
 */
public abstract class ColorTheme {
    private static ColorTheme instance = new LightTheme();

    /**
     * Creates a ColorTheme instance and updates the global instance accordingly.
     */
    public ColorTheme() {
        setInstance(this);
    }

    /**
     * Gets the current ColorTheme instance.
     * 
     * @return The ColorTheme instance
     */
    public static synchronized ColorTheme getInstance() {
        ColorTheme.instance = ColorTheme.instance == null ? new LightTheme() : ColorTheme.instance;
        return ColorTheme.instance;
    }

    /**
     * Sets the current ColorTheme instance.
     * 
     * @param colorTheme The ColorTheme instance
     */
    public static synchronized void setInstance(ColorTheme colorTheme) {
        ColorTheme.instance = colorTheme;
    }

    /**
     * Returns the primary Color of the Color Theme.
     * 
     * @return The instance of Color
     */
    public abstract Color getPrimaryColor();

    /**
     * Returns the secondary Color of the Color Theme.
     * 
     * @return The instance of Color
     */
    public abstract Color getSecondaryColor();

    /**
     * Returns the primary Gradient of the Color Theme.
     * 
     * @return The instance of the Gradient
     */
    public abstract Gradient getPrimarySkala();

    /**
     * Returns the primary Gradient of the Color Theme.
     * 
     * @return The instance of the Gradient
     */
    public abstract Gradient getSecondarySkala();
}