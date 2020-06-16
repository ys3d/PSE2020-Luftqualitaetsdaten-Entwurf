package de.visaq.view.elements;
/*
 * Searchbar that the user can use in order to look up a particular city using the city name or
 * the postal code of the city.
 */

public class SearchBar implements ToolbarElement {
	
	  
	private String input;
	/*
	 * Constructor for the Searchbar instance
	 */
	public SearchBar() {
		
	}
	/*
	 * Shows the Sidebar instance
	 */
	 @Override 
	public void show() {
		
	}
	
	/*
	 * Gets the input of the user allowing a further use of it
	 * @return the input instance
	 */
	public String getInput() {
		return input;
	}
	
	/*
	 * Sets the input instance of the user
	 * @param input of the user
	 */
	public void setInput(String input) {
		this.input = input;
	}
	
}
