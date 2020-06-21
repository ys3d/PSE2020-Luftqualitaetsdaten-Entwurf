package de.visaq.view;

import def.leaflet.l.Icon;

/**
 * InformationView creates the view using a helping overlay allowing the user to easier navigate
 * through the website. TODO
 */
public class InformationView extends View {

    private Icon icon = null;

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    /**
     * Returns the icon.
     * 
     * @return The icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Setter for the icon.
     * 
     * @param The icon
     */
    private void setIcon(Icon icon) {
        this.icon = icon;
    }
}
