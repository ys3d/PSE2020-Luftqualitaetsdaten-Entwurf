package de.visaq.view.elements;

import de.visaq.view.InformationView;
import de.visaq.view.elements.AirQuality.AirQualityData;

/*
 * The toolbar. It shows the Navigationbar through which you can access further functionalities.
 * Also located here is the the Help/Information View, the language setting and the searchbar.
 * This class imports the InformationView from the view package to use it in the Toolbar.
 * Used attributes are the 4 airquality types listed on the website as well as the Informationview, the navigationbar
 */

public class Toolbar implements ToolbarElement{
	
	private AirQualityData airQualityData;
	private InformationView informationview;
	private Navbar navbar;
	private SearchBar searchbar;

	/*
	 * shows the whole toolbar with all other elements
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
	 * shows the help icon
	 */
	public void showHelpIcon() {
		
	}
	
	/*
	 * shows the searchbar
	 */
	public void showSearchBar() {
		
	}
	
	/*
	 * shows the navigationbar
	 */
	public void showNavbar() {
		
	}
	
	/*
	 * getter for the informationview/help view
	 * @return the information view
	 */
	public InformationView getInformationview() {
		return informationview;
	}

	/*
	 * setter for the information view
	 * @param informationview set here
	 */
	public void setInformationview(InformationView informationview) {
		this.informationview = informationview;
	}

	/*
	 * getter for the air quality data
	 * @return the data
	 */
	public AirQualityData getAirQualityData() {
		return airQualityData;
	}

	/*
	 * setter for the air quality data
	 * @param airQualityData set here
	 */
	public void setAirQualityData(AirQualityData airQualityData) {
		this.airQualityData = airQualityData;
	}

	/*
	 * getter for the navigation bar
	 * @return the navigation bar
	 */
	public Navbar getNavbar() {
		return navbar;
	}

	/*
	 * setter for the navigation bar
	 * @param navbar set here
	 */
	public void setNavbar(Navbar navbar) {
		this.navbar = navbar;
	}

	/*
	 * getter for the searchbar
	 * @return the searchbar
	 */
	public SearchBar getSearchbar() {
		return searchbar;
	}

	/*
	 * setter for the searchbar
	 * @param searchbar set here
	 */
	public void setSearchbar(SearchBar searchbar) {
		this.searchbar = searchbar;
	}

	
		
}
