package de.visaq.controller.link;

import de.visaq.model.sensorthings.Sensorthings;

public interface NavigationLink<T extends Sensorthings> {
	public T get();
}
