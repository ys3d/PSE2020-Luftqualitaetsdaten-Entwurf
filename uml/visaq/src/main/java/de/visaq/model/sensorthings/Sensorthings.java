package de.visaq.model.sensorthings;

import de.visaq.controller.link.SingleNavigationLink;

public abstract class Sensorthings {
	public final String id;
	public final SingleNavigationLink<? extends Sensorthings> selfLink;

	public Sensorthings(String id, SingleNavigationLink<? extends Sensorthings> selfLink) {
		this.id = id;
		this.selfLink = selfLink;
	}
}
