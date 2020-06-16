/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller) {
            var GenericTest = (function () {
                function GenericTest() {
                }
                GenericTest.prototype.testSingleThingGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/Things?$top=1"));
                    sol.get(new de.visaq.controller.ThingController());
                    sol.get(new de.visaq.controller.ThingController());
                };
                GenericTest.prototype.testSingleSensorGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/Sensors?$top=1"));
                    sol.get(new de.visaq.controller.SensorController());
                    sol.get(new de.visaq.controller.SensorController());
                };
                GenericTest.prototype.testSingleObservedPropertyGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/ObservedProperties?$top=1"));
                    sol.get(new de.visaq.controller.ObservedPropertyController());
                    sol.get(new de.visaq.controller.ObservedPropertyController());
                };
                GenericTest.prototype.testSingleObservationGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/Observations?$top=1&$skip=1"));
                    sol.get(new de.visaq.controller.ObservationController());
                    sol.get(new de.visaq.controller.ObservationController());
                };
                GenericTest.prototype.testSingleLocationGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/Locations?$top=1"));
                    sol.get(new de.visaq.controller.LocationController());
                    sol.get(new de.visaq.controller.LocationController());
                };
                GenericTest.prototype.testSingleHistoricalLocationGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/HistoricalLocations?$top=1"));
                    sol.get(new de.visaq.controller.HistoricalLocationController());
                    sol.get(new de.visaq.controller.HistoricalLocationController());
                };
                GenericTest.prototype.testSingleDatastreamGet = function () {
                    var sol = (new de.visaq.controller.link.SingleOnlineLink("/Datastreams?$top=1"));
                    sol.get(new de.visaq.controller.DatastreamController());
                    sol.get(new de.visaq.controller.DatastreamController());
                };
                GenericTest.prototype.testMultiThingGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/Things?$top=2"));
                    mol.get(new de.visaq.controller.ThingController());
                    mol.get(new de.visaq.controller.ThingController());
                };
                GenericTest.prototype.testMultiSensorGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/Sensors?$top=2"));
                    mol.get(new de.visaq.controller.SensorController());
                    mol.get(new de.visaq.controller.SensorController());
                };
                GenericTest.prototype.testMultiObservedPropertyGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/ObservedProperties?$top=2"));
                    mol.get(new de.visaq.controller.ObservedPropertyController());
                    mol.get(new de.visaq.controller.ObservedPropertyController());
                };
                GenericTest.prototype.testMultiObservationGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/Observations?$top=2"));
                    mol.get(new de.visaq.controller.ObservationController());
                    mol.get(new de.visaq.controller.ObservationController());
                };
                GenericTest.prototype.testMultiLocationGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/Locations?$top=2"));
                    mol.get(new de.visaq.controller.LocationController());
                    mol.get(new de.visaq.controller.LocationController());
                };
                GenericTest.prototype.testMultiHistoricalLocationGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/HistoricalLocations?$top=2"));
                    mol.get(new de.visaq.controller.HistoricalLocationController());
                    mol.get(new de.visaq.controller.HistoricalLocationController());
                };
                GenericTest.prototype.testMultiDatastreamGet = function () {
                    var mol = (new de.visaq.controller.link.MultiOnlineLink("/Datastreams?$top=2"));
                    mol.get(new de.visaq.controller.DatastreamController());
                    mol.get(new de.visaq.controller.DatastreamController());
                };
                return GenericTest;
            }());
            controller.GenericTest = GenericTest;
            GenericTest["__class"] = "de.visaq.controller.GenericTest";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
