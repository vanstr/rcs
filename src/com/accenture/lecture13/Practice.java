package com.accenture.lecture13;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int[] myArrays = new int[10];
		for (int i = 0; i < myArrays.length; i++) {
			myArrays[i] = i * 2;

		}

		// Task 0 - move "Hello world" output into method sayHi() and call it twice
		System.out.println("Hello world");
		
		//	Task 1 - print out into console content of myArray, as following 
		//	0 element is 0
		//	1 element is 2
		//	2 element is 4
		//	3 element is 6
		//	4 element is 8
		//	5 element is 10
		//	6 element is 12
		//	7 element is 14
		//	8 element is 16
		//	9 element is 18
		
		// Task 1.1 - printArray() should do the same logic as above code 
		//  0 element is 0
		//	1 element is 2
		// ...
		//	9 element is 18
		printArray(myArrays);
		
		
		
		// Task 2 - getSum() should return sum of all elements of passed array
		// You should get printed out into console: Sum is 90
		int sum = getSum(myArrays);	
		System.out.println("Sum is " + sum);


		
		// Task 3 - getAvarege() should return average of all elements of passed array
		// Here you should get printed out into console: Average is 9
		int avarege = getAvarege(myArrays);
		System.out.println("Avarege is " + avarege);
		
		
		
		// Task 4 - getAvaregeDouble() should return sum of all elements of passed array
		// You should get printed out into console: Average is 9.0
		double doubleAvarege = getAvaregeDouble(myArrays);
		System.out.println("Avarege double value is " + doubleAvarege);

		
		
		// Task 5 - getArrayDefinedByUser() this method should ask user to fill array of 3 elements  	
		// Possible console content:
		//	Enter 3thy:
		//	3
		//	6
		//	7
		//	0 element is 3
		//	1 element is 6
		//	2 element is 7
		int[] myIntegers = getArrayDefinedByUser(3);
		printArray(myIntegers);	
		
		
		// Task 6 - make sure getAvarege() and getAvaregeDouble() methods uses getSum() method
		// their shouldn't have duplicated logic with sum() method 
		
		
		// Task 7 - rewrite printArray() to use enhanced loop
		
		
		// Task 8 - create your own method, which 
		// - at first, will ask user how big array he wants to create *you will need to use Scanner class
		// - after user should enter in console value for each element of an array
		// - at the end array should be printed out into console *you can reuse already existing method printArray()
		// Possible console content:
		//	Enter array size:
		//	4
		//	Enter value of each array element:
		//	5
		//	2
		//	1
		//	12
		//	0 element is 5
		//	1 element is 2
		//	2 element is 1
		//	3 element is 12
		
		
		// Task 8.1 - rewrite your program, that Scanner object would be initialized only once in your program
		// * hint, think about making Scanner instance(object) as a class static field and use it in your code
		
		// Task 8.2 - 
		
		
		
		
	}

	public static void printArray(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(i + " element is " + arrays[i]);
		}
	}

	public static int getSum(int[] arrays) {
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		return sum;
	}

	public static int getAvarege(int[] arrays) {
		return getSum(arrays) / arrays.length;
	}

	public static double getAvaregeDouble(int[] arrays) {
		return (double) getSum(arrays) / (double) arrays.length;
	}

	public static int[] getArrayDefinedByUser(int numbers) {
		System.out.println("Enter " + numbers + "thy:");
		Scanner scanner = new Scanner(System.in);
		int[] values = new int[numbers];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

}
