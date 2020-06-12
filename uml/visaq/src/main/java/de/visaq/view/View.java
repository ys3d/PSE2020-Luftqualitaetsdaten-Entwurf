package de.visaq.view;

import de.visaq.view.theme.ColorTheme;

public abstract class View {
	final Language language;
	final ColorTheme colorTheme;
	
	

	public View(Language language, ColorTheme colorTheme) {
		this.colorTheme = colorTheme;
		this.language = language;
		// TODO Auto-generated constructor stub
	}


	public abstract void show();
}
