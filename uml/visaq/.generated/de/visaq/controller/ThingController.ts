/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over Thing objects.
     * @class
     * @extends de.visaq.controller.SensorthingsController
     */
    export class ThingController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.Thing> {
        public get$java_awt_Polygon(polygon : java.awt.Polygon) : Array<de.visaq.model.sensorthings.Thing> {
            return null;
        }

        /**
         * Retrieves the Thing objects spatially located inside the specified polygon.
         * 
         * @param {java.awt.Polygon} polygon Polygon the Thing objects are located inside of.
         * @return {de.visaq.model.sensorthings.Thing[]} An array of Thing objects that were retrieved.
         */
        public get(polygon? : any) : any {
            if(((polygon != null && polygon instanceof <any>java.awt.Polygon) || polygon === null)) {
                return <any>this.get$java_awt_Polygon(polygon);
            } else if(((typeof polygon === 'string') || polygon === null)) {
                return <any>this.get$java_lang_String(polygon);
            } else if(((polygon != null && (polygon["__interfaces"] != null && polygon["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || polygon.constructor != null && polygon.constructor["__interfaces"] != null && polygon.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || polygon === null)) {
                super.get(polygon);
            } else if(((polygon != null && (polygon["__interfaces"] != null && polygon["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || polygon.constructor != null && polygon.constructor["__interfaces"] != null && polygon.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || polygon === null)) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(polygon);
            } else if(((typeof polygon === 'string') || polygon === null)) {
                return <any>this.get$java_lang_String(polygon);
            } else throw new Error('invalid overload');
        }

        public getAll() : Array<de.visaq.model.sensorthings.Thing> {
            let multiLink : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Thing> = <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Thing>("http://api.smartaq.net/v1.0/Things?$top=3"));
            return multiLink.get(this);
        }

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.Thing {
            return null;
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.Thing}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.Thing {
            json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
            let thing : de.visaq.model.sensorthings.Thing = new de.visaq.model.sensorthings.Thing(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream>(json.getString("Datastreams@iot.navigationLink"))), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.HistoricalLocation>(json.getString("HistoricalLocations@iot.navigationLink"))), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location>(json.getString("Locations@iot.navigationLink"))));
            return thing;
        }
    }
    ThingController["__class"] = "de.visaq.controller.ThingController";

}

