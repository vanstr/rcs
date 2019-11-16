package com.accenture;

class Car2 {
	private String brand;
	private int maxSpeed;
	private String color;

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		// Take care what you assign to what
		// brand = this.brand;
	}

}

public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		car.setBrand("Ferrari");
		String name = car.getBrand();
		System.out.println("My car name is " + name);
	}

}
