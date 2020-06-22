package de.visaq.view.elements.map;

import de.visaq.view.elements.airquality.AirQualityData;
import de.visaq.view.theme.Gradient;

public class Legend {
		public final AirQualityData airQualityData;
        Gradient gradient;

		/**
		 * Sole constructor of the class
		 * @param airQualityData		The Air Quality Data, contains the gradient
		 */
		public Legend(AirQualityData airQualityData) {
            this.airQualityData = airQualityData;
            this.gradient = new Gradient(this.airQualityData.getPrimaryColor(), this.airQualityData.getSecondaryColor());
        }
		/*
		 * Gradient shown on website
		 */
		
		public void show() {
			
			// TODO implement
			
		}
	
}
