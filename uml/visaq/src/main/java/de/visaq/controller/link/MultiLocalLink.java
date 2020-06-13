package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.RestConstants;
import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class MultiLocalLink<sensorthing extends Sensorthings<sensorthing>> implements MultiNavigationLink<sensorthing> {
	public final String url;
	public final ArrayList<sensorthing> cachedSensorthing;

	public MultiLocalLink(String url, ArrayList<sensorthing> cachedSensorthing) {
		this.url = RestConstants.ENTRY_POINT + url;
		this.cachedSensorthing = cachedSensorthing;
	}

	public ArrayList<sensorthing> get(SensorthingsController<sensorthing> controller) {
		return cachedSensorthing;
	}

}
