package de.visaq.controller;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.visaq.controller.link.SingleOnlineLink;
import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.FeatureOfInterest;
import de.visaq.model.sensorthings.Observation;

/**
 * Encapsulates the control over Observation objects.
 */
public class ObservationController extends SensorthingController<Observation> {
    @Override
    public ArrayList<Observation> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Retrieves the Observation entities associated with the given Datastream entity.
     * 
     * @param datastream The Datastream entity
     * @return An ArrayList containing the associated Observation entities
     */
    public ArrayList<Observation> get(Datastream datastream) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Observation get(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Observation singleBuild(JSONObject json) {
        try {
            json = UtilityController.removeArrayWrapper(json);

            if (json == null) {
                return null;
            }

            Observation observation = new Observation(json.getString("@iot.id"),
                    json.getString("@iot.selfLink"), false,
                    UtilityController.buildTime(json, "phenomenonTime"), json.getDouble("result"),
                    UtilityController.buildTime(json, "resultTime"),
                    new SingleOnlineLink<Datastream>(
                            json.getString("Datastream@iot.navigationLink"), false),
                    new SingleOnlineLink<FeatureOfInterest>(
                            json.getString("FeatureOfInterest@iot.navigationLink"), false));
            return observation;
        } catch (JSONException e) {
            return null;
        }
    }
}
