/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var de;
(function (de) {
    var visaq;
    (function (visaq) {
        var controller;
        (function (controller) {
            /**
             * Encapsulates the control over all Sensorthings objects.
             *
             * @param <sensorthing> Sensorthings object this controller will work on.
             * @class
             */
            var SensorthingsController = (function () {
                function SensorthingsController() {
                }
                SensorthingsController.prototype.get$de_visaq_controller_link_MultiNavigationLink = function (navigationLink) {
                    return navigationLink.get(this);
                };
                /**
                 * Retrieves all Sensorthings objects that are bound to the specified MultiNavigationLink.
                 *
                 * @param {*} navigationLink 	Link to the Sensorthings objects inside the database.
                 * @return					{de.visaq.model.sensorthings.Sensorthings[]} An array containing the Sensorthings objects that were retrieved.
                 */
                SensorthingsController.prototype.get = function (navigationLink) {
                    if (((navigationLink != null && (navigationLink["__interfaces"] != null && navigationLink["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0 || navigationLink.constructor != null && navigationLink.constructor["__interfaces"] != null && navigationLink.constructor["__interfaces"].indexOf("de.visaq.controller.link.MultiNavigationLink") >= 0)) || navigationLink === null)) {
                        return this.get$de_visaq_controller_link_MultiNavigationLink(navigationLink);
                    }
                    else if (((navigationLink != null && (navigationLink["__interfaces"] != null && navigationLink["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0 || navigationLink.constructor != null && navigationLink.constructor["__interfaces"] != null && navigationLink.constructor["__interfaces"].indexOf("de.visaq.controller.link.SingleNavigationLink") >= 0)) || navigationLink === null)) {
                        return this.get$de_visaq_controller_link_SingleNavigationLink(navigationLink);
                    }
                    else if (((typeof navigationLink === 'string') || navigationLink === null)) {
                        return this.get$java_lang_String(navigationLink);
                    }
                    else
                        throw new Error('invalid overload');
                };
                SensorthingsController.prototype.get$de_visaq_controller_link_SingleNavigationLink = function (navigationLink) {
                    return navigationLink.get(this);
                };
                SensorthingsController.prototype.get$java_lang_String = function (id) { throw new Error('cannot invoke abstract overloaded method... check your argument(s) type(s)'); };
                /**
                 * Builds the Sensorthings objects using the specified JSON.
                 *
                 * @param {org.json.JSONObject} json	Sensorthings objects codified as JSON.
                 * @return		{de.visaq.model.sensorthings.Sensorthings[]} The Sensorthings objects that were constructed.
                 */
                SensorthingsController.prototype.multiBuild = function (json) {
                    var array = json.getJSONArray("value");
                    var length = array.length();
                    var objects = ([]);
                    for (var i = 0; i < length; i++) {
                        {
                            /* add */ (objects.push(this.singleBuild(json.getJSONArray("value").getJSONObject(i))) > 0);
                        }
                        ;
                    }
                    return objects;
                };
                return SensorthingsController;
            }());
            controller.SensorthingsController = SensorthingsController;
            SensorthingsController["__class"] = "de.visaq.controller.SensorthingsController";
        })(controller = visaq.controller || (visaq.controller = {}));
    })(visaq = de.visaq || (de.visaq = {}));
})(de || (de = {}));
