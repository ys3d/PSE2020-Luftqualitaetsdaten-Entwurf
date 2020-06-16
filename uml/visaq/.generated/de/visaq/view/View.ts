/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view {
    export abstract class View {
        language : de.visaq.view.Language;

        colorTheme : de.visaq.view.theme.ColorTheme;

        public constructor(language : de.visaq.view.Language, colorTheme : de.visaq.view.theme.ColorTheme) {
            if(this.language===undefined) this.language = null;
            if(this.colorTheme===undefined) this.colorTheme = null;
            this.colorTheme = colorTheme;
            this.language = language;
        }

        public abstract show();
    }
    View["__class"] = "de.visaq.view.View";

}

