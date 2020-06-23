package de.visaq.controller.link;

import java.util.ArrayList;

import org.json.JSONObject;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class MultiOnlineLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends MultiNavigationLink<SensorthingT> {
    private MultiLocalLink<SensorthingT> cache;

    public MultiOnlineLink(String url, boolean relative) {
        super(url, relative);
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

        JSONObject response = getJson();

        if (response == null) {
            return null;
        }

        ArrayList<SensorthingT> built = controller.multiBuild(response);

        cache = new MultiLocalLink<SensorthingT>(url, false, built);

        return built;
    }
}
