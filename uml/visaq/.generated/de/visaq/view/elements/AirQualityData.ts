/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.elements {
    export enum AirQualityData {
        FEINSTAUB, TEMPERATUR, LUFTFEUCHTIGKEIT, LUFTDRUCK
    }

    /** @ignore */
    export class AirQualityData_$WRAPPER {
        /*private*/ qualityData = "";

        constructor(protected _$ordinal : number, protected _$name : string, qualityData) {
            this.qualityData = qualityData;
        }

        public choosenData() : string {
            return this.qualityData;
        }
        public name() : string { return this._$name; }
        public ordinal() : number { return this._$ordinal; }
    }
    AirQualityData["__class"] = "de.visaq.view.elements.AirQualityData";
    AirQualityData["__interfaces"] = ["java.lang.Comparable","java.io.Serializable"];

    AirQualityData["_$wrappers"] = [new AirQualityData_$WRAPPER(0, "FEINSTAUB", "Feinstaub"), new AirQualityData_$WRAPPER(1, "TEMPERATUR", "Temperatur"), new AirQualityData_$WRAPPER(2, "LUFTFEUCHTIGKEIT", "Luftfeuchtigkeit"), new AirQualityData_$WRAPPER(3, "LUFTDRUCK", "Luftdruck")];

}

