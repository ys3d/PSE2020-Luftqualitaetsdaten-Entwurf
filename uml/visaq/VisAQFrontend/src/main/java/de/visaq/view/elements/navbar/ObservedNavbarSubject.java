package de.visaq.view.elements.navbar;

import de.visaq.view.NavbarObserver;

public interface ObservedNavbarSubject {

    public void attach(NavbarObserver navbarObserver);

    public void detach(NavbarObserver navbarObserver);

    public void notifyObserver();
}
