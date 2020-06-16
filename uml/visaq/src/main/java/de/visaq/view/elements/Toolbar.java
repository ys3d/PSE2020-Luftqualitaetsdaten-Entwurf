package de.visaq.view.elements;

import de.visaq.view.InformationView;
import de.visaq.view.elements.AirQuality.AirQualityData;

/*
 * The Toolbar. It shows the Navigationbar through which you can access further functionalities.
 * Also located here is the the Help/Information View, the language setting and the Searchbar.
 * This class imports the InformationView from the view package to use it in the Toolbar.
 * Used attributes are the 4 airquality types listed on the website as well as the Information View, the Navigationbar
 */

public class Toolbar implements ToolbarElement{
	
	private AirQualityData airQualityData;
	private InformationView informationview;
	private Navbar navbar;
	private SearchBar searchbar;

	/*
	 * Shows the whole toolbar with all other elements
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * shows the four data types
	 */
	public void showAQD() {
		
	}
	
	/*
	 * Shows the help icon
	 */
	public void showHelpIcon() {
		
	}
	
	/*
	 * Shows the Searchbar
	 */
	public void showSearchBar() {
		
	}
	
	/*
	 * Shows the Navigationbar
	 */
	public void showNavbar() {
		
	}
	
	/*
	 * Getter for the Information View/help view instance
	 * @return The Information View instance
	 */
	public InformationView getInformationview() {
		return informationview;
	}

	/*
	 * Setter for the Informationview instance
	 * @param The Invormationview instance
	 */
	public void setInformationview(InformationView informationview) {
		this.informationview = informationview;
	}

	/*
	 * Getter for the AirQualityData
	 * @return The specific AirQualityData instance
	 */
	public AirQualityData getAirQualityData() {
		return airQualityData;
	}

	/*
	 * Setter for the air quality data
	 * @param AirQualityData instance
	 */
	public void setAirQualityData(AirQualityData airQualityData) {
		this.airQualityData = airQualityData;
	}

	/*
	 * Getter for the navigationbar instance
	 * @return The Navigationbar instance
	 */
	public Navbar getNavbar() {
		return navbar;
	}

	/*
	 * Setter for the Navigationbar instance
	 * @param The Navbar instance
	 */
	public void setNavbar(Navbar navbar) {
		this.navbar = navbar;
	}

	/*
	 * Getter for the Searchbar instance 
	 * @return The Searchbar instance
	 */
	public SearchBar getSearchbar() {
		return searchbar;
	}

	/*
	 * Setter for the Searchbar instance
	 * @param The Searchbar instance
	 */
	public void setSearchbar(SearchBar searchbar) {
		this.searchbar = searchbar;
	}

	
		
}
