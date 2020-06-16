/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over Observation objects.
     * @class
     * @extends de.visaq.controller.SensorthingsController
     */
    export class ObservationController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.Observation> {
        public getAll() : Array<de.visaq.model.sensorthings.Observation> {
            return null;
        }

        public get$de_visaq_model_sensorthings_Datastream(datastream : de.visaq.model.sensorthings.Datastream) : de.visaq.model.sensorthings.Observation {
            return null;
        }

        public get(datastream? : any) : any {
            if(((datastream != null && datastream instanceof <any>de.visaq.model.sensorthings.Datastream) || datastream === null)) {
                return <any>this.get$de_visaq_model_sensorthings_Datastream(datastream);
            } else if(((typeof datastream === 'string') || datastream === null)) {
                return <any>this.get$java_lang_String(datastream);
            } else if(((datastream != null && (datastream["__interfaces"] != null && datastream["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || datastream.constructor != null && datastream.constructor["__interfaces"] != null && datastream.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || datastream === null)) {
                super.get(datastream);
            } else if(((datastream != null && (datastream["__interfaces"] != null && datastream["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || datastream.constructor != null && datastream.constructor["__interfaces"] != null && datastream.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || datastream === null)) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(datastream);
            } else if(((typeof datastream === 'string') || datastream === null)) {
                return <any>this.get$java_lang_String(datastream);
            } else throw new Error('invalid overload');
        }

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.Observation {
            return null;
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.Observation}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.Observation {
            try {
                json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
                let observation : de.visaq.model.sensorthings.Observation = new de.visaq.model.sensorthings.Observation(json.getString("@iot.id"), json.getString("@iot.selfLink"), de.visaq.controller.UtilityController.buildTime(json, "phenomenonTime"), json.getDouble("result"), de.visaq.controller.UtilityController.buildTime(json, "resultTime"), <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Datastream>(json.getString("Datastream@iot.navigationLink"))));
                return observation;
            } catch(e) {
                return null;
            };
        }
    }
    ObservationController["__class"] = "de.visaq.controller.ObservationController";

}

