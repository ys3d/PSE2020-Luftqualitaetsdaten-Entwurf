package de.visaq.model.sensorthings;

import java.util.Map;

public interface SensorthingsProperties {
	public final Map<String, Object> properties = null;
	
	public Object getPropertyByKey();
	public boolean hasProperties();
}
