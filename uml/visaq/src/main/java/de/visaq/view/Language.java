package de.visaq.view;

import java.awt.image.BufferedImage;
import java.util.Properties;

/*
 * Language class is used to change the language the user prefers and sets the Icon used in the toolbar.
 */

public class Language {
	 
	private BufferedImage icon = null;
	private final Properties language;
	public final String NAME;
	
	/*
	 * Constructor used to create the language
	 */
	public Language(Properties language, String name) {
		super();
		this.language = language;
		this.NAME = name;
	}
	/*
	 * gets the icon
	 * @return the icon
	 */
	public BufferedImage getIcon() {
		
		return icon;
	}
	
	private void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	/*
	 * Getter for the texts in the Property
	 * @param key, String to get the proper property with the language settings
	 * @return the text
	 */
	public String getText(String key) {
		return null;
	}
	/*
	 * Used to access the language properties
	 * @return the used language file
	 */
	public Properties getLanguage() {
		return language;
	}
}
