package de.visaq.view.elements;

/*
 * Cookies are shown at the initiation of website and are used to safe the 
 * Preferred configurations of the individual users.
 * It implements ToolbarElement because of the show() method used in this class.
 * The boolean accept(): is used in order to safe if the user accepted the cookies or not
 * getText(): gets the text that is shown in the Cookie window
 * show(): shows the cookie window
 */

public class Cookies implements ToolbarElement{

	public boolean accept() {
		return false;
	}
	
	public String getText(String key) {
		return null;
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
