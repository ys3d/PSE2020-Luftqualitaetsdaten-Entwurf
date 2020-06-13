package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Thing;

/**
 * Encapsulates the control over Location objects.
 */
public class LocationController extends SensorthingsController<Location> {

	public ArrayList<Location> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Location> get(MultiNavigationLink<Location> navigationLink) {
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

	@Override
	public Location singleBuild(JSONObject json) {
		Location location = new Location(
				json.getString("@iot.id"), 
				json.getString("@iot.selfLink"),
				json.getString("name"), 
				json.getString("description"), 
				UtilityController.buildLocationPoint(json),
				new MultiOnlineLink<HistoricalLocation>(json.getString("HistoricalLocations@iot.navigationLink")),
				new MultiOnlineLink<Thing>(json.getString("Things@iot.navigationLink")));
		return location;
	}

}
