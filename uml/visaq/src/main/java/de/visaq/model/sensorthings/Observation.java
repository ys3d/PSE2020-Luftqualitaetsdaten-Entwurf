package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

public class Observation {
	private final int id;
	private final NavigationLink selfLink;
	private final LocalDateTime phenomenonTime;
	private final String result;
	private final LocalDateTime resultTime;
	private final NavigationLink datastreamLink;
	private final NavigationLink featureOfInterestLink;
	
	public Observation(int id, NavigationLink selfLink, LocalDateTime phenomenonTime, String result,
			LocalDateTime resultTime, NavigationLink datastreamLink, NavigationLink featureOfInterestLink) {
		this.id = id;
		this.selfLink = selfLink;
		this.phenomenonTime = phenomenonTime;
		this.result = result;
		this.resultTime = resultTime;
		this.datastreamLink = datastreamLink;
		this.featureOfInterestLink = featureOfInterestLink;
	}
}
