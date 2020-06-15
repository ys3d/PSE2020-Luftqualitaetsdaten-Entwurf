package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.Observation;

/**
 *	Encapsulates the control over Observation objects.
 */
public class ObservationController extends SensorthingsController<Observation> {
	public ArrayList<Observation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Observation get(Datastream datastream) {
		// TODO Auto-generated method stub
		return null;
	}

	public Observation get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Observation singleBuild(JSONObject json) {
		try {
			json = UtilityController.removeArrayWrapper(json);
			
			Observation observation = new Observation(
					json.getString("@iot.id"), 
					json.getString("@iot.selfLink"),
					UtilityController.buildTime(json, "phenomenonTime"), 
					json.getDouble("result"), 
					UtilityController.buildTime(json, "resultTime"), 
					new SingleOnlineLink<Datastream>(json.getString("Datastream@iot.navigationLink")));
			return observation;
		} catch (JSONException e) {
			return null;
		}
	}
}
