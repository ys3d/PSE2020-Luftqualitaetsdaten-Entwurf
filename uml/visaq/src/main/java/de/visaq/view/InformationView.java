package de.visaq.view;

import java.awt.image.BufferedImage;

import de.visaq.view.theme.ColorTheme;

public class InformationView extends View {

	// Insert icon-file
	private BufferedImage icon = null;

	public InformationView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public BufferedImage getIcon() {
		return icon;
	}
	
	public String getText(String key) {
		return null;
	}
	
}
