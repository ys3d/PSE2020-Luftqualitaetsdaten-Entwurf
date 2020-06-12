package de.visaq.view.theme;

import java.awt.Color;

public abstract class ColorTheme {
	
	private Color PRIMARYCOLOR = null;
	private Color SECONDARYCOLOR = null;
	
	public void colorsChosen(Color primaryColor, Color secondaryColor) {
		
	}

	public Color getSECONDARYCOLOR() {
		return SECONDARYCOLOR;
	}

	public void setSECONDARYCOLOR(Color secondaryColor) {
		SECONDARYCOLOR = secondaryColor;
	}

	public Color getPRIMARYCOLOR() {
		return PRIMARYCOLOR;
	}

	public void setPRIMARYCOLOR(Color primaryColor) {
		PRIMARYCOLOR = primaryColor;
	}

}
