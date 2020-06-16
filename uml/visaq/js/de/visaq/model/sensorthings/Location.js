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
                var Location = (function (_super) {
                    __extends(Location, _super);
                    function Location(id, selfUrl, name, description, location, historicalLocationsLink, thingsLink) {
                        var _this = _super.call(this, id, selfUrl) || this;
                        if (_this.name === undefined)
                            _this.name = null;
                        if (_this.description === undefined)
                            _this.description = null;
                        if (_this.location === undefined)
                            _this.location = null;
                        if (_this.historicalLocationsLink === undefined)
                            _this.historicalLocationsLink = null;
                        if (_this.thingsLink === undefined)
                            _this.thingsLink = null;
                        _this.name = name;
                        _this.description = description;
                        _this.location = location;
                        _this.historicalLocationsLink = historicalLocationsLink;
                        _this.thingsLink = thingsLink;
                        return _this;
                    }
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    Location.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    /**
                     *
                     * @return {de.visaq.controller.LocationController}
                     */
                    Location.prototype.getController = function () {
                        return new de.visaq.controller.LocationController();
                    };
                    return Location;
                }(de.visaq.model.sensorthings.Sensorthings));
                sensorthings.Location = Location;
                Location["__class"] = "de.visaq.model.sensorthings.Location";
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
