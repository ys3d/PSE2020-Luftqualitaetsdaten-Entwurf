package de.visaq.view.theme;

import java.awt.Color;

public abstract class ColorTheme {
    private static ColorTheme instance = new LightTheme();

    public static final Color primaryColor = null;
    public static final Color secondaryColor = null;

    /**
     * Creates a ColorTheme instance and updates the global instance accordingly.
     */
    public ColorTheme() {
        setInstance(this);
    }

    /**
     * Gets the current ColorTheme instance.
     * 
     * @return The ColorTheme instance.
     */
    public static synchronized ColorTheme getInstance() {
        ColorTheme.instance = ColorTheme.instance == null ? new LightTheme() : ColorTheme.instance;
        return ColorTheme.instance;
    }

    /**
     * Sets the current ColorTheme instance.
     * 
     * @param colorTheme The ColorTheme instance.
     */
    public static synchronized void setInstance(ColorTheme colorTheme) {
        ColorTheme.instance = colorTheme;
    }
}