/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.overlay.factory {
    /**
     * Builder for building overlays with the given factories.
     * 
     * @param {Array} factories	Are the Overlay Factories used to fabricate Map Overlays
     * @class
     */
    export class OverlayBuilder {
        /*private*/ factories : de.visaq.view.overlay.factory.OverlayFactory[] = null;

        public constructor(factories? : any) {
            if(((factories != null && factories instanceof <any>Array && (factories.length==0 || factories[0] == null ||(factories[0] != null && factories[0] instanceof <any>de.visaq.view.overlay.factory.OverlayFactory))) || factories === null)) {
                let __args = arguments;
                this.factories = null;
            } else if(factories === undefined) {
                let __args = arguments;
                this.factories = null;
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {de.visaq.model.PointData[]} pointdata 	Is the data of the Sensors that is used to create the Map Overlay
         * @return				{*[]} A list of Overlays that where build by using the given factories.
         */
        public buildOverlays(pointdata : Array<de.visaq.model.PointData>) : Array<de.visaq.view.elements.map.MapOverlay> {
            return null;
        }
    }
    OverlayBuilder["__class"] = "de.visaq.view.overlay.factory.OverlayBuilder";

}

