/**
 * 
 */
package com.ieelovecodingwise.designPatterns;

/**
 * @author Mohit Garg
 *
 */
public class FactoryMainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle maruti800 = VehicleFactory.getInstance("800");
		System.out.println(maruti800.getVehicleName());
		Vehicle eon = VehicleFactory.getInstance("eon");
		System.out.println(eon.getVehicleName());
	}

}





