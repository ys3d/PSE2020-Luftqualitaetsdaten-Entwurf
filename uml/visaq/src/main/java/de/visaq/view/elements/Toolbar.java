package de.visaq.view.elements;

import de.visaq.view.InformationView;
import de.visaq.view.elements.AirQuality.AirQualityData;

/*
 * The toolbar. It shows the Navigationbar through which you can access further functionalities.
 * Also located here is the the Help/Information View, the language setting and the searchbar.
 * This class imports the InformationView from the view package to use it in the Toolbar.
 *   
 */

public class Toolbar implements ToolbarElement{
	/*
	 * Used attributes are the 4 airquality types listed on the website as well as the Informationview, the navigationbar
	 * and the searchbar.
	 */
	private AirQualityData airQualityData;
	private InformationView informationview;
	private Navbar navbar;
	private SearchBar searchbar;
	/*
	 * The different show methods show the different icons or features on the Toolbar.
	 */
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void showAQD() {
		
	}
	
	public void showHelpIcon() {
		
	}
	
	public void showSearchBar() {
		
	}
	
	public void showNavbar() {
		
	}
	/*
	 * The setter and getter are used to guarante an safe use of the different attributes used in this class.
	 */

	public InformationView getInformationview() {
		return informationview;
	}

	public void setInformationview(InformationView informationview) {
		this.informationview = informationview;
	}

	public AirQualityData getAirQualityData() {
		return airQualityData;
	}

	public void setAirQualityData(AirQualityData airQualityData) {
		this.airQualityData = airQualityData;
	}

	public Navbar getNavbar() {
		return navbar;
	}

	public void setNavbar(Navbar navbar) {
		this.navbar = navbar;
	}

	public SearchBar getSearchbar() {
		return searchbar;
	}

	public void setSearchbar(SearchBar searchbar) {
		this.searchbar = searchbar;
	}

	
		
}
