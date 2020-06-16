/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.elements {
    export class SearchBar implements de.visaq.view.elements.ToolbarElement {
        /*private*/ input : string;

        public constructor() {
            if(this.input===undefined) this.input = null;
        }

        public show() {
        }

        public getInput() : string {
            return this.input;
        }

        public setInput(input : string) {
            this.input = input;
        }
    }
    SearchBar["__class"] = "de.visaq.view.elements.SearchBar";
    SearchBar["__interfaces"] = ["de.visaq.view.elements.ToolbarElement"];


}

