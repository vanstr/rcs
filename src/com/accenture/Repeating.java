package com.accenture;

class Car{
	String color;
	int speed;
	String name;
	
	void drive(){
		System.out.println("drive name"+this.name);
	}
	
	String driveOnASpecificLight(int speed, String light){
		return "Driving on "+ light + " with speed "+ speed;
	}
}

public class Repeating {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.name = "MySuperDuperCar";
		myCar.drive();

		
		String msg = myCar.driveOnASpecificLight(56, "red");
		System.out.println(msg);
		
		
		Car stolenCar = new Car();
		stolenCar.name = "StolenCar";
		stolenCar.drive();

	}

}
