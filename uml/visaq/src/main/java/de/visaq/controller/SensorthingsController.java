package de.visaq.controller;

import org.json.JSONObject;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;
import de.visaq.model.sensorthings.Sensorthings;

/**
 *	Encapsulates the control over all Sensorthings objects.
 * 
 *	@param <sensorthing> Sensorthings object this controller will work on.
 */
public interface SensorthingsController<sensorthing extends Sensorthings> {
	/**
	 * Retrieves all Sensorthings objects of this type. Can be slow and should be avoided. Use more specific requests instead.
	 * 
	 * @return	An array containing the Sensorthings objects that were retrieved.
	 */
	public sensorthing[] getAll();
	/**
	 * Retrieves all Sensorthings objects that are bound to the specified MultiNavigationLink.
	 * 
	 * @param navigationLink 	Link to the Sensorthings objects inside the database.
	 * @return					An array containing the Sensorthings objects that were retrieved.
	 */
	public sensorthing[] get(MultiNavigationLink<sensorthing> navigationLink);
	/**
	 * Retrieves the Sensorthings object that is bound to the specified SingleNavigationLink.
	 * 
	 * @param navigationLink	Link to the Sensorthings object inside the database.
	 * @return 					The Sensorthings object that was retrieved.
	 */
	public sensorthing get(SingleNavigationLink<sensorthing> navigationLink);
	/**
	 * Retrieves the Sensorthings object with the specified identifier.
	 * 
	 * @param id	Unique identifier of the Sensorthings object inside the database.
	 * @return 		The Sensorthings object that was retrieved.
	 */
	public sensorthing get(String id);
	/**
	 * Builds the Sensorthings object using the specified JSON.
	 * 
	 * @param json	Sensorthings object codified as JSON.
	 * @return		The Sensorthings object that was constructed.
	 */
	public sensorthing build(JSONObject json);
}
