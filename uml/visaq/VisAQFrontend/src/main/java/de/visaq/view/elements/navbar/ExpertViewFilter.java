package de.visaq.view.elements.navbar;

import java.util.ArrayList;

public class ExpertViewFilter {

    private ArrayList<?> sensorTypes;
    private ArrayList<?> selectedSensorTypes;

    /**
     * Shows the different Sensortypes that can be chosen.
     */
    public void show() {
    }

    /**
     * Sets the Sensortypes that are selected.
     * 
     * @param selectedSensorTypes The Sensortypes that the User selects
     */
    public void setSelectedSensors(ArrayList<?> selectedSensorTypes) {

        // TODO change the sensor types to the correct version
        this.selectedSensorTypes = selectedSensorTypes;
    }

    /**
     * Returns the selected Sensortypes.
     * 
     * @return The Instance of the selected Sensortypes
     */
    public ArrayList<?> getSelectedSensors() {
        return selectedSensorTypes;
    }
}
