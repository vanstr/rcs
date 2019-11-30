package com.accenture.lecture17;

public class WheelVehicle extends Vehicle {

	public int wheels;

	public WheelVehicle(int wheels){
        super(4, 12123 + wheels);
		this.wheels = wheels;
		System.out.println("WheelVehicle is created");
	}
	
	@Override
	public void drive() {
		System.out.println("Drive a WheelVehicle!");
	}
}
