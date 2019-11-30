package com.accenture.lecture17;

import java.util.ArrayList;
import java.util.List;

public class InheriatenceApp {

	public static void main(String[] args) {
//		Vehicle myVehicle = new Vehicle();
//		myVehicle.drive();
		
		
		
		System.out.println("State inheritance example");
		WheelVehicle myCar = new WheelVehicle(4);	
		myCar.seats = 4;
		
		myCar.drive();
		
		System.out.println("Car has seets:" + myCar.seats);
		System.out.println("Car has numbe:" + myCar.number);
		System.out.println("Car has wheels:" + myCar.wheels);
//		
		
		// Constructor example, with super(va1, val2), 
		
//		System.out.println("Polymorphism example");
//		Vehicle mySisterCar = new Car();
//		mySisterCar.drive();
//		List<Vehicle> vehicles = new ArrayList<>();
//		vehicles.add(myVehicle);
//		vehicles.add(mySisterCar);	
//		
//		for(Vehicle vehicle:vehicles) {
//			vehicle.drive();
//		}
	}

}
