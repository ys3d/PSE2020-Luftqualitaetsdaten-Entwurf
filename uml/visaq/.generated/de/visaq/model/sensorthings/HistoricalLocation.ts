/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class HistoricalLocation extends de.visaq.model.sensorthings.Sensorthings<HistoricalLocation> implements de.visaq.model.sensorthings.SensorthingsTimeStamp {
        public time : java.time.Instant;

        public thingLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Thing>;

        public locationsLink : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location>;

        public constructor(id : string, selfUrl : string, time : java.time.Instant, thingLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Thing>, locationsLink : de.visaq.controller.link.MultiOnlineLink<de.visaq.model.sensorthings.Location>) {
            super(id, selfUrl);
            if(this.time===undefined) this.time = null;
            if(this.thingLink===undefined) this.thingLink = null;
            if(this.locationsLink===undefined) this.locationsLink = null;
            this.time = time;
            this.thingLink = thingLink;
            this.locationsLink = locationsLink;
        }

        public getId() : string {
            return this.id;
        }

        public isOlder(other : HistoricalLocation) : boolean {
            return false;
        }

        public isNewer(other : HistoricalLocation) : boolean {
            return false;
        }

        public isEqualOld(other : HistoricalLocation) : boolean {
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
         * @return {de.visaq.controller.HistoricalLocationController}
         */
        public getController() : de.visaq.controller.HistoricalLocationController {
            return new de.visaq.controller.HistoricalLocationController();
        }
    }
    HistoricalLocation["__class"] = "de.visaq.model.sensorthings.HistoricalLocation";
    HistoricalLocation["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsTimeStamp"];


}

