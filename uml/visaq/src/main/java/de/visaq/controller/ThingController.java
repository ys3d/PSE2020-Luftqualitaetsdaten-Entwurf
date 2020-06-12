package de.visaq.controller;

import java.awt.Polygon;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Thing;

/**
 *	Encapsulates the control over Thing objects.
 */
public class ThingController implements SensorthingsController<Thing> {
	/**
	 * Retrieves the Thing objects spatially located inside the specified polygon.
	 * 
	 * @param polygon	Polygon the Thing objects are located inside of.
	 * @return			An array of Thing objects that were retrieved.
	 */
	public Thing[] get(Polygon polygon) {
		// TODO Auto-generated method stub
		return null;
	}

	public Thing[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Thing[] get(MultiNavigationLink<Thing> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Thing get(SingleNavigationLink<Thing> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Thing get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Thing build(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}
}
