/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class Location extends de.visaq.model.sensorthings.Sensorthings<Location> {
        public name : string;

        public description : string;

        public location : java.awt.Point;

        public historicalLocationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.HistoricalLocation>;

        public thingsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Thing>;

        public constructor(id : string, selfUrl : string, name : string, description : string, location : java.awt.Point, historicalLocationsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.HistoricalLocation>, thingsLink : de.visaq.controller.link.MultiNavigationLink<de.visaq.model.sensorthings.Thing>) {
            super(id, selfUrl);
            if(this.name===undefined) this.name = null;
            if(this.description===undefined) this.description = null;
            if(this.location===undefined) this.location = null;
            if(this.historicalLocationsLink===undefined) this.historicalLocationsLink = null;
            if(this.thingsLink===undefined) this.thingsLink = null;
            this.name = name;
            this.description = description;
            this.location = location;
            this.historicalLocationsLink = historicalLocationsLink;
            this.thingsLink = thingsLink;
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
         * @return {de.visaq.controller.LocationController}
         */
        public getController() : de.visaq.controller.LocationController {
            return new de.visaq.controller.LocationController();
        }
    }
    Location["__class"] = "de.visaq.model.sensorthings.Location";

}

