var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller) {
            /**
             * Encapsulates the control over Datastream objects.
             * @class
             * @extends de.visaq.controller.SensorthingsController
             */
            var DatastreamController = (function (_super) {
                __extends(DatastreamController, _super);
                function DatastreamController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                DatastreamController.prototype.get$de_visaq_model_sensorthings_Thing = function (thing) {
                    return thing.datastreamsLink.get(this);
                };
                DatastreamController.prototype.get$de_visaq_model_sensorthings_Sensor = function (sensor) {
                    return sensor.datastreams.get(this);
                };
                DatastreamController.prototype.getAll = function () {
                    return new de.visaq.controller.link.MultiOnlineLink("/Datastreams").get(this);
                };
                DatastreamController.prototype.get$de_visaq_model_sensorthings_Thing$de_visaq_model_sensorthings_ObservedProperty = function (thing, observedProperty) {
                    return null;
                };
                /**
                 * Retrieves the Datastream object for the observed property of the specified
                 * Thing.
                 *
                 * @param {de.visaq.model.sensorthings.Thing} thing            Thing the Datastream is associated with.
                 * @param {de.visaq.model.sensorthings.ObservedProperty} observedProperty Observed Property the Datastream is associated with.
                 * @return {de.visaq.model.sensorthings.Datastream} The Datastream object that was retrieved.
                 */
                DatastreamController.prototype.get = function (thing, observedProperty) {
                    if (((thing != null && thing instanceof de.visaq.model.sensorthings.Thing) || thing === null) && ((observedProperty != null && observedProperty instanceof de.visaq.model.sensorthings.ObservedProperty) || observedProperty === null)) {
                        return this.get$de_visaq_model_sensorthings_Thing$de_visaq_model_sensorthings_ObservedProperty(thing, observedProperty);
                    }
                    else if (((thing != null && thing instanceof de.visaq.model.sensorthings.Sensor) || thing === null) && ((observedProperty != null && observedProperty instanceof de.visaq.model.sensorthings.ObservedProperty) || observedProperty === null)) {
                        return this.get$de_visaq_model_sensorthings_Sensor$de_visaq_model_sensorthings_ObservedProperty(thing, observedProperty);
                    }
                    else if (((thing != null && thing instanceof de.visaq.model.sensorthings.Thing) || thing === null) && observedProperty === undefined) {
                        return this.get$de_visaq_model_sensorthings_Thing(thing);
                    }
                    else if (((thing != null && thing instanceof de.visaq.model.sensorthings.Sensor) || thing === null) && observedProperty === undefined) {
                        return this.get$de_visaq_model_sensorthings_Sensor(thing);
                    }
                    else if (((typeof thing === 'string') || thing === null) && observedProperty === undefined) {
                        return this.get$java_lang_String(thing);
                    }
                    else if (((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || thing === null) && observedProperty === undefined) {
                        _super.prototype.get.call(this, thing);
                    }
                    else if (((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || thing === null) && observedProperty === undefined) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(thing);
                    }
                    else if (((typeof thing === 'string') || thing === null) && observedProperty === undefined) {
                        return this.get$java_lang_String(thing);
                    }
                    else
                        throw new Error('invalid overload');
                };
                DatastreamController.prototype.get$de_visaq_model_sensorthings_Sensor$de_visaq_model_sensorthings_ObservedProperty = function (sensor, observedProperty) {
                    return null;
                };
                DatastreamController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.Datastream}
                 */
                DatastreamController.prototype.singleBuild = function (json) {
                    json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                    var datastream = new de.visaq.model.sensorthings.Datastream(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("name"), json.getString("description"), json.getJSONObject("properties").toMap(), json.getString("observationType"), (new de.visaq.controller.link.SingleOnlineLink(json.getString("Sensor@iot.navigationLink"))), (new de.visaq.controller.link.SingleOnlineLink(json.getString("Thing@iot.navigationLink"))), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Observations@iot.navigationLink"))), de.visaq.controller.UtilityController.buildUnitOfMeasurement(json.getJSONObject("unitOfMeasurement")), (new de.visaq.controller.link.SingleOnlineLink(json.getString("ObservedProperty@iot.navigationLink"))));
                    return datastream;
                };
                return DatastreamController;
            }(de.visaq.controller.SensorthingsController));
            controller.DatastreamController = DatastreamController;
            DatastreamController["__class"] = "de.visaq.controller.DatastreamController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
