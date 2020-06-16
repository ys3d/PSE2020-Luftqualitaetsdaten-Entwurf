/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller.link {
    export class MultiLocalLink<sensorthing extends de.visaq.model.sensorthings.Sensorthings<sensorthing>> implements de.visaq.controller.link.MultiNavigationLink<sensorthing> {
        public url : string;

        public cachedSensorthing : Array<sensorthing>;

        public constructor(url : string, cachedSensorthing : Array<sensorthing>) {
            if(this.url===undefined) this.url = null;
            if(this.cachedSensorthing===undefined) this.cachedSensorthing = null;
            this.url = de.visaq.RestConstants.ENTRY_POINT + url;
            this.cachedSensorthing = cachedSensorthing;
        }

        public get(controller : de.visaq.controller.SensorthingsController<sensorthing>) : Array<sensorthing> {
            return this.cachedSensorthing;
        }
    }
    MultiLocalLink["__class"] = "de.visaq.controller.link.MultiLocalLink";
    MultiLocalLink["__interfaces"] = ["de.visaq.controller.link.MultiNavigationLink","de.visaq.controller.link.NavigationLink"];


}

