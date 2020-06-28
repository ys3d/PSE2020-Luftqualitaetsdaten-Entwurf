package de.visaq.view;

import java.util.ArrayList;

import de.visaq.view.elements.navbar.Navbar;

/**
 * Main class of the Frontend.
 */
public class VisAQ {
    private static VisAQ instance = new VisAQ();

    /**
     * Gets the current Language instance.
     * 
     * @return The Language instance.
     */
    public static synchronized VisAQ getInstance() {
        VisAQ.instance = VisAQ.instance == null ? new VisAQ()
                : VisAQ.instance;
        return VisAQ.instance;
    }

    /**
     * Sets the current Language instance.
     * 
     * @param language The Language instance.
     */
    public static synchronized void setInstance(VisAQ visAQ) {
        VisAQ.instance = visAQ;
    }
    
    ArrayList<View> view = null;
    Navbar navbar;

    /**
     * Main method of the Frontend.
     * 
     * @param args Input
     */
    public static void main(String[] args) {
        setInstance(new VisAQ());
    }
    
    public void userInput() {
        navbar.notifyObserver();
        navbar.show();
        navbar.showView();        
    }
}
