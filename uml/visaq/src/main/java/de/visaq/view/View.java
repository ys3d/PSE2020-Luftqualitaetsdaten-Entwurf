package de.visaq.view;

import de.visaq.view.theme.ColorTheme;

/*
 * Shows what the User is seeing when selecting different ColorThemes and Languages 
 */
public abstract class View {

	final Language language;
	final ColorTheme colorTheme;
	
	
	/*
	 * The Constructor sets the Language and the ColorTheme
	 */
	public View(Language language, ColorTheme colorTheme) {
		this.colorTheme = colorTheme;
		this.language = language;
		// TODO Auto-generated constructor stub
	}

	/*
	 * Shows the different instances in the View 
	 */
	public abstract void show();
}
