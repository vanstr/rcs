package com.accenture.lecture12;

class Point{
	int x;
	int y;
	
	public Point(){
	}
	
	// default constructor has gone
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x:" + this.x + " y:" + this.y;
	}
	
	public static int calculateMiddlePoint(int firstCoordinate, int secondCoordinate){
		return (firstCoordinate + secondCoordinate)/2;
	}
	
	public static Point createMiddlePoint(Point point1, Point point2){
		int middleX = (point1.x + point2.x)/2;
		int middleY = (point1.y + point2.y)/2;
		Point middlePoint = new Point(middleX, middleY);
		return middlePoint;		
	}
	
}
public class Apppoint {

	public static void main(String[] args) {
		Point startPoint = new Point();
		startPoint.x = 0;
		startPoint.y = 0;
		
		
		System.out.println(startPoint);
		System.out.println(startPoint.toString());
		
		Point endPoint = new Point(10,10);
		System.out.println(endPoint);
		
//		int middleX = Point.calculateMiddlePoint(startPoint.x, endPoint.x);
//		int middleY = Point.calculateMiddlePoint(startPoint.y, endPoint.y);
//		
//		Point middlePoint = new Point(middleX, middleY);
//		System.out.println(middlePoint);
				
		Point middlePoint2 = Point.createMiddlePoint(startPoint, endPoint);
		System.out.println(middlePoint2);
		
		

	}

}
