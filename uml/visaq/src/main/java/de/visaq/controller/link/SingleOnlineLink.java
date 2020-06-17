package de.visaq.controller.link;

import org.json.JSONObject;

import de.visaq.RestConstants;
import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class SingleOnlineLink<SensorthingT extends Sensorthings<SensorthingT>>
        implements SingleNavigationLink<SensorthingT> {
    private SingleLocalLink<SensorthingT> cache;

    public final String url;

    public SingleOnlineLink(String url) {
        this.url = RestConstants.ENTRY_POINT + url;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
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

        SensorthingT built = controller.multiBuild(response).get(0);

        cache = new SingleLocalLink<SensorthingT>(url, built);

        return built;
    }
}
