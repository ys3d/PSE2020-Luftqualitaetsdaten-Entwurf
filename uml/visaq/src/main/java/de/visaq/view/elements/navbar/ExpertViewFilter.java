package de.visaq.view.elements.navbar;

import java.util.ArrayList;

public class ExpertViewFilter {

    private ArrayList<?> sensorTypes;
    private ArrayList<?> selectedSensorTypes;

    public void show() {
    }

    public void setSelectedSensors(ArrayList<?> selectedSensorTypes) {

        // TODO change the sensor types to the correct version
        this.selectedSensorTypes = selectedSensorTypes;
    }

    public ArrayList<?> getSelectedSensors() {
        return selectedSensorTypes;
    }
}
