/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var overlay;
            (function (overlay) {
                var factory;
                (function (factory) {
                    /**
                     * Builder for building overlays with the given factories.
                     *
                     * @param {Array} factories	Are the Overlay Factories used to fabricate Map Overlays
                     * @class
                     */
                    var OverlayBuilder = (function () {
                        function OverlayBuilder(factories) {
                            /*private*/ this.factories = null;
                            if (((factories != null && factories instanceof Array && (factories.length == 0 || factories[0] == null || (factories[0] != null && factories[0] instanceof de.visaq.view.overlay.factory.OverlayFactory))) || factories === null)) {
                                var __args = arguments;
                                this.factories = null;
                            }
                            else if (factories === undefined) {
                                var __args = arguments;
                                this.factories = null;
                            }
                            else
                                throw new Error('invalid overload');
                        }
                        /**
                         *
                         * @param {de.visaq.model.PointData[]} pointdata 	Is the data of the Sensors that is used to create the Map Overlay
                         * @return				{*[]} A list of Overlays that where build by using the given factories.
                         */
                        OverlayBuilder.prototype.buildOverlays = function (pointdata) {
                            return null;
                        };
                        return OverlayBuilder;
                    }());
                    factory.OverlayBuilder = OverlayBuilder;
                    OverlayBuilder["__class"] = "de.visaq.view.overlay.factory.OverlayBuilder";
                })(factory = overlay.factory || (overlay.factory = {}));
            })(overlay = view.overlay || (view.overlay = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
