package de.visaq.view.elements.navbar;

/**
 * Searchbar that the user can use in order to look up a particular city using the city name or the
 * postal code of the city.
 */
public class SearchBar {

    private String input;

    /**
     * Constructor for the Searchbar instance.
     */
    public SearchBar() {

    }

    public void show() {

    }

    /**
     * Gets the input of the user allowing a further use of it.
     * 
     * @return The Searchbar input
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the Searchbar input.
     * 
     * @param input Input of the user
     */
    public void setInput(String input) {
        this.input = input;
    }

}
