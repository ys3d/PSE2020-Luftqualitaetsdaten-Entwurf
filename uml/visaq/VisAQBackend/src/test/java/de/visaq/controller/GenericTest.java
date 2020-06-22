package de.visaq.controller;

import org.junit.Test;

import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Observation;
import de.visaq.model.sensorthings.ObservedProperty;
import de.visaq.model.sensorthings.Sensor;
import de.visaq.model.sensorthings.Thing;

public class GenericTest {
    @Test
    public void testSingleThingGet() {
        SingleOnlineLink<Thing> sol = new SingleOnlineLink<Thing>("/Things?$top=1");
        sol.get(new ThingController());
        sol.get(new ThingController());
    }

    @Test
    public void testSingleSensorGet() {
        SingleOnlineLink<Sensor> sol = new SingleOnlineLink<Sensor>("/Sensors?$top=1");
        sol.get(new SensorController());
        sol.get(new SensorController());
    }

    @Test
    public void testSingleObservedPropertyGet() {
        SingleOnlineLink<ObservedProperty> sol = new SingleOnlineLink<ObservedProperty>(
                "/ObservedProperties?$top=1");
        sol.get(new ObservedPropertyController());
        sol.get(new ObservedPropertyController());
    }

    @Test
    public void testSingleObservationGet() {
        SingleOnlineLink<Observation> sol = new SingleOnlineLink<Observation>(
                "/Observations?$top=1&$skip=1");
        sol.get(new ObservationController());
        sol.get(new ObservationController());
    }

    @Test
    public void testSingleLocationGet() {
        SingleOnlineLink<Location> sol = new SingleOnlineLink<Location>("/Locations?$top=1");
        sol.get(new LocationController());
        sol.get(new LocationController());
    }

    @Test
    public void testSingleHistoricalLocationGet() {
        SingleOnlineLink<HistoricalLocation> sol = new SingleOnlineLink<HistoricalLocation>(
                "/HistoricalLocations?$top=1");
        sol.get(new HistoricalLocationController());
        sol.get(new HistoricalLocationController());
    }

    @Test
    public void testSingleDatastreamGet() {
        SingleOnlineLink<Datastream> sol = new SingleOnlineLink<Datastream>("/Datastreams?$top=1");
        sol.get(new DatastreamController());
        sol.get(new DatastreamController());
    }

    @Test
    public void testMultiThingGet() {
        MultiOnlineLink<Thing> mol = new MultiOnlineLink<Thing>("/Things?$top=2");
        mol.get(new ThingController());
        mol.get(new ThingController());
    }

    @Test
    public void testMultiSensorGet() {
        MultiOnlineLink<Sensor> mol = new MultiOnlineLink<Sensor>("/Sensors?$top=2");
        mol.get(new SensorController());
        mol.get(new SensorController());
    }

    @Test
    public void testMultiObservedPropertyGet() {
        MultiOnlineLink<ObservedProperty> mol = new MultiOnlineLink<ObservedProperty>(
                "/ObservedProperties?$top=2");
        mol.get(new ObservedPropertyController());
        mol.get(new ObservedPropertyController());
    }

    @Test
    public void testMultiObservationGet() {
        MultiOnlineLink<Observation> mol = new MultiOnlineLink<Observation>("/Observations?$top=2");
        mol.get(new ObservationController());
        mol.get(new ObservationController());
    }

    @Test
    public void testMultiLocationGet() {
        MultiOnlineLink<Location> mol = new MultiOnlineLink<Location>("/Locations?$top=2");
        mol.get(new LocationController());
        mol.get(new LocationController());
    }

    @Test
    public void testMultiHistoricalLocationGet() {
        MultiOnlineLink<HistoricalLocation> mol = new MultiOnlineLink<HistoricalLocation>(
                "/HistoricalLocations?$top=2");
        mol.get(new HistoricalLocationController());
        mol.get(new HistoricalLocationController());
    }

    @Test
    public void testMultiDatastreamGet() {
        MultiOnlineLink<Datastream> mol = new MultiOnlineLink<Datastream>("/Datastreams?$top=2");
        mol.get(new DatastreamController());
        mol.get(new DatastreamController());
    }
}
