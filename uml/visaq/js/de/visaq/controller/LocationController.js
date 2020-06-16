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
             * Encapsulates the control over Location objects.
             * @class
             * @extends de.visaq.controller.SensorthingsController
             */
            var LocationController = (function (_super) {
                __extends(LocationController, _super);
                function LocationController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                LocationController.prototype.getAll = function () {
                    return null;
                };
                LocationController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                LocationController.prototype.get = function (id) {
                    if (((typeof id === 'string') || id === null)) {
                        return this.get$java_lang_String(id);
                    }
                    else if (((id != null && (id["__interfaces"] != null && id["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || id.constructor != null && id.constructor["__interfaces"] != null && id.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || id === null)) {
                        _super.prototype.get.call(this, id);
                    }
                    else if (((id != null && (id["__interfaces"] != null && id["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || id.constructor != null && id.constructor["__interfaces"] != null && id.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || id === null)) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(id);
                    }
                    else if (((typeof id === 'string') || id === null)) {
                        return this.get$java_lang_String(id);
                    }
                    else
                        throw new Error('invalid overload');
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.Location}
                 */
                LocationController.prototype.singleBuild = function (json) {
                    json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                    var location = new de.visaq.model.sensorthings.Location(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("name"), json.getString("description"), de.visaq.controller.UtilityController.buildLocationPoint(json), (new de.visaq.controller.link.MultiOnlineLink(json.getString("HistoricalLocations@iot.navigationLink"))), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Things@iot.navigationLink"))));
                    return location;
                };
                return LocationController;
            }(de.visaq.controller.SensorthingsController));
            controller.LocationController = LocationController;
            LocationController["__class"] = "de.visaq.controller.LocationController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
