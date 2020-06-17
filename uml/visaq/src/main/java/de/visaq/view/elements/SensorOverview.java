package de.visaq.view.elements;

import de.visaq.view.elements.diagram.Diagram;

/**
 * Sensor Overview (also referred to as Sidebar) is used to show interpolated Point Data on the Map
 * or Data of a specific Sensor. It can show various Diagrams and different types of Air Quality
 * Data. It also provides an assessment of the danger due to specific types of pollution.
 */

public class SensorOverview implements ToolbarElement {
    public final Diagram[] diagrams;

    public SensorOverview(Diagram[] diagrams) {
        this.diagrams = diagrams;
    }

    /**
     * Shows the Diagrams.
     */
    public void showDiagrams() {

    }

    @Override
    public void show() {

    }
}
