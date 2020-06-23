package de.visaq.view.elements.diagram;

import org.javatuples.Pair;

import de.visaq.model.FeatureOfInterest;
import de.visaq.model.Observation;

public class BarDiagram implements Diagram {

    public final Pair<FeatureOfInterest, Observation> data;
    public final String start;
    public final String end;

    public BarDiagram(Pair<FeatureOfInterest, Observation> data, String start, String end) {
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
