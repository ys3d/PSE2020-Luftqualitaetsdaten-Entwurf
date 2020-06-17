package de.visaq.view.theme;

import java.awt.Color;

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

    public abstract Color getPrimaryColor();

    public abstract Color getSecondaryColor();

    public abstract ColorRange getPrimarySkala();

    public abstract ColorRange getSecondarySkala();
}