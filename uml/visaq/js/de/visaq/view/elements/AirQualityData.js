/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var elements;
            (function (elements) {
                var AirQualityData;
                (function (AirQualityData) {
                    AirQualityData[AirQualityData["FEINSTAUB"] = 0] = "FEINSTAUB";
                    AirQualityData[AirQualityData["TEMPERATUR"] = 1] = "TEMPERATUR";
                    AirQualityData[AirQualityData["LUFTFEUCHTIGKEIT"] = 2] = "LUFTFEUCHTIGKEIT";
                    AirQualityData[AirQualityData["LUFTDRUCK"] = 3] = "LUFTDRUCK";
                })(AirQualityData = elements.AirQualityData || (elements.AirQualityData = {}));
                /** @ignore */
                var AirQualityData_$WRAPPER = (function () {
                    function AirQualityData_$WRAPPER(_$ordinal, _$name, qualityData) {
                        this._$ordinal = _$ordinal;
                        this._$name = _$name;
                        /*private*/ this.qualityData = "";
                        this.qualityData = qualityData;
                    }
                    AirQualityData_$WRAPPER.prototype.choosenData = function () {
                        return this.qualityData;
                    };
                    AirQualityData_$WRAPPER.prototype.name = function () { return this._$name; };
                    AirQualityData_$WRAPPER.prototype.ordinal = function () { return this._$ordinal; };
                    return AirQualityData_$WRAPPER;
                }());
                elements.AirQualityData_$WRAPPER = AirQualityData_$WRAPPER;
                AirQualityData["__class"] = "de.visaq.view.elements.AirQualityData";
                AirQualityData["__interfaces"] = ["java.lang.Comparable", "java.io.Serializable"];
                AirQualityData["_$wrappers"] = [new AirQualityData_$WRAPPER(0, "FEINSTAUB", "Feinstaub"), new AirQualityData_$WRAPPER(1, "TEMPERATUR", "Temperatur"), new AirQualityData_$WRAPPER(2, "LUFTFEUCHTIGKEIT", "Luftfeuchtigkeit"), new AirQualityData_$WRAPPER(3, "LUFTDRUCK", "Luftdruck")];
            })(elements = view.elements || (view.elements = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
