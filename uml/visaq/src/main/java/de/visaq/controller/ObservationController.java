package de.visaq.controller;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.Observation;

/**
 *	Encapsulates the control over Observation objects.
 */
public class ObservationController implements SensorthingsController<Observation> {
	public Observation[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Observation[] get(MultiNavigationLink<Observation> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Observation get(Datastream datastream) {
		// TODO Auto-generated method stub
		return null;
	}

	public Observation get(SingleNavigationLink<Observation> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public Observation get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Observation build(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}
}
