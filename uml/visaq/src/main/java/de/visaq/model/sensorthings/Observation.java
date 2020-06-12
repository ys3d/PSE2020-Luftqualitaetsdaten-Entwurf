package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

import de.visaq.controller.link.SingleNavigationLink;

public class Observation extends Sensorthings implements SensorthingsTimeStamp {
	public final LocalDateTime phenomenonTime;
	public final String result;
	public final LocalDateTime resultTime;
	public final SingleNavigationLink<Datastream> datastreamLink;

	public Observation(String id, SingleNavigationLink<Observation> selfLink, LocalDateTime phenomenonTime, String result,
			LocalDateTime resultTime, SingleNavigationLink<Datastream> datastreamLink) {
		super(id, selfLink);
		this.phenomenonTime = phenomenonTime;
		this.result = result;
		this.resultTime = resultTime;
		this.datastreamLink = datastreamLink;
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
