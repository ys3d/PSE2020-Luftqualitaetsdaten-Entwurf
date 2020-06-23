package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.RestConstants;
import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class MultiLocalLink<SensorthingT extends Sensorthings<SensorthingT>>
        implements MultiNavigationLink<SensorthingT> {
    public final String url;
    public final ArrayList<SensorthingT> cachedSensorthing;

    public MultiLocalLink(String url, ArrayList<SensorthingT> cachedSensorthing) {
        this.url = RestConstants.ENTRY_POINT + url;
        this.cachedSensorthing = cachedSensorthing;
    }

    @Override
    public ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
        return cachedSensorthing;
    }

}
