package de.visaq.view.elements.navbar;

/**
 * Shows the User links and definitions to the different functions and informations.
 */
public class Toolbar implements ToolbarElement {

    private boolean historicalView = false;

    /**
     * Constructor for the Navbar.
     */
    public Toolbar() {
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
    private void historicalData() {

        this.setHistoricalView(true);
        // TODO Auto-generated method stub
    }

    @Override
    public void show() {

    }

    public boolean isHistoricalView() {
        return historicalView;
    }

    private void setHistoricalView(boolean historicalView) {
        this.historicalView = historicalView;
    }
}
