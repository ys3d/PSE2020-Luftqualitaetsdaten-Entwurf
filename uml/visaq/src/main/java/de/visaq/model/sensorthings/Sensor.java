package de.visaq.model.sensorthings;

public class Sensor {
	private final String id;
	private final NavigationLink selfLink;
	private final String description;
	private final String name;
	private final NavigationLink datastreams;
	
	public Sensor(String id, NavigationLink selfLink, String description, String name, NavigationLink datastreams) {
		this.id = id;
		this.selfLink = selfLink;
		this.description = description;
		this.name = name;
		this.datastreams = datastreams;
	}

	public String getId() {
		return id;
	}

	public NavigationLink getSelfLink() {
		return selfLink;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public NavigationLink getDatastreams() {
		return datastreams;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
