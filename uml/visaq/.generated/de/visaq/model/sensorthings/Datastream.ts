/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class Datastream extends de.visaq.model.sensorthings.Sensorthings<Datastream> implements de.visaq.model.sensorthings.SensorthingsProperties {
        public name : string;

        public description : string;

        public unitOfMeasurement : de.visaq.model.sensorthings.UnitOfMeasurement;

        public observationTypeLink : string;

        public observationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Observation>;

        public sensorLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Sensor>;

        public thingLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Thing>;

        public constructor(id : string, selfUrl : string, name : string, description : string, properties : any, observationTypeLink : string, sensorLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Sensor>, thingLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Thing>, observationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Observation>, unitOfMeasurement : de.visaq.model.sensorthings.UnitOfMeasurement, observedPropertyLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.ObservedProperty>) {
            super(id, selfUrl);
            if(this.name===undefined) this.name = null;
            if(this.description===undefined) this.description = null;
            if(this.unitOfMeasurement===undefined) this.unitOfMeasurement = null;
            if(this.observationTypeLink===undefined) this.observationTypeLink = null;
            if(this.observationsLink===undefined) this.observationsLink = null;
            if(this.sensorLink===undefined) this.sensorLink = null;
            if(this.thingLink===undefined) this.thingLink = null;
            this.name = name;
            this.description = description;
            this.unitOfMeasurement = unitOfMeasurement;
            this.observationTypeLink = observationTypeLink;
            this.observationsLink = observationsLink;
            this.sensorLink = sensorLink;
            this.thingLink = thingLink;
        }

        /**
         * 
         * @param {*} obj
         * @return {boolean}
         */
        public equals(obj : any) : boolean {
            return /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this,obj));
        }

        /**
         * 
         * @return {de.visaq.controller.DatastreamController}
         */
        public getController() : de.visaq.controller.DatastreamController {
            return new de.visaq.controller.DatastreamController();
        }

        /**
         * 
         * @return {*}
         */
        public getPropertyByKey() : any {
            return null;
        }

        /**
         * 
         * @return {boolean}
         */
        public hasProperties() : boolean {
            return false;
        }
    }
    Datastream["__class"] = "de.visaq.model.sensorthings.Datastream";
    Datastream["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];


}

