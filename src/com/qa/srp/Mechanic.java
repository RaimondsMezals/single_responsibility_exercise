package com.qa.srp;


public class Mechanic {
	
	private String tyreType = "summer tyres";

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	@Override
	public String toString() {
		return "Mechanic [tyreType=" + tyreType + "]";
	}
	
	
	
}
