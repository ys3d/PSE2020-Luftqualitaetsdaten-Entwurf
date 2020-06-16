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
                var Datastream = (function (_super) {
                    __extends(Datastream, _super);
                    function Datastream(id, selfUrl, name, description, properties, observationTypeLink, sensorLink, thingLink, observationsLink, unitOfMeasurement, observedPropertyLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.name === undefined)
                            _this.name = null;
                        if (_this.description === undefined)
                            _this.description = null;
                        if (_this.unitOfMeasurement === undefined)
                            _this.unitOfMeasurement = null;
                        if (_this.observationTypeLink === undefined)
                            _this.observationTypeLink = null;
                        if (_this.observationsLink === undefined)
                            _this.observationsLink = null;
                        if (_this.sensorLink === undefined)
                            _this.sensorLink = null;
                        if (_this.thingLink === undefined)
                            _this.thingLink = null;
                        _this.name = name;
                        _this.description = description;
                        _this.unitOfMeasurement = unitOfMeasurement;
                        _this.observationTypeLink = observationTypeLink;
                        _this.observationsLink = observationsLink;
                        _this.sensorLink = sensorLink;
                        _this.thingLink = thingLink;
                        return _this;
                    }
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    Datastream.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.DatastreamController}
                     */
                    Datastream.prototype.getController = function () {
                        return new de.visaq.controller.DatastreamController();
                    };
                    /**
                     *
                     * @return {*}
                     */
                    Datastream.prototype.getPropertyByKey = function () {
                        return null;
                    };
                    /**
                     *
                     * @return {boolean}
                     */
                    Datastream.prototype.hasProperties = function () {
                        return false;
                    };
                    return Datastream;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.Datastream = Datastream;
                Datastream["__class"] = "de.visaq.model.sensorthings.Datastream";
                Datastream["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
