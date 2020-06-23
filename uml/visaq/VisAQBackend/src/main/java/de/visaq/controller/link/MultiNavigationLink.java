package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public abstract class MultiNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    public MultiNavigationLink(String url, boolean relative) {
        super(url, relative);
    }

    public abstract ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
