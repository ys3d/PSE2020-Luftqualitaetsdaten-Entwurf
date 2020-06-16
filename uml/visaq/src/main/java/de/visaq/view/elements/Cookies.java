package de.visaq.view.elements;

/*
 * Cookies are shown at the initiation of website and are used to safe the 
 * Preferred configurations of the individual users.
 */

public class Cookies implements ToolbarElement{
	
	/*
	 * Used in order to safe whether the user accepted the Cookies or not
	 * @return Whether user accepted Cookies or not
	 */
	public boolean accept() {
		return false;
	}
	
	/*
	 * Gets the localized version of the Properties key
	 * @param key The Properties key
	 * @return Localized text
	 */
	public String getText(String key) {
		return null;
	}

	@Override 
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
