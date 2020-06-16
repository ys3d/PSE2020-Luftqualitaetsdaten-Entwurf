/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var theme;
            (function (theme) {
                var ColorTheme = (function () {
                    function ColorTheme() {
                        /*private*/ this.PRIMARYCOLOR = null;
                        /*private*/ this.SECONDARYCOLOR = null;
                    }
                    ColorTheme.prototype.colorsChosen = function (primaryColor, secondaryColor) {
                    };
                    ColorTheme.prototype.getSECONDARYCOLOR = function () {
                        return this.SECONDARYCOLOR;
                    };
                    ColorTheme.prototype.setSECONDARYCOLOR = function (secondaryColor) {
                        this.SECONDARYCOLOR = secondaryColor;
                    };
                    ColorTheme.prototype.getPRIMARYCOLOR = function () {
                        return this.PRIMARYCOLOR;
                    };
                    ColorTheme.prototype.setPRIMARYCOLOR = function (primaryColor) {
                        this.PRIMARYCOLOR = primaryColor;
                    };
                    return ColorTheme;
                }());
                theme.ColorTheme = ColorTheme;
                ColorTheme["__class"] = "de.visaq.view.theme.ColorTheme";
            })(theme = view.theme || (view.theme = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
