package de.visaq.view;

import java.util.Properties;

public class Language {
	
	private final Properties language;
	public final String NAME;

	public Language(Properties language, String name) {
		super();
		this.language = language;
		this.NAME = name;
	}
	
	public String getText(String key) {
		return null;
	}
}
