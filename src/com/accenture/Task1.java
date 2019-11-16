package com.accenture;

class Phone {

	String introducePhone( boolean awesome, double version) {
//		double newVersion= version + 1;
//		String result = "Content" + version;
		return "" + awesome + version ;
	}
}


public class Task1 {
	public static void main(String[] args) {

		Phone myPhone = new Phone();
		String msg = myPhone.introducePhone(true, 2.0);
		System.out.println(msg);
	}
}