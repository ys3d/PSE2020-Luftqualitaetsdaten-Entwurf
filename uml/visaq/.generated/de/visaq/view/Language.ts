/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view {
    export class Language {
        /*private*/ icon : java.awt.image.BufferedImage = null;

        /*private*/ language : any;

        public NAME : string;

        public constructor(language : any, name : string) {
            if(this.language===undefined) this.language = null;
            if(this.NAME===undefined) this.NAME = null;
            this.language = language;
            this.NAME = name;
        }

        public getIcon() : java.awt.image.BufferedImage {
            return this.icon;
        }

        /*private*/ setIcon(icon : java.awt.image.BufferedImage) {
            this.icon = icon;
        }

        public getText(key : string) : string {
            return null;
        }
    }
    Language["__class"] = "de.visaq.view.Language";

}

