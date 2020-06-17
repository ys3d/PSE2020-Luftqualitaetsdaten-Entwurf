package de.visaq.view;

import java.awt.image.BufferedImage;

/**
 * InformationView creates the view using a helping overlay allowing the user to easier navigate
 * through the website. TODO
 */
public class InformationView extends View {

    private BufferedImage icon = null;

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    /**
     * Returns the icon.
     * 
     * @return The icon
     */
    public BufferedImage getIcon() {
        return icon;
    }

    /**
     * Setter for the icon.
     * 
     * @param The icon
     */
    private void setIcon(BufferedImage icon) {
        this.icon = icon;
    }
}
