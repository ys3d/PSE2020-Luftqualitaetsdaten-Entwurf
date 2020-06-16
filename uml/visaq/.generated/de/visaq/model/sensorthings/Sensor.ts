/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class Sensor extends de.visaq.model.sensorthings.Sensorthings<Sensor> implements de.visaq.model.sensorthings.SensorthingsProperties {
        public description : string;

        public name : string;

        public properties : any;

        public datastreams : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>;

        public constructor(id : string, selfUrl : string, description : string, name : string, properties : any, datastreams : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>) {
            super(id, selfUrl);
            if(this.description===undefined) this.description = null;
            if(this.name===undefined) this.name = null;
            if(this.properties===undefined) this.properties = null;
            if(this.datastreams===undefined) this.datastreams = null;
            this.description = description;
            this.name = name;
            this.properties = properties;
            this.datastreams = datastreams;
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
         * @return {de.visaq.controller.SensorController}
         */
        public getController() : de.visaq.controller.SensorController {
            return new de.visaq.controller.SensorController();
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
    Sensor["__class"] = "de.visaq.model.sensorthings.Sensor";
    Sensor["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];


}

