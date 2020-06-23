package de.visaq.controller.link;

import org.json.JSONObject;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class SingleOnlineLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends SingleNavigationLink<SensorthingT> {
    private SingleLocalLink<SensorthingT> cache;

    public SingleOnlineLink(String url, boolean relative) {
        super(url, relative);
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

        JSONObject response = getJson();

        if (response == null) {
            return null;
        }

        SensorthingT built = controller.singleBuild(response);

        cache = new SingleLocalLink<SensorthingT>(url, false, built);

        return built;
    }
}
