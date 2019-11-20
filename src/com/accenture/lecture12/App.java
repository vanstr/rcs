package com.accenture.lecture12;

class DrivingRule { // parent of this class is Object

	String name;
	public String toString() {
		return "DrivingRule object";
	}
	

}

public class App {
	public static void main(String[] args) {
		
		DrivingRule rule3 = new DrivingRule();
		System.out.println(rule3);

	}
}