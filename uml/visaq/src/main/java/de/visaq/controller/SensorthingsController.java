package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Sensorthings;

/**
 *	Encapsulates the control over all Sensorthings objects.
 * 
 *	@param <sensorthing> Sensorthings object this controller will work on.
 */
public abstract class SensorthingsController<sensorthing extends Sensorthings<sensorthing>> {
	/**
	 * Retrieves all Sensorthings objects of this type. Can be slow and should be avoided. Use more specific requests instead.
	 * 
	 * @return	An array containing the Sensorthings objects that were retrieved.
	 */
	public abstract ArrayList<sensorthing> getAll();
	/**
	 * Retrieves all Sensorthings objects that are bound to the specified MultiNavigationLink.
	 * 
	 * @param navigationLink 	Link to the Sensorthings objects inside the database.
	 * @return					An array containing the Sensorthings objects that were retrieved.
	 */
	public abstract ArrayList<sensorthing> get(MultiNavigationLink<sensorthing> navigationLink);
	/**
	 * Retrieves the Sensorthings object that is bound to the specified SingleNavigationLink.
	 * 
	 * @param navigationLink	Link to the Sensorthings object inside the database.
	 * @return 					The Sensorthings object that was retrieved.
	 */
	public abstract sensorthing get(SingleNavigationLink<sensorthing> navigationLink);
	/**
	 * Retrieves the Sensorthings object with the specified identifier.
	 * 
	 * @param id	Unique identifier of the Sensorthings object inside the database.
	 * @return 		The Sensorthings object that was retrieved.
	 */
	public abstract sensorthing get(String id);
	/**
	 * Builds the Sensorthings objects using the specified JSON.
	 * 
	 * @param json	Sensorthings objects codified as JSON.
	 * @return		The Sensorthings objects that were constructed.
	 */
	public ArrayList<sensorthing> multiBuild(JSONObject json) {
		JSONArray array = json.getJSONArray("value");
		int length = array.length();
		ArrayList<sensorthing> objects = new ArrayList<sensorthing>();

		for (int i = 0; i < length; i++) {
			objects.add(singleBuild(json.getJSONArray("value").getJSONObject(i)));
		}

		return objects;
	}
	
	/**
	 * Builds the Sensorthings object using the specified JSON.
	 * 
	 * @param json	Sensorthings object codified as JSON.
	 * @return		The Sensorthings object that were constructed.
	 */
	public abstract sensorthing singleBuild(JSONObject json);
}
