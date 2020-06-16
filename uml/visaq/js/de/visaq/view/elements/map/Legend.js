/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var elements;
            (function (elements) {
                var map;
                (function (map) {
                    var Legend = (function () {
                        function Legend(airQualityData) {
                            if (this.airQualityData === undefined)
                                this.airQualityData = null;
                            this.airQualityData = airQualityData;
                        }
                        Legend.prototype.show = function () {
                        };
                        /*private*/ Legend.prototype.gradient = function (airqualityData) {
                        };
                        return Legend;
                    }());
                    map.Legend = Legend;
                    Legend["__class"] = "de.visaq.view.elements.map.Legend";
                })(map = elements.map || (elements.map = {}));
            })(elements = view.elements || (view.elements = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
