/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var model;
        (function (model) {
            var sensorthings;
            (function (sensorthings) {
                /**
                 * Creates a new Sensorthings object with the given id and the specified database link.
                 *
                 * @param {string} id 		Unique identifier of the object that will be created.
                 * @param {string} selfUrl	Links to the Sensorthings database object.
                 * @class
                 */
                var Sensorthings = (function () {
                    function Sensorthings(id, selfUrl) {
                        var _this = this;
                        if (((typeof id === 'string') || id === null) && ((typeof selfUrl === 'string') || selfUrl === null)) {
                            var __args = arguments;
                            if (this.id === undefined)
                                this.id = null;
                            if (this.selfLink === undefined)
                                this.selfLink = null;
                            if (this.id === undefined)
                                this.id = null;
                            if (this.selfLink === undefined)
                                this.selfLink = null;
                            (function () {
                                _this.id = id;
                                _this.selfLink = (new de.visaq.controller.link.SingleLocalLink(selfUrl, _this));
                            })();
                        }
                        else if (id === undefined && selfUrl === undefined) {
                            var __args = arguments;
                            if (this.id === undefined)
                                this.id = null;
                            if (this.selfLink === undefined)
                                this.selfLink = null;
                            if (this.id === undefined)
                                this.id = null;
                            if (this.selfLink === undefined)
                                this.selfLink = null;
                            (function () {
                                _this.id = null;
                                _this.selfLink = null;
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    return Sensorthings;
                }());
                sensorthings.Sensorthings = Sensorthings;
                Sensorthings["__class"] = "de.visaq.model.sensorthings.Sensorthings";
            })(sensorthings = model.sensorthings || (model.sensorthings = {}));
        })(model = visaq.model || (visaq.model = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
