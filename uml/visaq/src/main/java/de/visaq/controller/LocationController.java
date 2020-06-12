package de.visaq.controller;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Location;

/**
 *	Encapsulates the control over Location objects.
 */
public class LocationController implements SensorthingsController<Location> {

	public Location[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location[] get(MultiNavigationLink<Location> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Location get(SingleNavigationLink<Location> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Location get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Location build(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
