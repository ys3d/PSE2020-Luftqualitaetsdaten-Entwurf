package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

import de.visaq.controller.link.SingleNavigationLink;

public class Observation implements SensorthingsTimeStamp, Sensorthings {
	private final String id;
	private final SingleNavigationLink<Observation> selfLink;
	private final LocalDateTime phenomenonTime;
	private final String result;
	private final LocalDateTime resultTime;
	private final SingleNavigationLink<Datastream> datastreamLink;

	public Observation(String id, SingleNavigationLink<Observation> selfLink, LocalDateTime phenomenonTime, String result,
			LocalDateTime resultTime, SingleNavigationLink<Datastream> datastreamLink) {
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

	public SingleNavigationLink<Observation> getSelfLink() {
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

	public SingleNavigationLink<Datastream> getDatastreamLink() {
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
