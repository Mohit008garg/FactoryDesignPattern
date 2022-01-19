package com.ieelovecodingwise.designPatterns;

public class Maruti800 implements Vehicle {
	/* (non-Javadoc)
	 * @see com.demo.designPatterns.Vechile#getVechileName()
	 */
	private String modelName;
	
	public Maruti800(String modelName) {
		super();
		this.modelName = modelName;
	}

	public String getVehicleName() {
		return "800";
	}
}
