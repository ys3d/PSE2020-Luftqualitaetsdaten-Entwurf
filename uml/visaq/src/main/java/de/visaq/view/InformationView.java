package de.visaq.view;

import java.awt.image.BufferedImage;
/*
 * Informationview creates the view using a helping overlay allowing the user to 
 * easier navigate through the website 
 */
import de.visaq.view.theme.ColorTheme;

public class InformationView extends View {
	
	private BufferedImage icon = null;
	/*
	 * The Constructor sets the used language and color theme. 
	 */
	public InformationView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	/*
	 * shows the view
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	/* Returns the icon
	 * @return the set icon
	 */
	public BufferedImage getIcon() {
		return icon;
	}
	
	/*
	 * setter for the icon
	 * @param icon 
	 */

	private void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	
	/* 
	 * gets the shown information from the Property depending on the language
	 * @param key for the to shown text 
	 * @return the Property to this ke
	 */
	
	public String getText(String key) {
		return null;
	}
	
}
