package com.accenture;

class Circle {
	private double radius; // 0

	public double getRadius() {
		// if (true) {
		// return radius;
		// } else {
		// return 0;
		// }
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}

public class HomeWork7 {

	// Create a class with name Circle
	// User should be able to define radius size for the circle using double
	// type
	// Class should have method which will return radius of circle getRadius()
	// Class should have methods which will return area of circle getArea()

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(2.0);
		System.out.println(circle.getArea());

	}

}
