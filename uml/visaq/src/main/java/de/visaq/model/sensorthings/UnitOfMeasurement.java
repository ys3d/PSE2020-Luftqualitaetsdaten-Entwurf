package de.visaq.model.sensorthings;

public class UnitOfMeasurement {
	private final String symbol;
	private final String name;
	private final String definition;
	
	public UnitOfMeasurement(String symbol, String name, String definition) {
		this.symbol = symbol;
		this.name = name;
		this.definition = definition;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getDefinition() {
		return definition;
	}
}
