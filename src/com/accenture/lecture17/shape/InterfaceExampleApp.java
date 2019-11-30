package com.accenture.lecture17.shape;

public class InterfaceExampleApp {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(2.0,  4.0);
		double rec1Area = rec1.getArea();
		System.out.println("Rectangle rec1 area = " + rec1Area);
		System.out.println(rec1);
		
		Shape shape1 = new Rectangle(3.0,  4.0);
		System.out.println("Shape shape1 area = " + shape1);
		
		
		// example loop
		
		
	}
}
