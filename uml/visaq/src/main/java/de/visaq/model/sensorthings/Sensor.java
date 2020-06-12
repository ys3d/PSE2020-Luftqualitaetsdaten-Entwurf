package de.visaq.model.sensorthings;

import de.visaq.controller.link.MultiNavigationLink;
import de.visaq.controller.link.SingleNavigationLink;

public class Sensor extends Sensorthings {
	public final String description;
	public final String name;
	public final MultiNavigationLink<Datastream> datastreams;

	public Sensor(String id, SingleNavigationLink<Sensor> selfLink, String description, String name,
			MultiNavigationLink<Datastream> datastreams) {
		super(id, selfLink);
		this.description = description;
		this.name = name;
		this.datastreams = datastreams;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
