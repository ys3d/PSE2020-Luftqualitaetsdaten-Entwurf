/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var model;
        (function (model) {
            var sensorthings;
            (function (sensorthings) {
                var UnitOfMeasurement = (function () {
                    function UnitOfMeasurement(name, symbol, definition) {
                        if (this.symbol === undefined)
                            this.symbol = null;
                        if (this.name === undefined)
                            this.name = null;
                        if (this.definition === undefined)
                            this.definition = null;
                        this.name = name;
                        this.symbol = symbol;
                        this.definition = definition;
                    }
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    UnitOfMeasurement.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    return UnitOfMeasurement;
                }());
                sensorthings.UnitOfMeasurement = UnitOfMeasurement;
                UnitOfMeasurement["__class"] = "de.visaq.model.sensorthings.UnitOfMeasurement";
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
