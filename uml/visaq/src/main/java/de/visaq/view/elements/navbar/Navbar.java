package de.visaq.view.elements.navbar;

import de.visaq.view.InformationView;

import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.toolbar.Toolbar;

/**
 * The Toolbar shows the Navigationbar and gives access to the Help-View, Information-View (I am
 * using Hyphen here because you used it before but as I said it doesn't matter to me whether or not
 * we settle on hyphen), Searchbar and Language settings.
 */
public class Navbar {
    public final AirQualityData[] airQualityDatas;
    public final InformationView informationView;
    public final Toolbar toolbar;
    public final SearchBar searchbar;
    public final ExpertViewFilter expertViewFilter;
    private boolean expertView = false;

    /**
     * Constructor for a new Toolbar instance.
     * 
     * @param airQualityDatas The selectable Air Quality Data overlays.
     * @param informationView TODO
     * @param toolbar         The Toolbar instance.
     * @param searchbar       The Searchbar instance.
     */
    public Navbar(AirQualityData[] airQualityDatas, InformationView informationView, Toolbar toolbar,
            SearchBar searchbar, ExpertViewFilter expertViewFilter) {
        super();
        this.airQualityDatas = airQualityDatas;
        this.informationView = informationView;
        this.toolbar = toolbar;
        this.searchbar = searchbar;
        this.expertViewFilter = expertViewFilter;
    }


    public void show() {
    	if(expertView)	{
    		expertViewFilter.show(); 
    	}
        // TODO Auto-generated method stub

    }

    /**
     * Shows the available Air Quality Data overlays.
     */
    public void showAirQualityDatas() {

    }

    /**
     * Shows the help icon.
     */
    public void showHelpIcon() {

    }

    /**
     * Shows the Searchbar.
     */
    public void showSearchBar() {

    }

    /**
     * Shows the Navigationbar.
     */
    public void showNavbar() {

    }

	public boolean isExpertview() {
		return expertView;
	}

	public void setExpertview(boolean expertview) {
		this.expertView = expertview;
	}
}
