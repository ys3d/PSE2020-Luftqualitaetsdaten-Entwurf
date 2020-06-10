package de.visaq.model.sensorthings;

public class Sensor {
	private final int id;
	private final int selfLink;
	private final String description;
	private final String name;
	private final NavigationLink datastreams;
	
	public Sensor(int id, int selfLink, String description, String name, NavigationLink datastreams) {
		this.id = id;
		this.selfLink = selfLink;
		this.description = description;
		this.name = name;
		this.datastreams = datastreams;
	}
}
