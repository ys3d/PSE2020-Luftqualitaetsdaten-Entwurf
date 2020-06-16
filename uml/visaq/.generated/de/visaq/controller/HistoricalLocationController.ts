/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over HistoricalLocation objects.
     * @class
     * @extends de.visaq.controller.SensorthingsController
     */
    export class HistoricalLocationController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.HistoricalLocation> {
        public getAll() : Array<de.visaq.model.sensorthings.HistoricalLocation> {
            return null;
        }

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.HistoricalLocation {
            return null;
        }

        public get(id? : any) : any {
            if(((typeof id === 'string') || id === null)) {
                return <any>this.get$java_lang_String(id);
            } else if(((id != null && (id["__interfaces"] != null && id["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || id.constructor != null && id.constructor["__interfaces"] != null && id.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || id === null)) {
                super.get(id);
            } else if(((id != null && (id["__interfaces"] != null && id["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || id.constructor != null && id.constructor["__interfaces"] != null && id.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || id === null)) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(id);
            } else if(((typeof id === 'string') || id === null)) {
                return <any>this.get$java_lang_String(id);
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.HistoricalLocation}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.HistoricalLocation {
            json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
            let historicalLocation : de.visaq.model.sensorthings.HistoricalLocation = new de.visaq.model.sensorthings.HistoricalLocation(json.getString("@iot.id"), json.getString("@iot.selfLink"), de.visaq.controller.UtilityController.buildTime(json, "time"), <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Thing>(json.getString("Thing@iot.navigationLink"))), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location>(json.getString("Locations@iot.navigationLink"))));
            return historicalLocation;
        }
    }
    HistoricalLocationController["__class"] = "de.visaq.controller.HistoricalLocationController";

}

