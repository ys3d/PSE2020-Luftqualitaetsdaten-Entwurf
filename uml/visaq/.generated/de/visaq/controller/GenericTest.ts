/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    export class GenericTest {
        public testSingleThingGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Thing> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Thing>("/Things?$top=1"));
            sol.get(new de.visaq.controller.ThingController());
            sol.get(new de.visaq.controller.ThingController());
        }

        public testSingleSensorGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Sensor> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Sensor>("/Sensors?$top=1"));
            sol.get(new de.visaq.controller.SensorController());
            sol.get(new de.visaq.controller.SensorController());
        }

        public testSingleObservedPropertyGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.ObservedProperty> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.ObservedProperty>("/ObservedProperties?$top=1"));
            sol.get(new de.visaq.controller.ObservedPropertyController());
            sol.get(new de.visaq.controller.ObservedPropertyController());
        }

        public testSingleObservationGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Observation> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Observation>("/Observations?$top=1&$skip=1"));
            sol.get(new de.visaq.controller.ObservationController());
            sol.get(new de.visaq.controller.ObservationController());
        }

        public testSingleLocationGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Location> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Location>("/Locations?$top=1"));
            sol.get(new de.visaq.controller.LocationController());
            sol.get(new de.visaq.controller.LocationController());
        }

        public testSingleHistoricalLocationGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.HistoricalLocation> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.HistoricalLocation>("/HistoricalLocations?$top=1"));
            sol.get(new de.visaq.controller.HistoricalLocationController());
            sol.get(new de.visaq.controller.HistoricalLocationController());
        }

        public testSingleDatastreamGet() {
            let sol : de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Datastream> = <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Datastream>("/Datastreams?$top=1"));
            sol.get(new de.visaq.controller.DatastreamController());
            sol.get(new de.visaq.controller.DatastreamController());
        }

        public testMultiThingGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Thing> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Thing>("/Things?$top=2"));
            mol.get(new de.visaq.controller.ThingController());
            mol.get(new de.visaq.controller.ThingController());
        }

        public testMultiSensorGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Sensor> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Sensor>("/Sensors?$top=2"));
            mol.get(new de.visaq.controller.SensorController());
            mol.get(new de.visaq.controller.SensorController());
        }

        public testMultiObservedPropertyGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.ObservedProperty> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.ObservedProperty>("/ObservedProperties?$top=2"));
            mol.get(new de.visaq.controller.ObservedPropertyController());
            mol.get(new de.visaq.controller.ObservedPropertyController());
        }

        public testMultiObservationGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Observation> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Observation>("/Observations?$top=2"));
            mol.get(new de.visaq.controller.ObservationController());
            mol.get(new de.visaq.controller.ObservationController());
        }

        public testMultiLocationGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location>("/Locations?$top=2"));
            mol.get(new de.visaq.controller.LocationController());
            mol.get(new de.visaq.controller.LocationController());
        }

        public testMultiHistoricalLocationGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.HistoricalLocation> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.HistoricalLocation>("/HistoricalLocations?$top=2"));
            mol.get(new de.visaq.controller.HistoricalLocationController());
            mol.get(new de.visaq.controller.HistoricalLocationController());
        }

        public testMultiDatastreamGet() {
            let mol : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream>("/Datastreams?$top=2"));
            mol.get(new de.visaq.controller.DatastreamController());
            mol.get(new de.visaq.controller.DatastreamController());
        }
    }
    GenericTest["__class"] = "de.visaq.controller.GenericTest";

}

