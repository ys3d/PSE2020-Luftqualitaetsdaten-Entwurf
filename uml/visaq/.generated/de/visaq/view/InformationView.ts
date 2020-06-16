/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view {
    export class InformationView extends de.visaq.view.View {
        /*private*/ icon : java.awt.image.BufferedImage = null;

        public constructor(language : de.visaq.view.Language, colorTheme : de.visaq.view.theme.ColorTheme) {
            super(language, colorTheme);
        }

        /**
         * 
         */
        public show() {
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
    InformationView["__class"] = "de.visaq.view.InformationView";

}

