package de.visaq.controller;

import de.visaq.controller.link.NavigationLink;
import de.visaq.model.sensorthings.Sensorthings;

public interface SensorthingsController<sensorthing extends Sensorthings> {
	public sensorthing[] getAll();
	public sensorthing get(NavigationLink<sensorthing> navigationLink);
	public sensorthing get(String id);
}
