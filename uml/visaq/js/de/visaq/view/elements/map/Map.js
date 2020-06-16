/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var elements;
            (function (elements) {
                var map;
                (function (map) {
                    /**
                     * Sole constructor of the class.
                     *
                     * @param {string} map_id				DOM_Id the of the map as HTML object.
                     * @param {boolean} preferCanvas			Whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.
                     * @param {boolean} attributionControl	Whether a attribution control is added to the map.
                     * @param {boolean} zoomControl			Whether a zoom control is added to the map.
                     * @param {boolean} closePopupOnClick		True by default
                     * @param {number} zoomsnap
                     * @param {number} zoomDelta
                     * @param {boolean} trackResize
                     * @param {boolean} boxZoom
                     * @param {boolean} doubleClickZoom
                     * @param {boolean} draggin
                     * @class
                     */
                    var Map = (function () {
                        function Map(map_id, preferCanvas, attributionControl, zoomControl, closePopupOnClick, zoomsnap, zoomDelta, trackResize, boxZoom, doubleClickZoom, draggin) {
                            this.map = null;
                            /*private*/ this.mapOverlayList = null;
                        }
                        Map.prototype.zoom = function () {
                        };
                        Map.prototype.scrollen = function () {
                        };
                        Map.prototype.getMapOverlayList = function () {
                            return this.mapOverlayList;
                        };
                        Map.prototype.setMapOverlayList = function (mapOverlay) {
                            this.mapOverlayList = mapOverlay;
                        };
                        Map.prototype.removeMapOverlay = function () {
                            return null;
                        };
                        Map.prototype.addMapOverlay = function (mapOverlay) {
                        };
                        return Map;
                    }());
                    map.Map = Map;
                    Map["__class"] = "de.visaq.view.elements.map.Map";
                })(map = elements.map || (elements.map = {}));
            })(elements = view.elements || (view.elements = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
