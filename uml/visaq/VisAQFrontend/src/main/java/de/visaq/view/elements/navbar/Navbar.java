package de.visaq.view.elements.navbar;

import java.util.ArrayList;

import de.visaq.view.InformationView;
import de.visaq.view.NavbarObserver;
import de.visaq.view.ObservedNavbarSubject;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.airquality.ParticulateMatter;
import de.visaq.view.elements.toolbar.Toolbar;

/**
 * The Navbar shows the Navigationbar and gives access to the Help-View, Information-View (I am
 * using Hyphen here because you used it before but as I said it doesn't matter to me whether or not
 * we settle on hyphen), Searchbar and Language settings.
 */
public class Navbar implements ObservedNavbarSubject {
    public final AirQualityData[] airQualityDatas;
    public final InformationView informationView;
    public final Toolbar toolbar;
    public final SearchBar searchbar;
    public final ExpertViewFilter expertViewFilter;
    private boolean expertView = false;
    private AirQualityData currentAirQualityData;
    private ArrayList<NavbarObserver> observer;

    /**
     * Constructor for a new Navbar instance.
     * 
     * @param airQualityDatas The selectable Air Quality Data overlays.
     * @param informationView TODO
     * @param toolbar         The Toolbar instance.
     * @param searchbar       The Searchbar instance.
     */
    public Navbar(AirQualityData[] airQualityDatas, InformationView informationView,
            Toolbar toolbar, SearchBar searchbar, ExpertViewFilter expertViewFilter) {
        this.airQualityDatas = airQualityDatas;
        this.informationView = informationView;
        this.toolbar = toolbar;
        this.searchbar = searchbar;
        this.expertViewFilter = expertViewFilter;
        currentAirQualityData = new ParticulateMatter();
        observer = new ArrayList<NavbarObserver>();
    }

    /**
     * Shows the Searchbar.
     */
    public void show() {
        if (expertView) {
            expertViewFilter.show();
        }
        searchbar.show();
        // TODO Auto-generated method stub

    }

    /**
     * Shows the available Air Quality Data overlays.
     */
    public void showAirQualityDatas() {
        for (AirQualityData airQualityData : airQualityDatas) {
            airQualityData.getName();
        }
    }

    /**
     * Shows the help icon.
     */
    public void showHelpIcon() {
        informationView.getIcon();
    }

    /**
     * Shows the Toolbar.
     */
    public void openToolbar() {
        toolbar.show();
    }

    /**
     * Informs whether the Expert Mode is set.
     * 
     * @return The instance Expert View
     */
    public boolean isExpertview() {
        return expertView;
    }

    /**
     * Activates or Deactivates the Expert Mode.
     * 
     * @param expertview The instance Expert View
     */
    public void setExpertview(boolean expertview) {
        this.expertView = expertview;
    }

    public AirQualityData getCurrentAirQualityData() {
        return currentAirQualityData;
    }

    public void setCurrentAirQualityData(AirQualityData currentAirQualityData) {
        this.currentAirQualityData = currentAirQualityData;
    }

    @Override
    public void attach(NavbarObserver navbarObserver) {
        observer.add(navbarObserver);
    }

    @Override
    public void detach(NavbarObserver navbarObserver) {
        observer.remove(navbarObserver);

    }

    @Override
    public void notifyObserver() {
        for (NavbarObserver nb : observer) {
            nb.updateNavbar(searchbar, currentAirQualityData, expertView, expertViewFilter);
        }

    }
}
