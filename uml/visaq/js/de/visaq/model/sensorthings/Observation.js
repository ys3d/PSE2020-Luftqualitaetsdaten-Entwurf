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
                var Observation = (function (_super) {
                    __extends(Observation, _super);
                    function Observation(id, selfUrl, phenomenonTime, result, resultTime, datastreamLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.phenomenonTime === undefined)
                            _this.phenomenonTime = null;
                        if (_this.result === undefined)
                            _this.result = null;
                        if (_this.resultTime === undefined)
                            _this.resultTime = null;
                        if (_this.datastreamLink === undefined)
                            _this.datastreamLink = null;
                        _this.phenomenonTime = phenomenonTime;
                        _this.result = result;
                        _this.resultTime = resultTime;
                        _this.datastreamLink = datastreamLink;
                        return _this;
                    }
                    Observation.prototype.isOlder = function (other) {
                        return false;
                    };
                    Observation.prototype.isNewer = function (other) {
                        return false;
                    };
                    Observation.prototype.isEqualOld = function (other) {
                        return false;
                    };
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    Observation.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.ObservationController}
                     */
                    Observation.prototype.getController = function () {
                        return new de.visaq.controller.ObservationController();
                    };
                    return Observation;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.Observation = Observation;
                Observation["__class"] = "de.visaq.model.sensorthings.Observation";
                Observation["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsTimeStamp"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
