package de.visaq.model.sensorthings;

import java.util.Map;

import de.visaq.controller.SensorController;
import de.visaq.controller.link.MultiNavigationLink;

public class Sensor extends Sensorthings<Sensor> implements SensorthingsProperties {
	public final String description;
	public final String name;
	public final Map<String, Object> properties;
	public final MultiNavigationLink<Datastream> datastreams;

	public Sensor(String id, String selfUrl, String description, String name, Map<String, Object> properties,
			MultiNavigationLink<Datastream> datastreams) {
		super(id, selfUrl);
		this.description = description;
		this.name = name;
		this.properties = properties;
		this.datastreams = datastreams;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public SensorController getController() {
		return new SensorController();
	}

	@Override
	public Object getPropertyByKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasProperties() {
		// TODO Auto-generated method stub
		return false;
	}
}
