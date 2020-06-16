/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var elements;
            (function (elements) {
                var SearchBar = (function () {
                    function SearchBar() {
                        if (this.input === undefined)
                            this.input = null;
                    }
                    SearchBar.prototype.show = function () {
                    };
                    SearchBar.prototype.getInput = function () {
                        return this.input;
                    };
                    SearchBar.prototype.setInput = function (input) {
                        this.input = input;
                    };
                    return SearchBar;
                }());
                elements.SearchBar = SearchBar;
                SearchBar["__class"] = "de.visaq.view.elements.SearchBar";
                SearchBar["__interfaces"] = ["de.visaq.view.elements.ToolbarElement"];
            })(elements = view.elements || (view.elements = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
