/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var view;
        (function (view) {
            var elements;
            (function (elements) {
                var Toolbar = (function () {
                    function Toolbar() {
                        if (this.airQualityData === undefined)
                            this.airQualityData = null;
                        if (this.informationview === undefined)
                            this.informationview = null;
                        if (this.navbar === undefined)
                            this.navbar = null;
                        if (this.searchbar === undefined)
                            this.searchbar = null;
                    }
                    Toolbar.prototype.show = function () {
                    };
                    Toolbar.prototype.showAQD = function () {
                    };
                    Toolbar.prototype.showHelpIcon = function () {
                    };
                    Toolbar.prototype.showSearchBar = function () {
                    };
                    Toolbar.prototype.showNavbar = function () {
                    };
                    Toolbar.prototype.getInformationview = function () {
                        return this.informationview;
                    };
                    Toolbar.prototype.setInformationview = function (informationview) {
                        this.informationview = informationview;
                    };
                    Toolbar.prototype.getAirQualityData = function () {
                        return this.airQualityData;
                    };
                    Toolbar.prototype.setAirQualityData = function (airQualityData) {
                        this.airQualityData = airQualityData;
                    };
                    Toolbar.prototype.getNavbar = function () {
                        return this.navbar;
                    };
                    Toolbar.prototype.setNavbar = function (navbar) {
                        this.navbar = navbar;
                    };
                    Toolbar.prototype.getSearchbar = function () {
                        return this.searchbar;
                    };
                    Toolbar.prototype.setSearchbar = function (searchbar) {
                        this.searchbar = searchbar;
                    };
                    return Toolbar;
                }());
                elements.Toolbar = Toolbar;
                Toolbar["__class"] = "de.visaq.view.elements.Toolbar";
                Toolbar["__interfaces"] = ["de.visaq.view.elements.ToolbarElement"];
            })(elements = view.elements || (view.elements = {}));
        })(view = visaq.view || (visaq.view = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
