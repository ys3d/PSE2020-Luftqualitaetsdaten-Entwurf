/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.model.sensorthings {
    /**
     * Creates a new Sensorthings object with the given id and the specified database link.
     * 
     * @param {string} id 		Unique identifier of the object that will be created.
     * @param {string} selfUrl	Links to the Sensorthings database object.
     * @class
     */
    export abstract class Sensorthings<sensorthing extends Sensorthings<sensorthing>> {
        /**
         * Unique identifier of the object.
         */
        public id : string;

        /**
         * Links to this object in the Sensorthings database.
         */
        public selfLink : de.visaq.controller.link.SingleLocalLink<sensorthing>;

        public constructor(id? : any, selfUrl? : any) {
            if(((typeof id === 'string') || id === null) && ((typeof selfUrl === 'string') || selfUrl === null)) {
                let __args = arguments;
                if(this.id===undefined) this.id = null;
                if(this.selfLink===undefined) this.selfLink = null;
                if(this.id===undefined) this.id = null;
                if(this.selfLink===undefined) this.selfLink = null;
                (() => {
                    this.id = id;
                    this.selfLink = <any>(new de.visaq.controller.link.SingleLocalLink<sensorthing>(selfUrl, this));
                })();
            } else if(id === undefined && selfUrl === undefined) {
                let __args = arguments;
                if(this.id===undefined) this.id = null;
                if(this.selfLink===undefined) this.selfLink = null;
                if(this.id===undefined) this.id = null;
                if(this.selfLink===undefined) this.selfLink = null;
                (() => {
                    this.id = null;
                    this.selfLink = null;
                })();
            } else throw new Error('invalid overload');
        }

        /**
         * Returns the class of a SensorthingsController that is compatible with the specific class that implements this.
         * We use f-bounded quantification to specify precisely that we want SensorthingsControllers of the same class as the class that overrides this function.
         * Assume we have a class Datastream then this will return a function that returns an extension of SensorthingsController<Datastream>.
         * 
         * @return
         * @return {de.visaq.controller.SensorthingsController}
         */
        public abstract getController() : de.visaq.controller.SensorthingsController<sensorthing>;
    }
    Sensorthings["__class"] = "de.visaq.model.sensorthings.Sensorthings";

}

