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
             * Encapsulates the control over Observation objects.
             * @class
             * @extends de.visaq.controller.SensorthingsController
             */
            var ObservationController = (function (_super) {
                __extends(ObservationController, _super);
                function ObservationController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                ObservationController.prototype.getAll = function () {
                    return null;
                };
                ObservationController.prototype.get$de_visaq_model_sensorthings_Datastream = function (datastream) {
                    return null;
                };
                ObservationController.prototype.get = function (datastream) {
                    if (((datastream != null && datastream instanceof de.visaq.model.sensorthings.Datastream) || datastream === null)) {
                        return this.get$de_visaq_model_sensorthings_Datastream(datastream);
                    }
                    else if (((typeof datastream === 'string') || datastream === null)) {
                        return this.get$java_lang_String(datastream);
                    }
                    else if (((datastream != null && (datastream["__interfaces"] != null && datastream["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || datastream.constructor != null && datastream.constructor["__interfaces"] != null && datastream.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || datastream === null)) {
                        _super.prototype.get.call(this, datastream);
                    }
                    else if (((datastream != null && (datastream["__interfaces"] != null && datastream["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || datastream.constructor != null && datastream.constructor["__interfaces"] != null && datastream.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || datastream === null)) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(datastream);
                    }
                    else if (((typeof datastream === 'string') || datastream === null)) {
                        return this.get$java_lang_String(datastream);
                    }
                    else
                        throw new Error('invalid overload');
                };
                ObservationController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.Observation}
                 */
                ObservationController.prototype.singleBuild = function (json) {
                    try {
                        json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                        var observation = new de.visaq.model.sensorthings.Observation(json.getString("@iot.id"), json.getString("@iot.selfLink"), de.visaq.controller.UtilityController.buildTime(json, "phenomenonTime"), json.getDouble("result"), de.visaq.controller.UtilityController.buildTime(json, "resultTime"), (new de.visaq.controller.link.SingleOnlineLink(json.getString("Datastream@iot.navigationLink"))));
                        return observation;
                    }
                    catch (e) {
                        return null;
                    }
                    ;
                };
                return ObservationController;
            }(de.visaq.controller.SensorthingsController));
            controller.ObservationController = ObservationController;
            ObservationController["__class"] = "de.visaq.controller.ObservationController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
