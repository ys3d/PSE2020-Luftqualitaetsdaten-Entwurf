/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class ObservedProperty extends de.visaq.model.sensorthings.Sensorthings<ObservedProperty> implements de.visaq.model.sensorthings.SensorthingsProperties {
        public name : string;

        public definition : string;

        public description : string;

        public properties : any;

        public datastreamsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>;

        public constructor(id : string, selfUrl : string, description : string, name : string, properties : any, definition : string, datastreamsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>) {
            super(id, selfUrl);
            if(this.name===undefined) this.name = null;
            if(this.definition===undefined) this.definition = null;
            if(this.description===undefined) this.description = null;
            if(this.properties===undefined) this.properties = null;
            if(this.datastreamsLink===undefined) this.datastreamsLink = null;
            this.name = name;
            this.definition = definition;
            this.description = description;
            this.properties = properties;
            this.datastreamsLink = datastreamsLink;
        }

        public getPropertyByKey() : any {
            return null;
        }

        public hasProperties() : boolean {
            return false;
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
         * @return {de.visaq.controller.ObservedPropertyController}
         */
        public getController() : de.visaq.controller.ObservedPropertyController {
            return new de.visaq.controller.ObservedPropertyController();
        }
    }
    ObservedProperty["__class"] = "de.visaq.model.sensorthings.ObservedProperty";
    ObservedProperty["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];


}

