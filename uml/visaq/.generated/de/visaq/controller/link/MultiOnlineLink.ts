/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller.link {
    export class MultiOnlineLink<sensorthing extends de.visaq.model.sensorthings.Sensorthings<sensorthing>> implements de.visaq.controller.link.MultiNavigationLink<sensorthing> {
        /*private*/ cache : de.visaq.controller.link.MultiLocalLink<sensorthing>;

        public url : string;

        public constructor(url : string) {
            if(this.cache===undefined) this.cache = null;
            if(this.url===undefined) this.url = null;
            this.url = de.visaq.RestConstants.ENTRY_POINT + url;
        }

        /**
         * 
         * @param {*} obj
         * @return {boolean}
         */
        public equals(obj : any) : boolean {
            return /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this,obj));
        }

        public get(controller : de.visaq.controller.SensorthingsController<sensorthing>) : Array<sensorthing> {
            if(this.cache != null) {
                return this.cache.get(controller);
            }
            let c : jakarta.ws.rs.client.Client = jakarta.ws.rs.client.ClientBuilder.newClient();
            let target : jakarta.ws.rs.client.WebTarget = c.target(this.url);
            console.info("\nAngefragte URL: " + target.getUri());
            let responseString : string = <any>(target.request(jakarta.ws.rs.core.MediaType.APPLICATION_JSON).get<any>(String));
            let response : org.json.JSONObject = new org.json.JSONObject(responseString);
            console.info("\nTextausgabe:");
            console.info(responseString);
            let built : Array<sensorthing> = controller.multiBuild(response);
            this.cache = <any>(new de.visaq.controller.link.MultiLocalLink<sensorthing>(this.url, built));
            return built;
        }
    }
    MultiOnlineLink["__class"] = "de.visaq.controller.link.MultiOnlineLink";
    MultiOnlineLink["__interfaces"] = ["de.visaq.controller.link.MultiNavigationLink","de.visaq.controller.link.NavigationLink"];


}

