package de.visaq.controller.link;

import de.visaq.controller.SensorthingsController;
import de.visaq.model.sensorthings.Sensorthings;

/**
 * Encapsulates a Sensorthings query that can return a single Sensorthings entity and provides
 * caching functionality.
 *
 * @param <SensorthingT> A class that extends Sensorthings
 */
public class SingleLocalLink<SensorthingT extends Sensorthings<SensorthingT>>
        extends SingleNavigationLink<SensorthingT> {
    public final Sensorthings<SensorthingT> cachedSensorthing;

    /**
     * Constructs a new SingleLocalLink with a query that returns a Sensorthings entity and caches
     * the result.
     * 
     * @param url               {@link NavigationLink#NavigationLink(String, boolean)}
     * @param relative          {@link NavigationLink#NavigationLink(String, boolean)}
     * @param cachedSensorthing The retrieved entity of this query
     */
    public SingleLocalLink(String url, boolean relative,
            Sensorthings<SensorthingT> cachedSensorthing) {
        super(url, relative);
        this.cachedSensorthing = cachedSensorthing;
    }

    @Override
    public Sensorthings<SensorthingT> get(SensorthingsController<SensorthingT> controller) {
        return cachedSensorthing;
    }

}
