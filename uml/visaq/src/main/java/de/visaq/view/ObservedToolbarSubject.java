package de.visaq.view;

public interface ObservedToolbarSubject {

	public void attach(ToolbarObserver toolbarObserver);
	
	public void detach(ToolbarObserver toolbarObserver);
	
	public void notifyObserver();
}
