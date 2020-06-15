package de.visaq.view;

import java.awt.image.BufferedImage;
import java.util.Properties;

/*
 * Language class is used to change the language the user prefers and sets the Icon used in the toolbar
 */

public class Language {
	/*
	 * icon of the language setting
	 */
	private BufferedImage icon = null;
	/*
	 * Language Property
	 */
	private final Properties language;
	/*
	 * The name of the language
	 */
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
	 * setter and getter used for the icon
	 */
	public BufferedImage getIcon() {
		
		return icon;
	}
	
	private void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	
	/*
	 * getText(): gets the shown information from the Property depending on the language
	 */
	public String getText(String key) {
		return null;
	}
	/*
	 * gets the language used
	 */
	public Properties getLanguage() {
		return language;
	}
}
