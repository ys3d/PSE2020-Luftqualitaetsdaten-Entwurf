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
	
	/**
	 * Idea for Constructor when using objects not Enums
	 * 
	 * Public AirQualityData(String name, Color primaryColor, Color secondaryColor, ObservedProperty observedProperty)
	 */
}
