package de.visaq.controller.link;

import de.visaq.model.sensorthings.Sensorthings;

class MultiOnlineLink<sensorthing extends Sensorthings> implements MultiNavigationLink<sensorthing> {
	private final String url;
	
	public MultiOnlineLink(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public sensorthing[] get() {
		// TODO Auto-generated method stub
		return null;
	}
}
