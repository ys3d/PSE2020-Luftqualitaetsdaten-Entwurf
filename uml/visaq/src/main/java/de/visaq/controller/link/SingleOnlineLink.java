package de.visaq.controller.link;

import org.json.JSONObject;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class SingleOnlineLink<sensorthing extends Sensorthings<sensorthing>> implements SingleNavigationLink<sensorthing> {
	private SingleLocalLink<sensorthing> cache;
	
	public final String url;
	
	public SingleOnlineLink(String url) {
		this.url = url;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public Sensorthings<sensorthing> get(SensorthingsController<sensorthing> controller) {
		if (cache != null) {
			return cache.get(controller);
		}
		
		Client c = ClientBuilder.newClient();
		WebTarget target = c.target(url);
		
		System.out.println("\nAngefragte URL: " + target.getUri());
		
		String responseString = target.request(MediaType.APPLICATION_JSON).get(String.class);
		JSONObject response = new JSONObject(responseString);
		
		System.out.println("\nTextausgabe:");
		System.out.println(responseString);
		
		sensorthing built = controller.multiBuild(response).get(0);
		
		cache = new SingleLocalLink<sensorthing>(url, built);
		
		return built;
	}
}
