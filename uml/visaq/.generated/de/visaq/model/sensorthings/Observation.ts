/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    export class Observation extends de.visaq.model.sensorthings.Sensorthings<Observation> implements de.visaq.model.sensorthings.SensorthingsTimeStamp {
        public phenomenonTime : java.time.Instant;

        public result : number;

        public resultTime : java.time.Instant;

        public datastreamLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Datastream>;

        public constructor(id : string, selfUrl : string, phenomenonTime : java.time.Instant, result : number, resultTime : java.time.Instant, datastreamLink : de.visaq.controller.link.SingleNavigationLink<de.visaq.model.sensorthings.Datastream>) {
            super(id, selfUrl);
            if(this.phenomenonTime===undefined) this.phenomenonTime = null;
            if(this.result===undefined) this.result = null;
            if(this.resultTime===undefined) this.resultTime = null;
            if(this.datastreamLink===undefined) this.datastreamLink = null;
            this.phenomenonTime = phenomenonTime;
            this.result = result;
            this.resultTime = resultTime;
            this.datastreamLink = datastreamLink;
        }

        public isOlder(other : de.visaq.model.sensorthings.HistoricalLocation) : boolean {
            return false;
        }

        public isNewer(other : de.visaq.model.sensorthings.HistoricalLocation) : boolean {
            return false;
        }

        public isEqualOld(other : de.visaq.model.sensorthings.HistoricalLocation) : boolean {
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
         * @return {de.visaq.controller.ObservationController}
         */
        public getController() : de.visaq.controller.ObservationController {
            return new de.visaq.controller.ObservationController();
        }
    }
    Observation["__class"] = "de.visaq.model.sensorthings.Observation";
    Observation["__interfaces"] = ["de.visaq.model.sensorthings.SensorthingsTimeStamp"];


}

