package com.accenture.lecture19;

public class TernaryOperatorTask {

	public static void main(String[] args) {
		// receive passed arguments and parse them from string to integers 
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		
		int biggestValue;
		if(arg1 > arg2) {
			biggestValue = arg1;
		}else {
			biggestValue = arg2;
		}
		System.out.println("The biggest value is " + biggestValue);
	}
}
