package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.visaq.controller.link.MultiOnlineLink;
import de.visaq.model.sensorthings.FeatureOfInterest;
import de.visaq.model.sensorthings.Observation;

/**
 * Encapsulates the control over FeatureOfIntrest objects.
 */
public class FeatureOfIntrestController extends SensorthingsController<FeatureOfInterest> {

    @Override
    public ArrayList<FeatureOfInterest> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FeatureOfInterest get(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FeatureOfInterest singleBuild(JSONObject json) {
        try {
            json = UtilityController.removeArrayWrapper(json);

            FeatureOfInterest featureOfIntrest = new FeatureOfInterest(json.getString("@iot.id"),
                    json.getString("@iot.selfLink"), json.getString("description"),
                    json.getString("name"),
                    new MultiOnlineLink<Observation>(
                            json.getString("Observations@iot.navigationLink")),
                    json.getJSONObject("feature").toMap()
                    );
            return featureOfIntrest;
        } catch (JSONException e) {
            return null;
        }
    }

}
