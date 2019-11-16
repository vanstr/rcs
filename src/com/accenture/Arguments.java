package com.accenture;


class Bicycle{
	
	int speed = 10;
	
	// order of arguments is important
	void direction(String side, int speed){		
		System.out.println("Side " + side + " speed: " + speed + "km/h ");
		
		// use this keyword to access current object varaible, it is good practice
		System.out.println("This bicycle speed: " + this.speed + "km/h ");
	}
	
}

public class Arguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
		String side = "North";
		int speed = 5;
		bicycle.direction(side, speed);

	}

}
