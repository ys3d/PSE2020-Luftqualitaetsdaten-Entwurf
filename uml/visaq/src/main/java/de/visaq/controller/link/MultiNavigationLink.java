package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public interface MultiNavigationLink<sensorthing extends Sensorthings<sensorthing>> extends NavigationLink<sensorthing> {
	public ArrayList<sensorthing> get(SensorthingsController<sensorthing> controller);
}
