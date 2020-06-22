package de.visaq.model.sensorthings;

import de.visaq.controller.SensorthingsController;
import de.visaq.controller.link.SingleLocalLink;

/**
 * Encapsulates all Sensorthings objects.
 */
public abstract class Sensorthings<SensorthingT extends Sensorthings<SensorthingT>> {

    /**
     * Unique identifier of the object.
     */
    public final String id;
    /**
     * Links to this object in the Sensorthings database.
     */
    public final SingleLocalLink<SensorthingT> selfLink;

    public Sensorthings() {
        this.id = null;
        this.selfLink = null;
    }

    /**
     * Creates a new Sensorthings object with the given id and the specified database link.
     * 
     * @param id      Unique identifier of the object that will be created.
     * @param selfUrl Links to the Sensorthings database object.
     */
    public Sensorthings(String id, String selfUrl) {
        this.id = id;
        this.selfLink = new SingleLocalLink<SensorthingT>(selfUrl, this);
    }

    /**
     * Returns the class of a SensorthingsController that is compatible with the specific class that
     * implements this. We use f-bounded quantification to specify precisely that we want
     * SensorthingsControllers of the same class as the class that overrides this function. Assume
     * we have a class Datastream then this will return a function that returns an extension of
     * SensorthingsController&lt;Datastream&gt;.
     * 
     * @return The matching {@link SensorthingsController}
     */
    public abstract SensorthingsController<SensorthingT> getController();
}
