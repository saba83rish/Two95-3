/**
 * 
 */
package com.AugTraining08262015.Obj;

/**
 * @author Geo
 *
 */
public class Car extends Vehicle {
	private String vehicleType;
	
	public Car(String setVehicleType){
		vehicleType = setVehicleType;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String driveForward(){
		return(" is moving forward");
		
	}
	
	public String driveReverse(){
		return(" is moving backward");

	}
	
	public String driveTurn(){
		return(" is turning");

	}

	public String embarkPassenger(){
		return(" is embarking a passenger");

	}
	
	public String disembarkPassenger(){
		return(" is disembarking a passenger");

	}
}
