package de.visaq.view;

public abstract class View {
	final Language language;
	
	public View(Language language) {
		super();
		this.language = language;
	}

	public abstract void show();
}
