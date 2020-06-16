/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over Sensor objects.
     * @class
     * @extends de.visaq.controller.SensorthingsController
     */
    export class SensorController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.Sensor> {
        public get$de_visaq_model_sensorthings_Thing(thing : de.visaq.model.sensorthings.Thing) : Array<de.visaq.model.sensorthings.Sensor> {
            return null;
        }

        /**
         * Retrieves all Sensor objects associated with the specified Thing.
         * 
         * @param {de.visaq.model.sensorthings.Thing} thing	Thing the Sensor objects are associated with.
         * @return		{de.visaq.model.sensorthings.Sensor[]} An array of Sensor objects that were retrieved.
         */
        public get(thing? : any) : any {
            if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Thing) || thing === null)) {
                return <any>this.get$de_visaq_model_sensorthings_Thing(thing);
            } else if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Datastream) || thing === null)) {
                return <any>this.get$de_visaq_model_sensorthings_Datastream(thing);
            } else if(((typeof thing === 'string') || thing === null)) {
                return <any>this.get$java_lang_String(thing);
            } else if(((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || thing === null)) {
                super.get(thing);
            } else if(((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || thing === null)) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(thing);
            } else if(((typeof thing === 'string') || thing === null)) {
                return <any>this.get$java_lang_String(thing);
            } else throw new Error('invalid overload');
        }

        public getAll() : Array<de.visaq.model.sensorthings.Sensor> {
            return null;
        }

        public get$de_visaq_model_sensorthings_Datastream(datastream : de.visaq.model.sensorthings.Datastream) : de.visaq.model.sensorthings.Sensor {
            return null;
        }

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.Sensor {
            return null;
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.Sensor}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.Sensor {
            json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
            let sensor : de.visaq.model.sensorthings.Sensor = new de.visaq.model.sensorthings.Sensor(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("description"), json.getString("name"), de.visaq.controller.UtilityController.buildProperties(json), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream>(json.getString("Datastreams@iot.navigationLink"))));
            return sensor;
        }
    }
    SensorController["__class"] = "de.visaq.controller.SensorController";

}

