package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public interface SingleNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    public Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
