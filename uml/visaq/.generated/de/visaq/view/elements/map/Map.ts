/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.elements.map {
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
    export class Map {
        public map : any = null;

        /*private*/ mapOverlayList : Array<de.visaq.view.elements.map.MapOverlay> = null;

        public constructor(map_id : string, preferCanvas : boolean, attributionControl : boolean, zoomControl : boolean, closePopupOnClick : boolean, zoomsnap : number, zoomDelta : number, trackResize : boolean, boxZoom : boolean, doubleClickZoom : boolean, draggin : boolean) {
        }

        public zoom() {
        }

        public scrollen() {
        }

        public getMapOverlayList() : Array<de.visaq.view.elements.map.MapOverlay> {
            return this.mapOverlayList;
        }

        public setMapOverlayList(mapOverlay : Array<de.visaq.view.elements.map.MapOverlay>) {
            this.mapOverlayList = mapOverlay;
        }

        public removeMapOverlay() : de.visaq.view.elements.map.MapOverlay {
            return null;
        }

        public addMapOverlay(mapOverlay : de.visaq.view.elements.map.MapOverlay) {
        }
    }
    Map["__class"] = "de.visaq.view.elements.map.Map";

}

