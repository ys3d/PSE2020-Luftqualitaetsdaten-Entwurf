package de.visaq.controller.link;

import de.visaq.RestConstants;
import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class SingleLocalLink<SensorthingT extends Sensorthings<SensorthingT>>
        implements SingleNavigationLink<SensorthingT> {
    public final String url;
    public final Sensorthings<SensorthingT> cachedSensorthing;

    public SingleLocalLink(String url, Sensorthings<SensorthingT> cachedSensorthing) {
        this.url = RestConstants.ENTRY_POINT + url;
        this.cachedSensorthing = cachedSensorthing;
    }

    @Override
    public Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
        return cachedSensorthing;
    }

}
