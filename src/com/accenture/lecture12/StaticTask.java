package com.accenture.lecture12;

public class StaticTask {

	public static int sum(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;
	}
	
	public static int sumArrayValues(int[] myArray){
		return 0 ; // TODO
	}
	
	public static void printOut(int[] myArray){
		// TODO
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(1, 2, 3);
		System.out.println(sum);
		
		int[] data = new int[4];
		
		sumArrayValues(data);
		printOut(data);
	}

}
