package de.visaq.controller.link;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import de.visaq.RestConstants;
import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class MultiOnlineLink<SensorthingT extends Sensorthings<SensorthingT>>
        implements MultiNavigationLink<SensorthingT> {
    private MultiLocalLink<SensorthingT> cache;

    public final String url;

    public MultiOnlineLink(String url) {
        this.url = RestConstants.ENTRY_POINT + url;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
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

        ArrayList<SensorthingT> built = controller.multiBuild(response);

        cache = new MultiLocalLink<SensorthingT>(url, built);

        return built;
    }
}
