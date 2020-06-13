package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.Observation;
import de.visaq.model.sensorthings.ObservedProperty;
import de.visaq.model.sensorthings.Sensor;
import de.visaq.model.sensorthings.Thing;

/**
 *	Encapsulates the control over Datastream objects.
 */
public class DatastreamController extends SensorthingsController<Datastream> {

	/**
	 * Retrieves all Datastream objects of the specified Thing.
	 * @param thing	Thing the Datastream objects are associated with.
	 * @return		An array of Datastream objects that were retrieved.
	 */
	public ArrayList<Datastream> get(Thing thing) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * Retrieves all Datastream objects of the specified Sensor.
	 * 
	 * @param sensor	Sensor the Datastream objects are associated with.
	 * @return			An array of Datastream objects that were retrieved.
	 */
	public ArrayList<Datastream> get(Sensor sensor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Datastream> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Datastream> get(MultiNavigationLink<Datastream> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * Retrieves the Datastream object for the observed property of the specified Thing.
	 * 
	 * @param thing				Thing the Datastream is associated with.
	 * @param observedProperty	Observed Property the Datastream is associated with.
	 * @return					The Datastream object that was retrieved.
	 */
	public Datastream get(Thing thing, ObservedProperty observedProperty) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Retrieves the Datastream object for the observed property of the specified Sensor.
	 * 
	 * @param sensor			Sensor the Datastream is associated with.
	 * @param observedProperty	Observed Property the Datastream is associated with.
	 * @return					The Datastream object that was retrieved.
	 */
	public Datastream get(Sensor sensor, ObservedProperty observedProperty) {
		// TODO Auto-generated method stub
		return null;
	}

	public Datastream get(SingleNavigationLink<Datastream> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Datastream get(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Datastream singleBuild(JSONObject json) {
		Datastream datastream = new Datastream(
				json.getString("@iot.id"), 
				json.getString("@iot.selfLink"),
				json.getString("name"),
				json.getString("description"),
				json.getJSONObject("properties").toMap(),
				json.getString("observationType"),
				UtilityController.buildTime(json, "phenomenomTime"), 
				UtilityController.buildTime(json, "resultTime"), 
				new SingleOnlineLink<Sensor>(json.getString("Sensor@iot.navigationLink")),
				new SingleOnlineLink<Thing>(json.getString("Thing@iot.navigationLink")),
				new MultiOnlineLink<Observation>(json.getString("Observations@iot.navigationLink")),
				UtilityController.buildUnitOfMeasurement(json.getJSONObject("unitOfMeasurement")),
				new SingleOnlineLink<ObservedProperty>(json.getString("ObservedProperty@iot.navigationLink"))
				);
		return datastream;
	}
}
