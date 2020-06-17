package de.visaq.view.elements;

import de.visaq.view.InformationView;
import de.visaq.view.elements.airquality.AirQualityData;

/**
 * The Toolbar shows the Navigationbar and gives access to the Help-View, Information-View (I am
 * using Hyphen here because you used it before but as I said it doesn't matter to me whether or not
 * we settle on hyphen), Searchbar and Language settings.
 */
public class Toolbar implements ToolbarElement {
    public final AirQualityData[] airQualityDatas;
    public final InformationView informationView;
    public final Navbar navbar;
    public final SearchBar searchbar;

    /**
     * Constructor for a new Toolbar instance.
     * 
     * @param airQualityDatas The selectable Air Quality Data overlays.
     * @param informationView TODO
     * @param navbar          The Navbar instance.
     * @param searchbar       The Searchbar instance.
     */
    public Toolbar(AirQualityData[] airQualityDatas, InformationView informationView, Navbar navbar,
            SearchBar searchbar) {
        super();
        this.airQualityDatas = airQualityDatas;
        this.informationView = informationView;
        this.navbar = navbar;
        this.searchbar = searchbar;
    }

    @Override
    public void show() {
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
}
