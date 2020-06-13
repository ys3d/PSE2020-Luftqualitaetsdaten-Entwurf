package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

import de.visaq.controller.HistoricalLocationController;
import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.controller.link.SingleNavigationLink;

public class HistoricalLocation extends Sensorthings<HistoricalLocation> implements SensorthingsTimeStamp {
	public final LocalDateTime time;
	public final SingleNavigationLink<Thing> thingLink;
	public final MultiOnlineLink<Location> locationsLink;

	public HistoricalLocation(String id, String selfUrl, LocalDateTime time, SingleNavigationLink<Thing> thingLink, MultiOnlineLink<Location> locationsLink) {
		super(id, selfUrl);
		this.time = time;
		this.thingLink = thingLink;
		this.locationsLink = locationsLink;
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

	@Override
	public HistoricalLocationController getController() {
		return new HistoricalLocationController();
	}
}
