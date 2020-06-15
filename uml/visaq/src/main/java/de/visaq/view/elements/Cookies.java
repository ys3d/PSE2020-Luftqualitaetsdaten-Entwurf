package de.visaq.view.elements;

/*
 * Cookies are shown at the initiation of website and are used to safe the 
 * Preferred configurations of the individual users.
 */

public class Cookies implements ToolbarElement{
	
	/*
	 * The boolean accept(): is used in order to safe if the user accepted the cookies or not
	 * @return if the user accepted the cookies or not
	 */
	public boolean accept() {
		return false;
	}
	
	/*
	 * gets the shown text using the key
	 * @param key, used to access the Property
	 * @return the text
	 */
	public String getText(String key) {
		return null;
	}
 
	/*
	 * will show the element
	 */
	@Override 
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void safeData() {
	
	}
	
}
