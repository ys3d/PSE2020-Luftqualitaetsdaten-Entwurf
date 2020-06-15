package de.visaq.view.elements;
/*
 * Searchbar that the user can use in order to look up a particular city using the city name or
 * the postal code of the city. 
 */

public class SearchBar implements ToolbarElement {
	 /*
	  *  The class has the attribute input that is used to store the input of the user.
	  */
	private String input;
	/*
	 *  It also exists a constructor for further uses.
	 */
	public SearchBar() {
		
	}
	 /*
	  * show() is from the ToolbarElement and shows the searchbar later on in the toolbar.
	  */
	public void show() {
		
	}
	/*
	 * The setter and getter are used to guarante an safe use of the input
	 */
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
}
