package de.visaq.view.elements.toolbar;

import java.util.ArrayList;

import de.visaq.view.NavbarObserver;
import de.visaq.view.ObservedToolbarSubject;
import de.visaq.view.ToolbarObserver;

/**
 * Shows the User links and definitions to the different functions and informations.
 */
public class Toolbar implements ToolbarElement, ObservedToolbarSubject {

    private boolean historicalView;
    private Timeline timeline;
    private ArrayList<ToolbarObserver> observer;

    /**
     * Constructor for the Navbar.
     */
    public Toolbar() {
        Timeline timeline = new Timeline();
        observer = new ArrayList<ToolbarObserver>();
        // TODO Auto-generated method stub
    }

    /**
     * Contains the link to the DIY site.
     */
    private void diy() {
        // TODO Auto-generated method stub
    }

    /**
     * Contains the definition for PM.
     */
    private void pmDefiniton() {
        // TODO Auto-generated method stub
    }

    /**
     * Contains the causes for PM.
     */
    private void causesPM() {
        // TODO Auto-generated method stub
    }

    /**
     * Contains a link to the site of smartAQNet.
     */
    private void smartAqNet() {
        // TODO Auto-generated method stub
    }

    /**
     * Will later open the Timeline with historical Data on the Map.
     */
    private void historicalData(boolean historicalView) {
        this.historicalView = historicalView;
        timeline.show();
        // TODO Auto-generated method stub
    }

    @Override
    public void show() {

    }

    @Override
    public void attach(ToolbarObserver toolbarObserver) {
        observer.add(toolbarObserver);

    }

    @Override
    public void detach(ToolbarObserver toolbarObserver) {
        observer.remove(toolbarObserver);
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub

    }
}
