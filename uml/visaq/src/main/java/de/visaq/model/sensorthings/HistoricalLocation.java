package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

import de.visaq.controller.link.SingleNavigationLink;

public class HistoricalLocation extends Sensorthings implements SensorthingsTimeStamp {
	public final LocalDateTime time;

	public HistoricalLocation(String id, SingleNavigationLink<HistoricalLocation> selfLink, LocalDateTime time) {
		super(id, selfLink);
		this.time = time;
	}

	public String getId() {
		return id;
	}
	
	public boolean isOlder(HistoricalLocation other) {
		return false;
	}
	
	public boolean isNewer(HistoricalLocation other) {
		return false;
	}
	
	public boolean isEqualOld(HistoricalLocation other) {
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
