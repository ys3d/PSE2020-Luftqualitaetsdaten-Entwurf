package de.visaq.view.elements.diagram;

public interface Diagram {
	
    public void showDiagram();

    public void drawDiagram();

	public String getStart();

	public void setStart(String start);

	public String getEnd();

	public void setEnd(String end);
}
