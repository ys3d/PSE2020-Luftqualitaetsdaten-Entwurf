package de.visaq.view;

import java.awt.image.BufferedImage;
import java.util.Properties;

/**
 * Language class is used to change the Language the user prefers and sets the Icon used in the
 * Toolbar.
 */
public class Language {

    private BufferedImage icon = null;
    private final Properties language;
    public final String name;

    /**
     * Constructor used to create the Language.
     */
    public Language(Properties language, String name) {
        super();
        this.language = language;
        this.name = name;
    }

    /**
     * Gets the icon.
     * 
     * @return The icon
     */
    public BufferedImage getIcon() {

        return icon;
    }

    /**
     * Sets the icon.
     * 
     * @return The icon
     */
    private void setIcon(BufferedImage icon) {
        this.icon = icon;
    }

    /**
     * Gets the localized version of the Properties key.
     * 
     * @param key The Properties key
     * @return Localized text
     */
    public String getText(String key) {
        return null;
    }

    /**
     * Used to access the language properties.
     * 
     * @return the used language file
     */
    public Properties getLanguage() {
        return language;
    }
}
