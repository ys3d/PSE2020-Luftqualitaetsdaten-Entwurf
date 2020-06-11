package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

public class HistoricalLocation implements SenorthingsTimeStamp{
	private final String id;
	private final LocalDateTime time;

	public HistoricalLocation(String id, LocalDateTime time) {
		this.id = id;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public LocalDateTime getTime() {
		return time;
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
}
