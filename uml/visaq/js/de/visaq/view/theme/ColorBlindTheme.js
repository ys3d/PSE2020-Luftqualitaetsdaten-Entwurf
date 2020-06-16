var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var theme;
            (function (theme) {
                /**
                 * Contains
                 * @class
                 * @extends de.visaq.view.theme.ColorTheme
                 */
                var ColorBlindTheme = (function (_super) {
                    __extends(ColorBlindTheme, _super);
                    function ColorBlindTheme() {
                        return _super !== null && _super.apply(this, arguments) || this;
                    }
                    ColorBlindTheme.prototype.colorsChosen = function (primaryColor, secondaryColor) {
                        if (((primaryColor != null && primaryColor instanceof java.awt.Color) || primaryColor === null) && ((secondaryColor != null && secondaryColor instanceof java.awt.Color) || secondaryColor === null)) {
                            _super.prototype.colorsChosen.call(this, primaryColor, secondaryColor);
                        }
                        else if (primaryColor === undefined && secondaryColor === undefined) {
                            return this.colorsChosen$();
                        }
                        else
                            throw new Error('invalid overload');
                    };
                    ColorBlindTheme.prototype.colorsChosen$ = function () {
                    };
                    return ColorBlindTheme;
                }(de.visaq.view.theme.ColorTheme));
                theme.ColorBlindTheme = ColorBlindTheme;
                ColorBlindTheme["__class"] = "de.visaq.view.theme.ColorBlindTheme";
            })(theme = view.theme || (view.theme = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
