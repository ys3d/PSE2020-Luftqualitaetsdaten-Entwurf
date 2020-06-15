package de.visaq.model.sensorthings;

public class UnitOfMeasurement {
	public final String symbol;
	public final String name;
	public final String definition;
	
	public UnitOfMeasurement(String name, String symbol, String definition) {
		this.name = name;
		this.symbol = symbol;
		this.definition = definition;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
