/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.theme {
    /**
     * Contains
     * @class
     * @extends de.visaq.view.theme.ColorTheme
     */
    export class ColorBlindTheme extends de.visaq.view.theme.ColorTheme {
        public colorsChosen(primaryColor? : any, secondaryColor? : any) : any {
            if(((primaryColor != null && primaryColor instanceof <any>java.awt.Color) || primaryColor === null) && ((secondaryColor != null && secondaryColor instanceof <any>java.awt.Color) || secondaryColor === null)) {
                super.colorsChosen(primaryColor, secondaryColor);
            } else if(primaryColor === undefined && secondaryColor === undefined) {
                return <any>this.colorsChosen$();
            } else throw new Error('invalid overload');
        }

        public colorsChosen$() {
        }
    }
    ColorBlindTheme["__class"] = "de.visaq.view.theme.ColorBlindTheme";

}

