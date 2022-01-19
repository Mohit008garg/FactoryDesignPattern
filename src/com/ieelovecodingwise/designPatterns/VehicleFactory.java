package com.ieelovecodingwise.designPatterns;

public class VehicleFactory {

	public static Vehicle getInstance(String vehicleType){
		if(vehicleType.equals("800")){
			return new Maruti800("800");
		}
			return new HyundaiEON();
		
	}
}
