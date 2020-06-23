package de.visaq.view.elements.diagram;

import org.json.JSONObject;

public class LineDiagram implements Diagram {

    public final JSONObject data;
    public final String start;
    public final String end;

    public LineDiagram(JSONObject data, String start, String end) {
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
