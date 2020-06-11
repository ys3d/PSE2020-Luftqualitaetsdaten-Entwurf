package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

import de.visaq.controller.link.NavigationLink;

public class Observation implements SenorthingsTimeStamp, Sensorthings {
	private final String id;
	private final NavigationLink<Observation> selfLink;
	private final LocalDateTime phenomenonTime;
	private final String result;
	private final LocalDateTime resultTime;
	private final NavigationLink<Datastream> datastreamLink;

	public Observation(String id, NavigationLink<Observation> selfLink, LocalDateTime phenomenonTime, String result,
			LocalDateTime resultTime, NavigationLink<Datastream> datastreamLink) {
		super();
		this.id = id;
		this.selfLink = selfLink;
		this.phenomenonTime = phenomenonTime;
		this.result = result;
		this.resultTime = resultTime;
		this.datastreamLink = datastreamLink;
	}

	public String getId() {
		return id;
	}

	public NavigationLink<Observation> getSelfLink() {
		return selfLink;
	}

	public LocalDateTime getPhenomenonTime() {
		return phenomenonTime;
	}

	public String getResult() {
		return result;
	}

	public LocalDateTime getResultTime() {
		return resultTime;
	}

	public NavigationLink<Datastream> getDatastreamLink() {
		return datastreamLink;
	}

	public boolean isOlder(HistoricalLocation other) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isNewer(HistoricalLocation other) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEqualOld(HistoricalLocation other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
