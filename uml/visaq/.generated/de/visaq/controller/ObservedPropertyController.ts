/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    export class ObservedPropertyController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.ObservedProperty> {
        public getAll() : Array<de.visaq.model.sensorthings.ObservedProperty> {
            return null;
        }

        public get$de_visaq_model_sensorthings_Datastream(datastream : de.visaq.model.sensorthings.Datastream) : de.visaq.model.sensorthings.ObservedProperty {
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

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.ObservedProperty {
            return null;
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.ObservedProperty}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.ObservedProperty {
            json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
            let observedProperty : de.visaq.model.sensorthings.ObservedProperty = new de.visaq.model.sensorthings.ObservedProperty(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), json.getString("definition"), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream>(json.getString("Datastreams@iot.navigationLink"))));
            return observedProperty;
        }
    }
    ObservedPropertyController["__class"] = "de.visaq.controller.ObservedPropertyController";

}

