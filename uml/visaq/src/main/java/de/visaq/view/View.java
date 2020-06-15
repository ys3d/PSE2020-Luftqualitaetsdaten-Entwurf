package de.visaq.view;

import de.visaq.view.theme.ColorTheme;

/*
 * Abstract class that Map-View, Expert-View, Information-View extend 
 */

public abstract class View {

	final Language language;
	final ColorTheme colorTheme;
	
	
	/*
	 * The Constructor sets the language and the colortheme
	 */
	public View(Language language, ColorTheme colorTheme) {
		this.colorTheme = colorTheme;
		this.language = language;
		// TODO Auto-generated constructor stub
	}

	/*
	 * the abstract method show is also used in the extending classes 
	 */
	public abstract void show();
}
