package de.visaq.view;

import java.util.ArrayList;

import de.visaq.controller.ThingController;
import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Thing;
import de.visaq.view.elements.Toolbar;

public abstract class VisAQ {

	ArrayList<View> view = null;
	Toolbar toolbar;

	public static void main(String[] args) {
		//String baseUrl = "https://toronto-bike-snapshot.sensorup.com/v1.0/";
		/*String baseUrl = "http://api.smartaq.net/v1.0/";
		String webContextPath = "Things";

		Client c = ClientBuilder.newClient();
		//Client c = Client.create();
		WebTarget target = c.target(baseUrl).path(webContextPath).queryParam("$top", 1);
		
		System.out.println("\nAngefragte URL: " + baseUrl + webContextPath + "?$top=" + 1);
		System.out.println("\nAngefragte URL: " + target.getUri());
		
		String responseString = target.request(MediaType.APPLICATION_JSON).get(String.class);
		JSONObject response = new JSONObject(responseString);
		
		System.out.println("\nTextausgabe:");
		System.out.println(responseString);*/
		
		SingleOnlineLink<Thing> sol = new SingleOnlineLink<Thing>("http://api.smartaq.net/v1.0/Things?$top=1");
		sol.get(new ThingController());
		sol.get(new ThingController());
	}

}
