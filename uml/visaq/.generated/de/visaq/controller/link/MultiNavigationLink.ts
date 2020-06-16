/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.controller.link {
    export interface MultiNavigationLink<sensorthing extends de.visaq.model.sensorthings.Sensorthings<sensorthing>> extends de.visaq.controller.link.NavigationLink<sensorthing> {
        get(controller : de.visaq.controller.SensorthingsController<sensorthing>) : Array<sensorthing>;
    }
}

