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
                var DarkTheme = (function (_super) {
                    __extends(DarkTheme, _super);
                    function DarkTheme() {
                        return _super !== null && _super.apply(this, arguments) || this;
                    }
                    DarkTheme.prototype.colorsChosen = function (primaryColor, secondaryColor) {
                    };
                    return DarkTheme;
                }(de.visaq.view.theme.ColorTheme));
                theme.DarkTheme = DarkTheme;
                DarkTheme["__class"] = "de.visaq.view.theme.DarkTheme";
            })(theme = view.theme || (view.theme = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
