package de.visaq.view.elements;

public enum AirQualityData {
	
	FEINSTAUB ("Feinstaub"),
	TEMPERATUR("Temperatur"),
	LUFTFEUCHTIGKEIT("Luftfeuchtigkeit"),
	LUFTDRUCK("Luftdruck");
	 
	private String qualityData = ""; 
	
	

	AirQualityData(String qualityData) {
		this.qualityData = qualityData;
	}
	
	public String choosenData() { 
		return qualityData;
	}
}
