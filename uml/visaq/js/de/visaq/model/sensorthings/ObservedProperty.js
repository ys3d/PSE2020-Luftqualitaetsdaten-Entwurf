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
                var ObservedProperty = (function (_super) {
                    __extends(ObservedProperty, _super);
                    function ObservedProperty(id, selfUrl, description, name, properties, definition, datastreamsLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.name === undefined)
                            _this.name = null;
                        if (_this.definition === undefined)
                            _this.definition = null;
                        if (_this.description === undefined)
                            _this.description = null;
                        if (_this.properties === undefined)
                            _this.properties = null;
                        if (_this.datastreamsLink === undefined)
                            _this.datastreamsLink = null;
                        _this.name = name;
                        _this.definition = definition;
                        _this.description = description;
                        _this.properties = properties;
                        _this.datastreamsLink = datastreamsLink;
                        return _this;
                    }
                    ObservedProperty.prototype.getPropertyByKey = function () {
                        return null;
                    };
                    ObservedProperty.prototype.hasProperties = function () {
                        return false;
                    };
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    ObservedProperty.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.ObservedPropertyController}
                     */
                    ObservedProperty.prototype.getController = function () {
                        return new de.visaq.controller.ObservedPropertyController();
                    };
                    return ObservedProperty;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.ObservedProperty = ObservedProperty;
                ObservedProperty["__class"] = "de.visaq.model.sensorthings.ObservedProperty";
                ObservedProperty["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
