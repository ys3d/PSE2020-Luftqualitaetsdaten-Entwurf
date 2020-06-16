/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var Language = (function () {
                function Language(language, name) {
                    /*private*/ this.icon = null;
                    if (this.language === undefined)
                        this.language = null;
                    if (this.NAME === undefined)
                        this.NAME = null;
                    this.language = language;
                    this.NAME = name;
                }
                Language.prototype.getIcon = function () {
                    return this.icon;
                };
                /*private*/ Language.prototype.setIcon = function (icon) {
                    this.icon = icon;
                };
                Language.prototype.getText = function (key) {
                    return null;
                };
                return Language;
            }());
            view.Language = Language;
            Language["__class"] = "de.visaq.view.Language";
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
