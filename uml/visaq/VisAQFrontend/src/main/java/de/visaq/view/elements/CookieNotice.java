package de.visaq.view.elements;

import de.visaq.controller.CookieController;

/**
 * Banner that informs the User that VisAQ is using Cookies in accordance to EU law.
 */
public class CookieNotice {

    CookieController cookieController = new CookieController();
    public final boolean acceptance = false;

    /**
     * Sole constructor of the class Cookie Notice.
     */
    public CookieNotice() {
    }

    /**
     * Opens the Popup Window Cookie Notice.
     */
    public void popup() {

    }

    /**
     * The Users acceptance of the CookieNotice.
     * 
     * @param acceptance The instance of acceptance
     */
    public void acceptance(boolean acceptance) {
        // cookieController.set(acceptance)
    }

}
