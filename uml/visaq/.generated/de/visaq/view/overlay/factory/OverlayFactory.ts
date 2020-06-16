/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.overlay.factory {
    export abstract class OverlayFactory {
        public airQualityData : de.visaq.view.elements.AirQualityData = null;

        public constructor(airQualityData : de.visaq.view.elements.AirQualityData) {
        }

        /**
         * 
         * @param {de.visaq.model.PointData[]} pointdata		List of the Sensordata to construct an Map Overlay
         * @return				{*} A overlay for the map.
         */
        public abstract build(pointdata : Array<de.visaq.model.PointData>) : de.visaq.view.elements.map.MapOverlay;
    }
    OverlayFactory["__class"] = "de.visaq.view.overlay.factory.OverlayFactory";

}

