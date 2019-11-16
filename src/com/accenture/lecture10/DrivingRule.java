package com.accenture.lecture10;

public class DrivingRule {
	private final String name; // initialize in field either in constructor
	private String description;

	private static String country = "Latvia";
	
	private static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;
	
	static int amount = 0;
	
	public DrivingRule(String name){
		this(name, null);
	}
	
	public DrivingRule(String name, String description){
		this.name = name;	
		this.description = description;
		amount++;
		System.out.println("Driving rule " + name + " desc: " + description);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrivingRule rule1 = new DrivingRule("Speed limit in city");
		DrivingRule rule2 = new DrivingRule("Speed limit out side city", "Drivers should drive up to " + MAX_SPEED_OUTSIDE_CITY + " KM/h" );
		DrivingRule rule3 = new DrivingRule("Speed penalties", "If driver violate max speed outside of city " + MAX_SPEED_OUTSIDE_CITY + " KM/h  more that 20 km fine will be 20eur" );
		
		System.out.println("Total amount of driving rules: " + DrivingRule.amount);

	}

}
