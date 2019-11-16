package com.accenture.lecture12;

class DrivingRule {
	private final String name;
	private String description;
	public  static String country = "Latvia";

	public static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;

	private static int totalRules;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public DrivingRule(String name, String description) {
		this.name = name;
		this.description = description;
		totalRules++;
		// if (totalRules == 1) {
		// System.out.println("Together there is " + totalRules
		// + " driving rule.");
		// } else {
		// System.out.println("Together there are " + totalRules
		// + " driving rules.");
		// }
	}

	public void printInfo() {
		System.out.println("It is rule of country" + country + " name is :"
				+ this.name);
	}

}

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrivingRule.country = "Estonia";
		DrivingRule rule1 = new DrivingRule("City", "You are in the city.");

		rule1.printInfo();

		DrivingRule rule2 = new DrivingRule("Outside the city",
				"This is countryside." + DrivingRule.MAX_SPEED_IN_CITY);
		// rule2.setCountry("Estonia");
		rule2.printInfo();

		DrivingRule rule3 = new DrivingRule("Traffic lights",
				"You can't drive past the red light.");
		// rule3.setCountry("Estonia");
		rule3.printInfo();

	}
}