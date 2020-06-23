package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

/**
 * Encapsulates a Sensorthings query that can return a single Sensorthings entity.
 *
 * @param <SensorthingT> A class that extends Sensorthings
 */
public abstract class SingleNavigationLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends NavigationLink<SensorthingT> {
    /**
     * Constructs a new NavigationLink to a Sensorthings query with the given url.
     * 
     * @param url      {@link NavigationLink#NavigationLink(String, boolean)}
     * @param relative {@link NavigationLink#NavigationLink(String, boolean)}
     */
    public SingleNavigationLink(String url, boolean relative) {
        super(url, relative);
    }

    /**
     * Returns the Sensorthings entity that results from the encapsulated query.
     * 
     * @param controller The controller used to build the Sensorthings entity
     * @return The Sensorthings entity
     */
    public abstract Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller);
}
