/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller) {
            var UtilityController = (function () {
                function UtilityController() {
                }
                UtilityController.buildUnitOfMeasurement = function (json) {
                    return new de.visaq.model.sensorthings.UnitOfMeasurement(json.getString("name"), json.getString("symbol"), json.getString("definition"));
                };
                UtilityController.buildTime = function (json, key) {
                    return java.time.Instant.parse(json.getString(key));
                };
                UtilityController.buildLocationPoint = function (json) {
                    var pointArray = json.getJSONObject("location").getJSONArray("coordinates");
                    var point = new java.awt.Point();
                    point.setLocation(pointArray.getDouble(0), pointArray.getDouble(1));
                    return point;
                };
                UtilityController.buildProperties = function (json) {
                    return json.getJSONObject("properties").toMap();
                };
                UtilityController.removeArrayWrapper = function (json) {
                    if (!json.has("value")) {
                        return json;
                    }
                    json = json.getJSONObject("value");
                    if (!json.has("0")) {
                        return json;
                    }
                    return json.getJSONObject("0");
                };
                return UtilityController;
            }());
            controller.UtilityController = UtilityController;
            UtilityController["__class"] = "de.visaq.controller.UtilityController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
