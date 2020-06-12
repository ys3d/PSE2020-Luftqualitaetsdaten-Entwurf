package de.visaq.model.sensorthings;

import de.visaq.controller.link.SingleNavigationLink;

/**
 *	Encapsulates all Sensorthings objects.
 */
public abstract class Sensorthings {
	/**
	 * Unique identifier of the object.
	 */
	public final String id;
	/**
	 * Links to this object in the Sensorthings database.
	 */
	public final SingleNavigationLink<? extends Sensorthings> selfLink;

	/**
	 * Creates a new Sensorthings object with the given id and the specified database link.
	 * 
	 * @param id 		Unique identifier of the object that will be created.
	 * @param selfLink	Links to this object in the Sensorthings database.
	 */
	public Sensorthings(String id, SingleNavigationLink<? extends Sensorthings> selfLink) {
		this.id = id;
		this.selfLink = selfLink;
	}
}
