package de.visaq.model.sensorthings;

import java.time.LocalDateTime;

public class Observation implements SenorthingsTimeStamp{
	private final String id;
	private final NavigationLink selfLink;
	private final LocalDateTime phenomenonTime;
	private final String result;
	private final LocalDateTime resultTime;
	private final NavigationLink datastreamLink;
	private final NavigationLink featureOfInterestLink;
	
	public Observation(String id, NavigationLink selfLink, LocalDateTime phenomenonTime, String result,
			LocalDateTime resultTime, NavigationLink datastreamLink, NavigationLink featureOfInterestLink) {
		this.id = id;
		this.selfLink = selfLink;
		this.phenomenonTime = phenomenonTime;
		this.result = result;
		this.resultTime = resultTime;
		this.datastreamLink = datastreamLink;
		this.featureOfInterestLink = featureOfInterestLink;
	}

	public String getId() {
		return id;
	}

	public NavigationLink getSelfLink() {
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

	public NavigationLink getDatastreamLink() {
		return datastreamLink;
	}

	public NavigationLink getFeatureOfInterestLink() {
		return featureOfInterestLink;
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
