package de.visaq.controller.link;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import de.visaq.RestConstants;
import de.visaq.model.sensorthings.Sensorthings;

@JsonIdentityInfo(property = "url", generator = ObjectIdGenerators.PropertyGenerator.class)
public abstract class NavigationLink<SensorthingT extends Sensorthings<SensorthingT>> {
    public final String url;

    public NavigationLink(String url, boolean relative) {
        this.url = relative ? RestConstants.ENTRY_POINT + url.replace(" ", "%20") : url;
    }

    protected JSONObject getJson() {
        try {
            Client c = ClientBuilder.newClient();
            WebTarget target = c.target(url);

            System.out.println("\nAngefragte URL: " + target.getUri());

            String responseString = target.request(MediaType.APPLICATION_JSON).get(String.class);
            JSONObject response = new JSONObject(responseString);

            System.out.println("\nTextausgabe:");
            System.out.println(responseString);

            return response;
        } catch (NotFoundException e) {
            return null;
        }
    }
}
