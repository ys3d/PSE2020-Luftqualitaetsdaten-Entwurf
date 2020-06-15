package de.visaq.view.elements;
/*
 * Searchbar that the user can use in order to look up a particular city using the city name or
 * the postal code of the city.
 */

public class SearchBar implements ToolbarElement {
	
	  
	private String input;
	/*
	 * Constructor for the Searchbar
	 */
	public SearchBar() {
		
	}
	/*
	 * shows the sidebar
	 */
	 @Override 
	public void show() {
		
	}
	
	/*
	 * gets the input of the user allowing a further use of it
	 * @return input
	 */
	public String getInput() {
		return input;
	}
	
	/*
	 * sets the input of the user
	 * @param input, input of the user
	 */
	public void setInput(String input) {
		this.input = input;
	}
	
}
