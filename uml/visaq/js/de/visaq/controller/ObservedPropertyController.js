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
            var ObservedPropertyController = (function (_super) {
                __extends(ObservedPropertyController, _super);
                function ObservedPropertyController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                ObservedPropertyController.prototype.getAll = function () {
                    return null;
                };
                ObservedPropertyController.prototype.get$de_visaq_model_sensorthings_Datastream = function (datastream) {
                    return null;
                };
                ObservedPropertyController.prototype.get = function (datastream) {
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
                ObservedPropertyController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.ObservedProperty}
                 */
                ObservedPropertyController.prototype.singleBuild = function (json) {
                    json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                    var observedProperty = new de.visaq.model.sensorthings.ObservedProperty(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), json.getString("definition"), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Datastreams@iot.navigationLink"))));
                    return observedProperty;
                };
                return ObservedPropertyController;
            }(de.visaq.controller.SensorthingsController));
            controller.ObservedPropertyController = ObservedPropertyController;
            ObservedPropertyController["__class"] = "de.visaq.controller.ObservedPropertyController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
