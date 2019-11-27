package com.accenture.lecture17.shape;

public class Triangle implements Shape{

	private double height;
	private double base;

	public Triangle(double height, double base) {		
		this.height = height;
		this.base = base;
	}

	@Override
	public double getArea() {	
		return 0.5 * base * height;
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + ", area=" + getArea() + "]";
	}

	
}
