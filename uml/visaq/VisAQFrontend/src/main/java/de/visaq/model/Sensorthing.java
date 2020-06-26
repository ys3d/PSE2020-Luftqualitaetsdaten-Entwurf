package de.visaq.model;

/**
 * Encapsulates all Sensorthings objects.
 */
public abstract class Sensorthing<SensorthingT extends Sensorthing<SensorthingT>> {

    /**
     * Unique identifier of the object.
     */
    public final String id;

    /**
     * Links to this object in the Sensorthings database.
     */

    public Sensorthing() {
        this.id = null;
    }

    /**
     * Creates a new Sensorthings object with the given id and the specified database link.
     * 
     * @param id      Unique identifier of the object that will be created.
     * @param selfUrl Links to the Sensorthings database object.
     */
    public Sensorthing(String id, String selfUrl) {
        this.id = id;
    }
}
