/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace de.visaq.view.elements {
    export class Toolbar implements de.visaq.view.elements.ToolbarElement {
        /*private*/ airQualityData : de.visaq.view.elements.AirQualityData;

        /*private*/ informationview : de.visaq.view.InformationView;

        /*private*/ navbar : de.visaq.view.elements.Navbar;

        /*private*/ searchbar : de.visaq.view.elements.SearchBar;

        public show() {
        }

        public showAQD() {
        }

        public showHelpIcon() {
        }

        public showSearchBar() {
        }

        public showNavbar() {
        }

        public getInformationview() : de.visaq.view.InformationView {
            return this.informationview;
        }

        public setInformationview(informationview : de.visaq.view.InformationView) {
            this.informationview = informationview;
        }

        public getAirQualityData() : de.visaq.view.elements.AirQualityData {
            return this.airQualityData;
        }

        public setAirQualityData(airQualityData : de.visaq.view.elements.AirQualityData) {
            this.airQualityData = airQualityData;
        }

        public getNavbar() : de.visaq.view.elements.Navbar {
            return this.navbar;
        }

        public setNavbar(navbar : de.visaq.view.elements.Navbar) {
            this.navbar = navbar;
        }

        public getSearchbar() : de.visaq.view.elements.SearchBar {
            return this.searchbar;
        }

        public setSearchbar(searchbar : de.visaq.view.elements.SearchBar) {
            this.searchbar = searchbar;
        }

        constructor() {
            if(this.airQualityData===undefined) this.airQualityData = null;
            if(this.informationview===undefined) this.informationview = null;
            if(this.navbar===undefined) this.navbar = null;
            if(this.searchbar===undefined) this.searchbar = null;
        }
    }
    Toolbar["__class"] = "de.visaq.view.elements.Toolbar";
    Toolbar["__interfaces"] = ["de.visaq.view.elements.ToolbarElement"];


}

