/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.overlay.factory {
    /**
     * Creates an interpolated Map Overlay from given Sensor Data,
     * @param {de.visaq.view.elements.AirQualityData} airQualityData
     * @class
     * @extends de.visaq.view.overlay.factory.OverlayFactory
     */
    export class InterpolationOverlayFactory extends de.visaq.view.overlay.factory.OverlayFactory {
        public constructor(airQualityData : de.visaq.view.elements.AirQualityData) {
            super(airQualityData);
        }

        /**
         * 
         * @param {de.visaq.model.PointData[]} pointdata
         * @return {*}
         */
        public build(pointdata : Array<de.visaq.model.PointData>) : de.visaq.view.elements.map.MapOverlay {
            return null;
        }
    }
    InterpolationOverlayFactory["__class"] = "de.visaq.view.overlay.factory.InterpolationOverlayFactory";

}

