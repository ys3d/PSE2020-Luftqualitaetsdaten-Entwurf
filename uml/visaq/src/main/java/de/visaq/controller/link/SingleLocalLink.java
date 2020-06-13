package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

public class SingleLocalLink<sensorthing extends Sensorthings<sensorthing>> implements SingleNavigationLink<sensorthing> {
	public final String url;
	public final Sensorthings<sensorthing> cachedSensorthing;

	public SingleLocalLink(String url, Sensorthings<sensorthing> cachedSensorthing) {
		this.url = url;
		this.cachedSensorthing = cachedSensorthing;
	}

	public Sensorthings<sensorthing> get(SensorthingsController<sensorthing> controller) {
		return cachedSensorthing;
	}

}
