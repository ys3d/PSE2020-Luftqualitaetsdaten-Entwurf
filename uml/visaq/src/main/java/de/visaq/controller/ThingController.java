package de.visaq.controller;

import java.awt.Polygon;
import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Thing;

/**
 * Encapsulates the control over Thing objects.
 */
public class ThingController extends SensorthingsController<Thing> {
	/**
	 * Retrieves the Thing objects spatially located inside the specified polygon.
	 * 
	 * @param polygon Polygon the Thing objects are located inside of.
	 * @return An array of Thing objects that were retrieved.
	 */
	public ArrayList<Thing> get(Polygon polygon) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Thing> getAll() {
		MultiOnlineLink<Thing> multiLink = new MultiOnlineLink<Thing>("http://api.smartaq.net/v1.0/Things?$top=3");
		return multiLink.get(this);
	}

	public ArrayList<Thing> get(MultiNavigationLink<Thing> navigationLink) {
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

	@Override
	public Thing singleBuild(JSONObject json) {
		Thing thing = new Thing(
				json.getString("@iot.id"), 
				json.getString("@iot.selfLink"),
				json.getString("description"), 
				json.getString("name"), 
				UtilityController.buildProperties(json),
				new MultiOnlineLink<Datastream>(json.getString("Datastreams@iot.navigationLink")),
				new MultiOnlineLink<HistoricalLocation>(json.getString("HistoricalLocations@iot.navigationLink")),
				new MultiOnlineLink<Location>(json.getString("Locations@iot.navigationLink")));
		return thing;
	}
}
