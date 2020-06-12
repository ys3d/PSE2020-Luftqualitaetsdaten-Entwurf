package de.visaq.controller.link;

import de.visaq.model.sensorthings.Sensorthings;

public interface MultiNavigationLink<sensorthing extends Sensorthings> extends NavigationLink<sensorthing> {
	public sensorthing[] get();
}
