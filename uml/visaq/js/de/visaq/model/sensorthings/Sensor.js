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
        var model;
        (function (model) {
            var sensorthings;
            (function (sensorthings) {
                var Sensor = (function (_super) {
                    __extends(Sensor, _super);
                    function Sensor(id, selfUrl, description, name, properties, datastreams) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.description === undefined)
                            _this.description = null;
                        if (_this.name === undefined)
                            _this.name = null;
                        if (_this.properties === undefined)
                            _this.properties = null;
                        if (_this.datastreams === undefined)
                            _this.datastreams = null;
                        _this.description = description;
                        _this.name = name;
                        _this.properties = properties;
                        _this.datastreams = datastreams;
                        return _this;
                    }
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    Sensor.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.SensorController}
                     */
                    Sensor.prototype.getController = function () {
                        return new de.visaq.controller.SensorController();
                    };
                    /**
                     *
                     * @return {*}
                     */
                    Sensor.prototype.getPropertyByKey = function () {
                        return null;
                    };
                    /**
                     *
                     * @return {boolean}
                     */
                    Sensor.prototype.hasProperties = function () {
                        return false;
                    };
                    return Sensor;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.Sensor = Sensor;
                Sensor["__class"] = "de.visaq.model.sensorthings.Sensor";
                Sensor["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
