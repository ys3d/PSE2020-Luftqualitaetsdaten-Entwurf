package de.visaq.controller;

import def.angular.http.Request;
import def.angular.platform_browser.BrowserModule;
import de.visaq.model.Sensorthing;
import de.visaq.view.VisAQ;
import def.angular.core.NgModule;
import def.angular.http.HttpModule;
import def.angular.*;

@NgModule(
		imports = { BrowserModule.class },
		  declarations = { VisAQ.class }, //Appmodule root
		  bootstrap = { VisAQ.class } //Appmodule root
		)

/**
 * Controller that requests data from the server
 *
 */
public class AngularController {
	private Request request = new Request();
	
	/**
	 * The request to the Server is send here through an angular application. It returns a json data that is parsed to a Sensorthing data
	 * @return the Sensorthing used in the view
	 */
	public synchronized Sensorthing<?> sendRequest() {
		request.json();
		return null;
	}
}