package de.visaq.view;

import java.awt.image.BufferedImage;
import java.util.Properties;

public class Language {
	
	private BufferedImage icon;
	
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
	
	
	public String getText(String key) {
		return null;
	}
}
