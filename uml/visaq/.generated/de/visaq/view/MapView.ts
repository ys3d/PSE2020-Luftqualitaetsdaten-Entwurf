/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view {
    export class MapView extends de.visaq.view.View {
        /*private*/ map : de.visaq.view.elements.map.Map;

        /*private*/ sensoroverview : de.visaq.view.elements.SensorOverview;

        /*private*/ legend : de.visaq.view.elements.map.Legend;

        public constructor(language : de.visaq.view.Language, colorTheme : de.visaq.view.theme.ColorTheme) {
            super(language, colorTheme);
            if(this.map===undefined) this.map = null;
            if(this.sensoroverview===undefined) this.sensoroverview = null;
            if(this.legend===undefined) this.legend = null;
        }

        public show() {
        }

        public showSensoroverview() {
        }

        public showLegend() {
        }

        public showTimeline() {
        }

        public getMap() : de.visaq.view.elements.map.Map {
            return this.map;
        }

        public setMap(map : de.visaq.view.elements.map.Map) {
            this.map = map;
        }

        public getSensorOverview() : de.visaq.view.elements.SensorOverview {
            return this.sensoroverview;
        }

        public setSensorOverview(sensoroverview : de.visaq.view.elements.SensorOverview) {
            this.sensoroverview = sensoroverview;
        }

        public getLegend() : de.visaq.view.elements.map.Legend {
            return this.legend;
        }

        public setLegend(legend : de.visaq.view.elements.map.Legend) {
            this.legend = legend;
        }
    }
    MapView["__class"] = "de.visaq.view.MapView";

}

