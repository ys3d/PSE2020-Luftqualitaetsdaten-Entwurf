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
            var MapView = (function (_super) {
                __extends(MapView, _super);
                function MapView(language, colorTheme) {
                    var _this = _super.call(this, language, colorTheme) || this;
                    if (_this.map === undefined)
                        _this.map = null;
                    if (_this.sensoroverview === undefined)
                        _this.sensoroverview = null;
                    if (_this.legend === undefined)
                        _this.legend = null;
                    return _this;
                }
                MapView.prototype.show = function () {
                };
                MapView.prototype.showSensoroverview = function () {
                };
                MapView.prototype.showLegend = function () {
                };
                MapView.prototype.showTimeline = function () {
                };
                MapView.prototype.getMap = function () {
                    return this.map;
                };
                MapView.prototype.setMap = function (map) {
                    this.map = map;
                };
                MapView.prototype.getSensorOverview = function () {
                    return this.sensoroverview;
                };
                MapView.prototype.setSensorOverview = function (sensoroverview) {
                    this.sensoroverview = sensoroverview;
                };
                MapView.prototype.getLegend = function () {
                    return this.legend;
                };
                MapView.prototype.setLegend = function (legend) {
                    this.legend = legend;
                };
                return MapView;
            }(de.visaq.view.View));
            view.MapView = MapView;
            MapView["__class"] = "de.visaq.view.MapView";
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
