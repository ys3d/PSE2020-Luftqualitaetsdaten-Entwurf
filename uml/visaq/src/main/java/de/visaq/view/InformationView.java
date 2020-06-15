package de.visaq.view;

import java.awt.image.BufferedImage;


/*
 * Informationview creates the view using a helping overlay allowing the user to 
 * easier navigate through the website 
 */

import de.visaq.view.theme.ColorTheme;

public class InformationView extends View {

	// Insert icon-file
	private BufferedImage icon = null;
	
	/*
	 * The Constructor sets the used language and color theme. 
	 */
	
	public InformationView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * show(): shows the Informationview
	 */
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * The getter and setter are used for the icon that is shown in the toolbar and navigationbar
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
	
}
