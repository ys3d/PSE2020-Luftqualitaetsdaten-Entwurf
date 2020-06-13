package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.ObservedProperty;

public class ObservedPropertyController extends SensorthingsController<ObservedProperty> {
	public ArrayList<ObservedProperty> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ObservedProperty> get(MultiNavigationLink<ObservedProperty> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public ObservedProperty get(Datastream datastream) {
		// TODO Auto-generated method stub
		return null;
	}

	public ObservedProperty get(SingleNavigationLink<ObservedProperty> navigationLink) {
		// TODO Auto-generated method stub
		return null;
	}

	public ObservedProperty get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservedProperty singleBuild(JSONObject json) {
		ObservedProperty observedProperty = new ObservedProperty(
				json.getString("@iot.id"),
				json.getString("@iot.selfLink"), 
				json.getString("description"), 
				json.getString("name"),
				UtilityController.buildProperties(json), 
				json.getString("definition"),
				new MultiOnlineLink<Datastream>(json.getString("Datastreams@iot.navigationLink")));
		return observedProperty;
	}
}
