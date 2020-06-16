/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.theme {
    export abstract class ColorTheme {
        /*private*/ PRIMARYCOLOR : java.awt.Color = null;

        /*private*/ SECONDARYCOLOR : java.awt.Color = null;

        public colorsChosen(primaryColor : java.awt.Color, secondaryColor : java.awt.Color) {
        }

        public getSECONDARYCOLOR() : java.awt.Color {
            return this.SECONDARYCOLOR;
        }

        public setSECONDARYCOLOR(secondaryColor : java.awt.Color) {
            this.SECONDARYCOLOR = secondaryColor;
        }

        public getPRIMARYCOLOR() : java.awt.Color {
            return this.PRIMARYCOLOR;
        }

        public setPRIMARYCOLOR(primaryColor : java.awt.Color) {
            this.PRIMARYCOLOR = primaryColor;
        }
    }
    ColorTheme["__class"] = "de.visaq.view.theme.ColorTheme";

}

