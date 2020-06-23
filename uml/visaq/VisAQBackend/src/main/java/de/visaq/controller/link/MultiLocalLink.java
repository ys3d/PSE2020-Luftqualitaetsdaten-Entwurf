package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class MultiLocalLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends MultiNavigationLink<SensorthingT> {
    public final ArrayList<SensorthingT> cachedSensorthing;

    public MultiLocalLink(String url, boolean relative, ArrayList<SensorthingT> cachedSensorthing) {
        super(url, relative);
        this.cachedSensorthing = cachedSensorthing;
    }

    @Override
    public ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
        return cachedSensorthing;
    }

}
