package com.accenture;

class Robot{
	String name;
	static String factory;
	static int count;
	
	void info(){
		System.out.println("Name " + name + " factory " + factory);
	}
	
}
public class StaticExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot.factory = "Mikrotik";
		
		Robot robo1 = new Robot();		
		robo1.name = "robo1";
		Robot.count++;
//		robo1.factory = "MikroTik";
		robo1.info();
		
		
		
		Robot robo2 = new Robot();
//		robo2.factory = "MikroTik";
		robo2.name = "robo2";
		Robot.count++;
		robo2.info();
		
		// factory was sold 
		Robot robo3 = new Robot();		
		robo3.name = "robo3";
		robo3.factory = "Microsoft";
		Robot.count++;
		robo3.info();
		
		robo2.info();
		System.out.println("Produced robot amount: " + Robot.count);

	}

}
