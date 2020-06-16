var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var overlay;
            (function (overlay) {
                var factory;
                (function (factory) {
                    var SensorOverlayFactory = (function (_super) {
                        __extends(SensorOverlayFactory, _super);
                        function SensorOverlayFactory(airQualityData) {
                            return _super.call(this, airQualityData) || this;
                        }
                        /**
                         *
                         * @param {de.visaq.model.PointData[]} pointdata
                         * @return {*}
                         */
                        SensorOverlayFactory.prototype.build = function (pointdata) {
                            return null;
                        };
                        return SensorOverlayFactory;
                    }(de.visaq.view.overlay.factory.OverlayFactory));
                    factory.SensorOverlayFactory = SensorOverlayFactory;
                    SensorOverlayFactory["__class"] = "de.visaq.view.overlay.factory.SensorOverlayFactory";
                })(factory = overlay.factory || (overlay.factory = {}));
            })(overlay = view.overlay || (view.overlay = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
