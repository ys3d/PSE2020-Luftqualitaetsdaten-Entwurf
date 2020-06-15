package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public interface SingleNavigationLink<sensorthing extends Sensorthings<sensorthing>> extends NavigationLink<sensorthing> {
	public Sensorthings<sensorthing> get(SensorthingsController<sensorthing> controller);
}
