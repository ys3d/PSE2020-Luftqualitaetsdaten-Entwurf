package de.visaq.view.elements;

import de.visaq.controller.CookieController;

/**
 * Banner that informs the User that VisAQ is using Cookies in accordance to EU law.
 */
public class CookieNotice {

    CookieController cookieController = new CookieController();
    public final boolean acceptance = false;

    public CookieNotice() {
    }

    public void popup() {

    }

    public void accept(boolean acceptance) {
        // cookieController.set(acceptance)
    }

}
