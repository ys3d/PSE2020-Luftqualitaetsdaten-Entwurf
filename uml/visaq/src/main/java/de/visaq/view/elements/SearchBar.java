package de.visaq.view.elements;
/*
 * Searchbar that the user can use in order to look up a particular city using the city name or
 * the postal code of the city. 
 * The class has the attribute input that is used to store the input of the user.
 * It also exists a constructor for further uses.
 * show() is from the ToolbarElement and shows the searchbar later on in the toolbar.
 * The setter and getter are used to guarante an safe use of the input
 */

public class SearchBar implements ToolbarElement {
	
	private String input;
	
	public SearchBar() {
		
	}
	
	public void show() {
		
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
}
