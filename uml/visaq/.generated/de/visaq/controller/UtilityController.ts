/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    export class UtilityController {
        public static buildUnitOfMeasurement(json : org.json.JSONObject) : de.visaq.model.sensorthings.UnitOfMeasurement {
            return new de.visaq.model.sensorthings.UnitOfMeasurement(json.getString("name"), json.getString("symbol"), json.getString("definition"));
        }

        public static buildTime(json : org.json.JSONObject, key : string) : java.time.Instant {
            return java.time.Instant.parse(json.getString(key));
        }

        public static buildLocationPoint(json : org.json.JSONObject) : java.awt.Point {
            let pointArray : org.json.JSONArray = json.getJSONObject("location").getJSONArray("coordinates");
            let point : java.awt.Point = new java.awt.Point();
            point.setLocation(pointArray.getDouble(0), pointArray.getDouble(1));
            return point;
        }

        public static buildProperties(json : org.json.JSONObject) : any {
            return json.getJSONObject("properties").toMap();
        }

        public static removeArrayWrapper(json : org.json.JSONObject) : org.json.JSONObject {
            if(!json.has("value")) {
                return json;
            }
            json = json.getJSONObject("value");
            if(!json.has("0")) {
                return json;
            }
            return json.getJSONObject("0");
        }
    }
    UtilityController["__class"] = "de.visaq.controller.UtilityController";

}

