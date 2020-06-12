package de.visaq.view.elements.map;

import java.util.ArrayList;

public class Map {
	
	private ArrayList <MapOverlay> mapOverlayList = null;
	
	public Map() {
		
	}
	
	public void zoom() {
		
	}
	
	public void scrollen() {
		
	}

	public ArrayList <MapOverlay> getMapOverlayList() {
		return mapOverlayList;
	}

	public void setMapOverlayList(ArrayList <MapOverlay> mapOverlay) {
		this.mapOverlayList = mapOverlay;
	}

	public MapOverlay removeMapOverlay() {
		return null;
	}

	public void addMapOverlay(MapOverlay mapOverlay) {

	}
	
	
}
