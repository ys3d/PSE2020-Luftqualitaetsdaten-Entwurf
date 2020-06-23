package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class SingleLocalLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends SingleNavigationLink<SensorthingT> {
    public final Sensorthings<SensorthingT> cachedSensorthing;

    public SingleLocalLink(String url, boolean relative,
            Sensorthings<SensorthingT> cachedSensorthing) {
        super(url, relative);
        this.cachedSensorthing = cachedSensorthing;
    }

    @Override
    public Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
        return cachedSensorthing;
    }

}
