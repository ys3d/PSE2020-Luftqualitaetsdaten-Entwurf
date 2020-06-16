/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller {
    /**
     * Encapsulates the control over all Sensorthings objects.
     * 
     * @param <sensorthing> Sensorthings object this controller will work on.
     * @class
     */
    export abstract class SensorthingsController<sensorthing extends de.visaq.model.sensorthings.Sensorthings<sensorthing>> {
        /**
         * Retrieves all Sensorthings objects of this type. Can be slow and should be avoided. Use more specific requests instead.
         * 
         * @return	{de.visaq.model.sensorthings.Sensorthings[]} An array containing the Sensorthings objects that were retrieved.
         */
        public abstract getAll() : Array<sensorthing>;

        public get$de_visaq_controller_link_MultiNavigationLink(navigationLink : de.visaq.controller.link.MultiNavigationLink<sensorthing>) : Array<sensorthing> {
            return navigationLink.get(this);
        }

        /**
         * Retrieves all Sensorthings objects that are bound to the specified MultiNavigationLink.
         * 
         * @param {*} navigationLink 	Link to the Sensorthings objects inside the database.
         * @return					{de.visaq.model.sensorthings.Sensorthings[]} An array containing the Sensorthings objects that were retrieved.
         */
        public get(navigationLink? : any) : any {
            if(((navigationLink != null && (navigationLink["__interfaces"] != null && navigationLink["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || navigationLink.constructor != null && navigationLink.constructor["__interfaces"] != null && navigationLink.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || navigationLink === null)) {
                return <any>this.get$de_visaq_controller_link_MultiNavigationLink(navigationLink);
            } else if(((navigationLink != null && (navigationLink["__interfaces"] != null && navigationLink["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || navigationLink.constructor != null && navigationLink.constructor["__interfaces"] != null && navigationLink.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || navigationLink === null)) {
                return <any>this.get$de_visaq_controller_link_SingleNavigationLink(navigationLink);
            } else if(((typeof navigationLink === 'string') || navigationLink === null)) {
                return <any>this.get$java_lang_String(navigationLink);
            } else throw new Error('invalid overload');
        }

        public get$de_visaq_controller_link_SingleNavigationLink(navigationLink : de.visaq.controller.link.SingleNavigationLink<sensorthing>) : de.visaq.model.sensorthings.Sensorthings<sensorthing> {
            return navigationLink.get(this);
        }

        public get$java_lang_String(id : string) : sensorthing { throw new Error('cannot invoke abstract overloaded method... check your argument(s) type(s)'); }

        /**
         * Builds the Sensorthings objects using the specified JSON.
         * 
         * @param {org.json.JSONObject} json	Sensorthings objects codified as JSON.
         * @return		{de.visaq.model.sensorthings.Sensorthings[]} The Sensorthings objects that were constructed.
         */
        public multiBuild(json : org.json.JSONObject) : Array<sensorthing> {
            let array : org.json.JSONArray = json.getJSONArray("value");
            let length : number = array.length();
            let objects : Array<sensorthing> = <any>([]);
            for(let i : number = 0; i < length; i++) {{
                /* add */(objects.push(this.singleBuild(json.getJSONArray("value").getJSONObject(i)))>0);
            };}
            return objects;
        }

        /**
         * Builds the Sensorthings object using the specified JSON.
         * 
         * @param {org.json.JSONObject} json	Sensorthings object codified as JSON.
         * @return		{de.visaq.model.sensorthings.Sensorthings} The Sensorthings object that were constructed.
         */
        public abstract singleBuild(json : org.json.JSONObject) : sensorthing;
    }
    SensorthingsController["__class"] = "de.visaq.controller.SensorthingsController";

}

