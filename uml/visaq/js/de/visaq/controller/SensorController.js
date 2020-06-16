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
             * Encapsulates the control over Sensor objects.
             * @class
             * @extends de.visaq.controller.SensorthingsController
             */
            var SensorController = (function (_super) {
                __extends(SensorController, _super);
                function SensorController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                SensorController.prototype.get$de_visaq_model_sensorthings_Thing = function (thing) {
                    return null;
                };
                /**
                 * Retrieves all Sensor objects associated with the specified Thing.
                 *
                 * @param {de.visaq.model.sensorthings.Thing} thing	Thing the Sensor objects are associated with.
                 * @return		{de.visaq.model.sensorthings.Sensor[]} An array of Sensor objects that were retrieved.
                 */
                SensorController.prototype.get = function (thing) {
                    if (((thing != null && thing instanceof de.visaq.model.sensorthings.Thing) || thing === null)) {
                        return this.get$de_visaq_model_sensorthings_Thing(thing);
                    }
                    else if (((thing != null && thing instanceof de.visaq.model.sensorthings.Datastream) || thing === null)) {
                        return this.get$de_visaq_model_sensorthings_Datastream(thing);
                    }
                    else if (((typeof thing === 'string') || thing === null)) {
                        return this.get$java_lang_String(thing);
                    }
                    else if (((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || thing === null)) {
                        _super.prototype.get.call(this, thing);
                    }
                    else if (((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || thing === null)) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(thing);
                    }
                    else if (((typeof thing === 'string') || thing === null)) {
                        return this.get$java_lang_String(thing);
                    }
                    else
                        throw new Error('invalid overload');
                };
                SensorController.prototype.getAll = function () {
                    return null;
                };
                SensorController.prototype.get$de_visaq_model_sensorthings_Datastream = function (datastream) {
                    return null;
                };
                SensorController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.Sensor}
                 */
                SensorController.prototype.singleBuild = function (json) {
                    json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                    var sensor = new de.visaq.model.sensorthings.Sensor(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Datastreams@iot.navigationLink"))));
                    return sensor;
                };
                return SensorController;
            }(de.visaq.controller.SensorthingsController));
            controller.SensorController = SensorController;
            SensorController["__class"] = "de.visaq.controller.SensorController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
