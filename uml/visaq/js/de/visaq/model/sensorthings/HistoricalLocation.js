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
                var HistoricalLocation = (function (_super) {
                    __extends(HistoricalLocation, _super);
                    function HistoricalLocation(id, selfUrl, time, thingLink, locationsLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.time === undefined)
                            _this.time = null;
                        if (_this.thingLink === undefined)
                            _this.thingLink = null;
                        if (_this.locationsLink === undefined)
                            _this.locationsLink = null;
                        _this.time = time;
                        _this.thingLink = thingLink;
                        _this.locationsLink = locationsLink;
                        return _this;
                    }
                    HistoricalLocation.prototype.getId = function () {
                        return this.id;
                    };
                    HistoricalLocation.prototype.isOlder = function (other) {
                        return false;
                    };
                    HistoricalLocation.prototype.isNewer = function (other) {
                        return false;
                    };
                    HistoricalLocation.prototype.isEqualOld = function (other) {
                        return false;
                    };
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    HistoricalLocation.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.HistoricalLocationController}
                     */
                    HistoricalLocation.prototype.getController = function () {
                        return new de.visaq.controller.HistoricalLocationController();
                    };
                    return HistoricalLocation;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.HistoricalLocation = HistoricalLocation;
                HistoricalLocation["__class"] = "de.visaq.model.sensorthings.HistoricalLocation";
                HistoricalLocation["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsTimeStamp"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
