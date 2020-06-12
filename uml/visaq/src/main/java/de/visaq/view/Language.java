package de.visaq.view;

import java.awt.image.BufferedImage;
import java.util.Properties;

/*
 * Language class is used to change the language the user prefers and sets the Icon used in the toolbar
 */

public class Language {
	
	private BufferedImage icon = null;
	
	private final Properties language;
	public final String NAME;

	public Language(Properties language, String name) {
		super();
		this.language = language;
		this.NAME = name;
	}
	
	public BufferedImage getIcon() {
		
		return icon;
	}
	
	private void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	
	
	public String getText(String key) {
		return null;
	}
}
