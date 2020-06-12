package de.visaq.model.sensorthings;

public interface Sensorthings {
import de.visaq.controller.link.SingleNavigationLink;
public abstract class Sensorthings {
	public final String id;
	public final SingleNavigationLink<? extends Sensorthings> selfLink;
	
	public Sensorthings(String id, SingleNavigationLink<? extends Sensorthings> selfLink) {
		this.id = id;
		this.selfLink = selfLink;
	}
}
