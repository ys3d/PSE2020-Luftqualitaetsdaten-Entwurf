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
                var Thing = (function (_super) {
                    __extends(Thing, _super);
                    function Thing(id, selfUrl, description, name, properties, datastreamsLink, historicalLocationsLink, locationsLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.description === undefined)
                            _this.description = null;
                        if (_this.name === undefined)
                            _this.name = null;
                        if (_this.properties === undefined)
                            _this.properties = null;
                        if (_this.datastreamsLink === undefined)
                            _this.datastreamsLink = null;
                        if (_this.historicalLocationsLink === undefined)
                            _this.historicalLocationsLink = null;
                        if (_this.locationsLink === undefined)
                            _this.locationsLink = null;
                        _this.description = description;
                        _this.name = name;
                        _this.properties = properties;
                        _this.datastreamsLink = datastreamsLink;
                        _this.historicalLocationsLink = historicalLocationsLink;
                        _this.locationsLink = locationsLink;
                        return _this;
                    }
                    Thing.prototype.getPropertyByKey = function () {
                        return null;
                    };
                    Thing.prototype.hasProperties = function () {
                        return false;
                    };
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    Thing.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.ThingController}
                     */
                    Thing.prototype.getController = function () {
                        return new de.visaq.controller.ThingController();
                    };
                    return Thing;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.Thing = Thing;
                Thing["__class"] = "de.visaq.model.sensorthings.Thing";
                Thing["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
