package de.visaq.view.elements.navbar;

import java.util.ArrayList;

import de.visaq.view.NavbarObserver;
import de.visaq.view.View;
import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.elements.airquality.ParticulateMatter;

/**
 * The Navbar shows the Navigation Bar and gives access to the Air Quality Data, Toolbar, Expert
 * View Filter, Help-View, Information-View, Searchbar and Language settings.
 */
public class Navbar implements ObservedNavbarSubject, NavbarElement {
    public final AirQualityData[] airQualityDatas;
    public final Toolbar toolbar;
    public final SearchBar searchbar;
    public final ExpertViewFilter expertViewFilter;
    private boolean expertMapView = false;
    private AirQualityData currentAirQualityData;
    private View currentView;
    private ArrayList<NavbarObserver> observer;

    /**
     * Constructor for a new Navbar instance.
     * 
     * @param airQualityDatas  The selectable Air Quality Data overlays.
     * @param currentView      The current View
     * @param views             The Views
     */
    public Navbar(AirQualityData[] airQualityDatas, View currentView, ArrayList<View> views) {
        this.airQualityDatas = airQualityDatas;
        this.currentAirQualityData = new ParticulateMatter("TODO");
        this.currentView = currentView;
        this.observer = new ArrayList<NavbarObserver>();
        for (NavbarObserver view : views) {
            this.observer.add(view);
        }
        this.toolbar = new Toolbar();
        this.searchbar = new SearchBar();
        this.expertViewFilter = new ExpertViewFilter();

    }

    @Override
    public void show() {
        if (expertMapView) {
            expertViewFilter.show();
        }
        showAirQualityDatas();
        searchbar.show();
        // TODO Auto-generated method stub
    }

    /**
     * Shows the Toolbar.
     */
    public void openToolbar() {
        toolbar.show();
    }
    
    /**
     * Activates the current View.
     */
    public void showView() {
        currentView.show();
    }

    /**
     * Sets the instance of the current Air Quality Data.
     * 
     * @param currentAirQualityData A instance of Air Quality Data.
     */
    public void setCurrentAirQualityData(AirQualityData currentAirQualityData) {
        this.currentAirQualityData = currentAirQualityData;
        notifyObserver();
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
            nb.update(searchbar, currentAirQualityData, expertMapView, expertViewFilter,
                    toolbar.isHistoricalMapView());
        }

    }
    
    /**
     * Shows the available Air Quality Data Overlays.
     */
    private void showAirQualityDatas() {
        for (AirQualityData airQualityData : airQualityDatas) {
            String name = airQualityData.name;
        }
    }
   
    /**
     * Sets the current View.
     * 
     * @param view  The current View
     */
    private void setCurrentView(View view)   {
        currentView.show();
    }   
}
