/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller_1) {
            var link;
            (function (link) {
                var SingleLocalLink = (function () {
                    function SingleLocalLink(url, cachedSensorthing) {
                        if (this.url === undefined)
                            this.url = null;
                        if (this.cachedSensorthing === undefined)
                            this.cachedSensorthing = null;
                        this.url = de.visaq.RestConstants.ENTRY_POINT + url;
                        this.cachedSensorthing = cachedSensorthing;
                    }
                    SingleLocalLink.prototype.get = function (controller) {
                        return this.cachedSensorthing;
                    };
                    return SingleLocalLink;
                }());
                link.SingleLocalLink = SingleLocalLink;
                SingleLocalLink["__class"] = "de.visaq.controller.link.SingleLocalLink";
                SingleLocalLink["__interfaces"] = ["de.visaq.controller.link.SingleNavigationLink", "de.visaq.controller.link.NavigationLink"];
            })(link = controller_1.link || (controller_1.link = {}));
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
