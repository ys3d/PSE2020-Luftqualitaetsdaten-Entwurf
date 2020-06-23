package de.visaq.controller.link;

import java.util.ArrayList;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

/**
 * Encapsulates a Sensorthings query that can return multiple Sensorthings entities.
 *
 * @param <SensorthingT> A class that extends Sensorthings
 */
public abstract class MultiNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    /**
     * Constructs a new NavigationLink to a Sensorthings query with the given url.
     * 
     * @param url      {@link NavigationLink#NavigationLink(String, boolean)}
     * @param relative {@link NavigationLink#NavigationLink(String, boolean)}
     */
    public MultiNavigationLink(String url, boolean relative) {
        super(url, relative);
    }

    /**
     * Returns the Sensorthings entities that result from the encapsulated query.
     * 
     * @param controller The controller used to build the Sensorthings entities
     * @return An ArrayList containing the results
     */
    public abstract ArrayList<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
