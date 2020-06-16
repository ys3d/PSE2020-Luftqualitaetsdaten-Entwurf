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
            var InformationView = (function (_super) {
                __extends(InformationView, _super);
                function InformationView(language, colorTheme) {
                    var _this = _super.call(this, language, colorTheme) || this;
                    /*private*/ _this.icon = null;
                    return _this;
                }
                /**
                 *
                 */
                InformationView.prototype.show = function () {
                };
                InformationView.prototype.getIcon = function () {
                    return this.icon;
                };
                /*private*/ InformationView.prototype.setIcon = function (icon) {
                    this.icon = icon;
                };
                InformationView.prototype.getText = function (key) {
                    return null;
                };
                return InformationView;
            }(de.visaq.view.View));
            view.InformationView = InformationView;
            InformationView["__class"] = "de.visaq.view.InformationView";
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
