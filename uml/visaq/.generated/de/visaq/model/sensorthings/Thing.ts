/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class Thing extends de.visaq.model.sensorthings.Sensorthings<Thing> implements de.visaq.model.sensorthings.SensorthingsProperties {
        public description : string;

        public name : string;

        public properties : any;

        public datastreamsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>;

        public historicalLocationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.HistoricalLocation>;

        public locationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Location>;

        public constructor(id : string, selfUrl : string, description : string, name : string, properties : any, datastreamsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Datastream>, historicalLocationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.HistoricalLocation>, locationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Location>) {
            super(id, selfUrl);
            if(this.description===undefined) this.description = null;
            if(this.name===undefined) this.name = null;
            if(this.properties===undefined) this.properties = null;
            if(this.datastreamsLink===undefined) this.datastreamsLink = null;
            if(this.historicalLocationsLink===undefined) this.historicalLocationsLink = null;
            if(this.locationsLink===undefined) this.locationsLink = null;
            this.description = description;
            this.name = name;
            this.properties = properties;
            this.datastreamsLink = datastreamsLink;
            this.historicalLocationsLink = historicalLocationsLink;
            this.locationsLink = locationsLink;
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
         * @return {de.visaq.controller.ThingController}
         */
        public getController() : de.visaq.controller.ThingController {
            return new de.visaq.controller.ThingController();
        }
    }
    Thing["__class"] = "de.visaq.model.sensorthings.Thing";
    Thing["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsProperties"];


}

