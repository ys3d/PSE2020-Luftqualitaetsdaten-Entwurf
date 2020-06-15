package de.visaq.controller;

import java.awt.Point;
import java.time.Instant;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import de.visaq.model.sensorthings.UnitOfMeasurement;

public class UtilityController {
	public static UnitOfMeasurement buildUnitOfMeasurement(JSONObject json) {
		return new UnitOfMeasurement(
					json.getString("name"),
					json.getString("symbol"),
					json.getString("definition")
				);
	}
	
	public static Instant buildTime(JSONObject json, String key) {
		return Instant.parse(json.getString(key));
	}
	
	public static Point buildLocationPoint(JSONObject json) {
		JSONArray pointArray = json.getJSONObject("location").getJSONArray("coordinates");
		Point point = new Point();
		point.setLocation(pointArray.getDouble(0), pointArray.getDouble(1));
		return point;
	}
	
	public static Map<String, Object> buildProperties(JSONObject json) {
		return json.getJSONObject("properties").toMap();
	}
	
	public static JSONObject removeArrayWrapper(JSONObject json) {
		if (!json.has("value")) {
			return json;
		}
		
		json = json.getJSONObject("value");
		
		if (!json.has("0")) {
			return json;
		}
		
		return json.getJSONObject("0");
	}
}
