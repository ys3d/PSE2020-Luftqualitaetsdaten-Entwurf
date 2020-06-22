package de.visaq.view;

public interface ObservedNavbarSubject {

	public void attach(NavbarObserver navbarObserver);
	
	public void detach(NavbarObserver navbarObserver);
	
	public void notifyObserver();
}
