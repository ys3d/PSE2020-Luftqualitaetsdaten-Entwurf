package de.visaq.model.sensorthings;

import de.visaq.controller.link.NavigationLink;

public class Sensor implements Sensorthings {
	private final String id;
	private final NavigationLink<Sensor> selfLink;
	private final String description;
	private final String name;
	private final NavigationLink<Datastream> datastreams;

	
	public Sensor(String id, NavigationLink<Sensor> selfLink, String description, String name,
			NavigationLink<Datastream> datastreams) {
		super();
		this.id = id;
		this.selfLink = selfLink;
		this.description = description;
		this.name = name;
		this.datastreams = datastreams;
	}


	public String getId() {
		return id;
	}


	public NavigationLink<Sensor> getSelfLink() {
		return selfLink;
	}


	public String getDescription() {
		return description;
	}


	public String getName() {
		return name;
	}


	public NavigationLink<Datastream> getDatastreams() {
		return datastreams;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
