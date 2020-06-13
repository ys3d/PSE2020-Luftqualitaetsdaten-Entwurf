package de.visaq.controller;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.Sensor;
import de.visaq.model.sensorthings.Thing;

/**
 *	Encapsulates the control over Sensor objects.
 */
public class SensorController implements SensorthingsController<Sensor> {
	/**
	 * Retrieves all Sensor objects associated with the specified Thing.
	 * 
	 * @param thing	Thing the Sensor objects are associated with.
	 * @return		An array of Sensor objects that were retrieved.
	 */
	public Sensor[] get(Thing thing) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Sensor[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sensor[] get(MultiNavigationLink<Sensor> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Retrieves the Sensor object assoviated with the specified Datastream.
	 * 
	 * @param datastream	Datastream the Sensor object is associated with.
	 * @return				The Sensor object that was retrieved.
	 */
	public Sensor get(Datastream datastream) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sensor get(SingleNavigationLink<Sensor> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sensor get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sensor build(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}
}
