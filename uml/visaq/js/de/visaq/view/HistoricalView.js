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
            var HistoricalView = (function (_super) {
                __extends(HistoricalView, _super);
                function HistoricalView(language, colorTheme) {
                    var _this = _super.call(this, language, colorTheme) || this;
                    if (_this.timeline === undefined)
                        _this.timeline = null;
                    return _this;
                }
                HistoricalView.prototype.show = function () {
                };
                return HistoricalView;
            }(de.visaq.view.MapView));
            view.HistoricalView = HistoricalView;
            HistoricalView["__class"] = "de.visaq.view.HistoricalView";
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
