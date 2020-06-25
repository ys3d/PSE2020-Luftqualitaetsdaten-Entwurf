package de.visaq.model;

/**
 * Encapsulates all Sensorthings objects.
 */
public abstract class Sensorthings<SensorthingT extends Sensorthings<SensorthingT>> {

    /**
     * Unique identifier of the object.
     */
    public final String id;

    public Sensorthings() {
        this.id = null;
    }

    /**
     * Creates a new Sensorthings object with the given id and the specified database link.
     * 
     * @param id      Unique identifier of the object that will be created.
     * @param selfUrl Links to the Sensorthings database object.
     */
    public Sensorthings(String id) {
        this.id = id;
    }
}
