/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller.link {
    export class SingleLocalLink<sensorthing extends de.visaq.model.sensorthings.Sensorthings<sensorthing>> implements de.visaq.controller.link.SingleNavigationLink<sensorthing> {
        public url : string;

        public cachedSensorthing : de.visaq.model.sensorthings.Sensorthings<sensorthing>;

        public constructor(url : string, cachedSensorthing : de.visaq.model.sensorthings.Sensorthings<sensorthing>) {
            if(this.url===undefined) this.url = null;
            if(this.cachedSensorthing===undefined) this.cachedSensorthing = null;
            this.url = de.visaq.RestConstants.ENTRY_POINT + url;
            this.cachedSensorthing = cachedSensorthing;
        }

        public get(controller : de.visaq.controller.SensorthingsController<sensorthing>) : de.visaq.model.sensorthings.Sensorthings<sensorthing> {
            return this.cachedSensorthing;
        }
    }
    SingleLocalLink["__class"] = "de.visaq.controller.link.SingleLocalLink";
    SingleLocalLink["__interfaces"] = ["de.visaq.controller.link.SingleNavigationLink","de.visaq.controller.link.NavigationLink"];


}

