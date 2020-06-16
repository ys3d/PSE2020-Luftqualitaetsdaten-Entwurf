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
             * Encapsulates the control over Thing objects.
             * @class
             * @extends de.visaq.controller.SensorthingsController
             */
            var ThingController = (function (_super) {
                __extends(ThingController, _super);
                function ThingController() {
                    return _super !== null && _super.apply(this, arguments) || this;
                }
                ThingController.prototype.get$java_awt_Polygon = function (polygon) {
                    return null;
                };
                /**
                 * Retrieves the Thing objects spatially located inside the specified polygon.
                 *
                 * @param {java.awt.Polygon} polygon Polygon the Thing objects are located inside of.
                 * @return {de.visaq.model.sensorthings.Thing[]} An array of Thing objects that were retrieved.
                 */
                ThingController.prototype.get = function (polygon) {
                    if (((polygon != null && polygon instanceof java.awt.Polygon) || polygon === null)) {
                        return this.get$java_awt_Polygon(polygon);
                    }
                    else if (((typeof polygon === 'string') || polygon === null)) {
                        return this.get$java_lang_String(polygon);
                    }
                    else if (((polygon != null && (polygon["__interfaces"] != null && polygon["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || polygon.constructor != null && polygon.constructor["__interfaces"] != null && polygon.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || polygon === null)) {
                        _super.prototype.get.call(this, polygon);
                    }
                    else if (((polygon != null && (polygon["__interfaces"] != null && polygon["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || polygon.constructor != null && polygon.constructor["__interfaces"] != null && polygon.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || polygon === null)) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(polygon);
                    }
                    else if (((typeof polygon === 'string') || polygon === null)) {
                        return this.get$java_lang_String(polygon);
                    }
                    else
                        throw new Error('invalid overload');
                };
                ThingController.prototype.getAll = function () {
                    var multiLink = (new de.visaq.controller.link.MultiOnlineLink("http://api.smartaq.net/v1.0/Things?$top=3"));
                    return multiLink.get(this);
                };
                ThingController.prototype.get$java_lang_String = function (id) {
                    return null;
                };
                /**
                 *
                 * @param {org.json.JSONObject} json
                 * @return {de.visaq.model.sensorthings.Thing}
                 */
                ThingController.prototype.singleBuild = function (json) {
                    json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                    var thing = new de.visaq.model.sensorthings.Thing(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Datastreams@iot.navigationLink"))), (new de.visaq.controller.link.MultiOnlineLink(json.getString("HistoricalLocations@iot.navigationLink"))), (new de.visaq.controller.link.MultiOnlineLink(json.getString("Locations@iot.navigationLink"))));
                    return thing;
                };
                return ThingController;
            }(de.visaq.controller.SensorthingsController));
            controller.ThingController = ThingController;
            ThingController["__class"] = "de.visaq.controller.ThingController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
