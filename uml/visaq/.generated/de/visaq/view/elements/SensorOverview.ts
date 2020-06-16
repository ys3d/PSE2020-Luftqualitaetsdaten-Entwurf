/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.elements {
    export class SensorOverview implements de.visaq.view.elements.ToolbarElement {
        diagram : de.visaq.view.elements.diagram.Diagram;

        public showDiagram(diagram : de.visaq.view.elements.diagram.Diagram) {
        }

        public setDiagram(specificDiagram : de.visaq.view.elements.diagram.Diagram) {
            this.diagram = specificDiagram;
        }

        public getText(key : string) : string {
            return null;
        }

        public show() {
        }

        constructor() {
            if(this.diagram===undefined) this.diagram = null;
        }
    }
    SensorOverview["__class"] = "de.visaq.view.elements.SensorOverview";
    SensorOverview["__interfaces"] = ["de.visaq.view.elements.ToolbarElement"];


}

