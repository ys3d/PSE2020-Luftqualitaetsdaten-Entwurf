package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Thing;

/**
 *	Encapsulates the control over HistoricalLocation objects.
 */
public class HistoricalLocationController extends SensorthingsController<HistoricalLocation> {

	public ArrayList<HistoricalLocation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoricalLocation get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoricalLocation singleBuild(JSONObject json) {
		json = UtilityController.removeArrayWrapper(json);
		
		HistoricalLocation historicalLocation = new HistoricalLocation(
				json.getString("@iot.id"), 
				json.getString("@iot.selfLink"),
				UtilityController.buildTime(json, "time"),
				new SingleOnlineLink<Thing>(json.getString("Thing@iot.navigationLink")),
				new MultiOnlineLink<Location>(json.getString("Locations@iot.navigationLink")));
		return historicalLocation;
	}

}
