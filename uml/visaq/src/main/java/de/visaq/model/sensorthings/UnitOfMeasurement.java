package de.visaq.model.sensorthings;

public class UnitOfMeasurement {
	public final String symbol;
	public final String name;
	public final String definition;
	
	public UnitOfMeasurement(String symbol, String name, String definition) {
		this.symbol = symbol;
		this.name = name;
		this.definition = definition;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
