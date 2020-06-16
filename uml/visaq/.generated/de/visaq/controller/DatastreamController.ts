/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over Datastream objects.
     * @class
     * @extends de.visaq.controller.SensorthingsController
     */
    export class DatastreamController extends de.visaq.controller.SensorthingsController<de.visaq.model.sensorthings.Datastream> {
        public get$de_visaq_model_sensorthings_Thing(thing : de.visaq.model.sensorthings.Thing) : Array<de.visaq.model.sensorthings.Datastream> {
            return thing.datastreamsLink.get(this);
        }

        public get$de_visaq_model_sensorthings_Sensor(sensor : de.visaq.model.sensorthings.Sensor) : Array<de.visaq.model.sensorthings.Datastream> {
            return sensor.datastreams.get(this);
        }

        public getAll() : Array<de.visaq.model.sensorthings.Datastream> {
            return new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Datastream>("/Datastreams").get(this);
        }

        public get$de_visaq_model_sensorthings_Thing$de_visaq_model_sensorthings_ObservedProperty(thing : de.visaq.model.sensorthings.Thing, observedProperty : de.visaq.model.sensorthings.ObservedProperty) : de.visaq.model.sensorthings.Datastream {
            return null;
        }

        /**
         * Retrieves the Datastream object for the observed property of the specified
         * Thing.
         * 
         * @param {de.visaq.model.sensorthings.Thing} thing            Thing the Datastream is associated with.
         * @param {de.visaq.model.sensorthings.ObservedProperty} observedProperty Observed Property the Datastream is associated with.
         * @return {de.visaq.model.sensorthings.Datastream} The Datastream object that was retrieved.
         */
        public get(thing? : any, observedProperty? : any) : any {
            if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Thing) || thing === null) && ((observedProperty != null && observedProperty instanceof <any>de.visaq.model.sensorthings.ObservedProperty) || observedProperty === null)) {
                return <any>this.get$de_visaq_model_sensorthings_Thing$de_visaq_model_sensorthings_ObservedProperty(thing, observedProperty);
            } else if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Sensor) || thing === null) && ((observedProperty != null && observedProperty instanceof <any>de.visaq.model.sensorthings.ObservedProperty) || observedProperty === null)) {
                return <any>this.get$de_visaq_model_sensorthings_Sensor$de_visaq_model_sensorthings_ObservedProperty(thing, observedProperty);
            } else if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Thing) || thing === null) && observedProperty === undefined) {
                return <any>this.get$de_visaq_model_sensorthings_Thing(thing);
            } else if(((thing != null && thing instanceof <any>de.visaq.model.sensorthings.Sensor) || thing === null) && observedProperty === undefined) {
                return <any>this.get$de_visaq_model_sensorthings_Sensor(thing);
            } else if(((typeof thing === 'string') || thing === null) && observedProperty === undefined) {
                return <any>this.get$java_lang_String(thing);
            } else if(((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || thing === null) && observedProperty === undefined) {
                super.get(thing);
            } else if(((thing != null && (thing["__interfaces"] != null && thing["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || thing.constructor != null && thing.constructor["__interfaces"] != null && thing.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || thing === null) && observedProperty === undefined) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(thing);
            } else if(((typeof thing === 'string') || thing === null) && observedProperty === undefined) {
                return <any>this.get$java_lang_String(thing);
            } else throw new Error('invalid overload');
        }

        public get$de_visaq_model_sensorthings_Sensor$de_visaq_model_sensorthings_ObservedProperty(sensor : de.visaq.model.sensorthings.Sensor, observedProperty : de.visaq.model.sensorthings.ObservedProperty) : de.visaq.model.sensorthings.Datastream {
            return null;
        }

        public get$java_lang_String(id : string) : de.visaq.model.sensorthings.Datastream {
            return null;
        }

        /**
         * 
         * @param {org.json.JSONObject} json
         * @return {de.visaq.model.sensorthings.Datastream}
         */
        public singleBuild(json : org.json.JSONObject) : de.visaq.model.sensorthings.Datastream {
            json = de.visaq.controller.UtilityController.removeArrayWrapper(json);
            let datastream : de.visaq.model.sensorthings.Datastream = new de.visaq.model.sensorthings.Datastream(json.getString("@iot.id"), json.getString("@iot.selfLink"), json.getString("name"), json.getString("description"), json.getJSONObject("properties").toMap(), json.getString("observationType"), <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Sensor>(json.getString("Sensor@iot.navigationLink"))), <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.Thing>(json.getString("Thing@iot.navigationLink"))), <any>(new de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Observation>(json.getString("Observations@iot.navigationLink"))), de.visaq.controller.UtilityController.buildUnitOfMeasurement(json.getJSONObject("unitOfMeasurement")), <any>(new de.visaq.controller.link.SingleOnlineLink<de.visaq.model.sensorthings.ObservedProperty>(json.getString("ObservedProperty@iot.navigationLink"))));
            return datastream;
        }
    }
    DatastreamController["__class"] = "de.visaq.controller.DatastreamController";

}

