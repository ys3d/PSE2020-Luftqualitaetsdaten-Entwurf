package de.visaq.view;

import java.util.ArrayList;

import de.visaq.controller.DatastreamController;
import de.visaq.controller.HistoricalLocationController;
import de.visaq.controller.LocationController;
import de.visaq.controller.ObservationController;
import de.visaq.controller.ObservedPropertyController;
import de.visaq.controller.SensorController;
import de.visaq.controller.ThingController;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Observation;
import de.visaq.model.sensorthings.ObservedProperty;
import de.visaq.model.sensorthings.Sensor;
import de.visaq.model.sensorthings.Thing;
import de.visaq.view.elements.Toolbar;

public abstract class VisAQ {

	ArrayList<View> view = null;
	Toolbar toolbar;

	public static void main(String[] args) {
		SingleOnlineLink<Thing> sol = new SingleOnlineLink<Thing>("/Things?$top=1");
		sol.get(new ThingController());
		sol.get(new ThingController());
		
		SingleOnlineLink<Sensor> sol1 = new SingleOnlineLink<Sensor>("/Sensors?$top=1");
		sol1.get(new SensorController());
		sol1.get(new SensorController());
		
		SingleOnlineLink<ObservedProperty> sol2 = new SingleOnlineLink<ObservedProperty>("/ObservedProperties?$top=1");
		sol2.get(new ObservedPropertyController());
		sol2.get(new ObservedPropertyController());
		
		SingleOnlineLink<Observation> sol3 = new SingleOnlineLink<Observation>("/Observations?$top=1&$skip=1");
		sol3.get(new ObservationController());
		sol3.get(new ObservationController());
		
		SingleOnlineLink<Location> sol4 = new SingleOnlineLink<Location>("/Locations?$top=1");
		sol4.get(new LocationController());
		sol4.get(new LocationController());
		
		SingleOnlineLink<HistoricalLocation> sol5 = new SingleOnlineLink<HistoricalLocation>("/HistoricalLocations?$top=1");
		sol5.get(new HistoricalLocationController());
		sol5.get(new HistoricalLocationController());
		
		SingleOnlineLink<Datastream> sol6 = new SingleOnlineLink<Datastream>("/Datastreams?$top=1");
		sol6.get(new DatastreamController());
		sol6.get(new DatastreamController());
		
		MultiOnlineLink<Thing> mol = new MultiOnlineLink<Thing>("/Things?$top=2");
		mol.get(new ThingController());
		mol.get(new ThingController());
		
		MultiOnlineLink<Sensor> mol1 = new MultiOnlineLink<Sensor>("/Sensors?$top=2");
		mol1.get(new SensorController());
		mol1.get(new SensorController());
		
		MultiOnlineLink<ObservedProperty> mol2 = new MultiOnlineLink<ObservedProperty>("/ObservedProperties?$top=2");
		mol2.get(new ObservedPropertyController());
		mol2.get(new ObservedPropertyController());
		
		MultiOnlineLink<Observation> mol3 = new MultiOnlineLink<Observation>("/Observations?$top=2");
		mol3.get(new ObservationController());
		mol3.get(new ObservationController());
		
		MultiOnlineLink<Location> mol4 = new MultiOnlineLink<Location>("/Locations?$top=2");
		mol4.get(new LocationController());
		mol4.get(new LocationController());
		
		MultiOnlineLink<HistoricalLocation> mol5 = new MultiOnlineLink<HistoricalLocation>("/HistoricalLocations?$top=2");
		mol5.get(new HistoricalLocationController());
		mol5.get(new HistoricalLocationController());
		
		MultiOnlineLink<Datastream> mol6 = new MultiOnlineLink<Datastream>("/Datastreams?$top=2");
		mol6.get(new DatastreamController());
		mol6.get(new DatastreamController());
	}

}
