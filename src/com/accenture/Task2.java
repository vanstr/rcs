package com.accenture;

class ArrayWorker{
	int sumValues(int[] processedArray){
		int sum = 0;		
		for(int value : processedArray){
			sum = sum + value;
		}
		return sum;
		
	}
}

public class Task2 {
	public static void main(String[] args) {
		int[] processedArray = {1,4,5,677777};
		
		
		ArrayWorker arrayWorker = new ArrayWorker();		
		int sum = arrayWorker.sumValues(processedArray);
		System.out.println("Sum of array is " + sum);

	}

}
