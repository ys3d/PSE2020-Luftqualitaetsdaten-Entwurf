package de.visaq.view;

import java.awt.image.BufferedImage;
/*
 * Information View creates the view using a helping overlay allowing the user to 
 * easier navigate through the website 
 */
import de.visaq.view.theme.ColorTheme;

public class InformationView extends View {
	
	private BufferedImage icon = null;
	
	/*
	 * The Constructor sets the used Language and Color Theme. 
	 */
	public InformationView(Language language, ColorTheme colorTheme) {
		super(language, colorTheme);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	/* Returns the icon
	 * @return The icon
	 */
	public BufferedImage getIcon() {
		return icon;
	}
	
	/*
	 * Setter for the icon
	 * @param The icon 
	 */
	private void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	
	/* 
	 * Gets the shown information from the Property depending on the Language
	 * @param The key for the to shown text 
	 * @return The Property to this key
	 */
	public String getText(String key) {
		return null;
	}
	
}
