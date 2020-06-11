package de.visaq.model.sensorthings;

public interface SenorthingsTimeStamp {
	public boolean isOlder(HistoricalLocation other);
	
	public boolean isNewer(HistoricalLocation other);
	
	public boolean isEqualOld(HistoricalLocation other);
}
