/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller_1) {
            var link;
            (function (link) {
                var MultiOnlineLink = (function () {
                    function MultiOnlineLink(url) {
                        if (this.cache === undefined)
                            this.cache = null;
                        if (this.url === undefined)
                            this.url = null;
                        this.url = de.visaq.RestConstants.ENTRY_POINT + url;
                    }
                    /**
                     *
                     * @param {*} obj
                     * @return {boolean}
                     */
                    MultiOnlineLink.prototype.equals = function (obj) {
                        return (function (o1, o2) { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this, obj);
                    };
                    MultiOnlineLink.prototype.get = function (controller) {
                        if (this.cache != null) {
                            return this.cache.get(controller);
                        }
                        var c = jakarta.ws.rs.client.ClientBuilder.newClient();
                        var target = c.target(this.url);
                        console.info("\nAngefragte URL: " + target.getUri());
                        var responseString = (target.request(jakarta.ws.rs.core.MediaType.APPLICATION_JSON).get(String));
                        var response = new org.json.JSONObject(responseString);
                        console.info("\nTextausgabe:");
                        console.info(responseString);
                        var built = controller.multiBuild(response);
                        this.cache = (new de.visaq.controller.link.MultiLocalLink(this.url, built));
                        return built;
                    };
                    return MultiOnlineLink;
                }());
                link.MultiOnlineLink = MultiOnlineLink;
                MultiOnlineLink["__class"] = "de.visaq.controller.link.MultiOnlineLink";
                MultiOnlineLink["__interfaces"] = ["de.visaq.controller.link.MultiNavigationLink", "de.visaq.controller.link.NavigationLink"];
            })(link = controller_1.link || (controller_1.link = {}));
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
