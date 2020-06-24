package de.visaq.view.elements.diagram;

import java.time.Instant;

import org.javatuples.Pair;

import de.visaq.model.FeatureOfInterest;
import de.visaq.model.Observation;

/**
 * Produces a Bar Diagram with the given data. The Bar Diagram show the historical development of
 * the current Air Quality Data. The timeframe is hereby set by the user or has a default value.
 */
public class BarDiagram implements Diagram {

    public final Pair<FeatureOfInterest, Observation> data;
    public final Instant start;
    public final Instant end;

    /**
     * Sole Constructor of the class Bar Diagram.
     * 
     * @param data  The Instance of the Air Quality data
     * @param start The start point of the historical development
     * @param end   The end point of the historical development
     */
    public BarDiagram(Pair<FeatureOfInterest, Observation> data, Instant start, Instant end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public void drawDiagram() {

    }

    @Override
    public void showDiagram() {
        // TODO Auto-generated method stub

    }
}
