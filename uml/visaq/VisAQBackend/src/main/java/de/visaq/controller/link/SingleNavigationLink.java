package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public abstract class SingleNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    public SingleNavigationLink(String url, boolean relative) {
        super(url, relative);
    }

    public abstract Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
