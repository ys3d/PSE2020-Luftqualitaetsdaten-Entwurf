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
                    /**
                     * Creates an interpolated Map Overlay from given Sensor Data,
                     * @param {de.visaq.view.elements.AirQualityData} airQualityData
                     * @class
                     * @extends de.visaq.view.overlay.factory.OverlayFactory
                     */
                    var InterpolationOverlayFactory = (function (_super) {
                        __extends(InterpolationOverlayFactory, _super);
                        function InterpolationOverlayFactory(airQualityData) {
                            return _super.call(this, airQualityData) || this;
                        }
                        /**
                         *
                         * @param {de.visaq.model.PointData[]} pointdata
                         * @return {*}
                         */
                        InterpolationOverlayFactory.prototype.build = function (pointdata) {
                            return null;
                        };
                        return InterpolationOverlayFactory;
                    }(de.visaq.view.overlay.factory.OverlayFactory));
                    factory.InterpolationOverlayFactory = InterpolationOverlayFactory;
                    InterpolationOverlayFactory["__class"] = "de.visaq.view.overlay.factory.InterpolationOverlayFactory";
                })(factory = overlay.factory || (overlay.factory = {}));
            })(overlay = view.overlay || (view.overlay = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
