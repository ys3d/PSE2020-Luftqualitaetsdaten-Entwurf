package de.visaq.view.elements;

import de.visaq.view.InformationView;

public class Toolbar implements Element{
	
	private AirQualityData airQualityData;
	private InformationView informationview;
	private Navbar navbar;
	private SearchBar searchbar;
	
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
