package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public interface MultiNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    public ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
