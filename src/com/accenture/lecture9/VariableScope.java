package com.accenture.lecture9;

public class VariableScope {

	private int y = 6;
	private int z;

	void methodScope() {
		int x;
		z = 6;
		x = 6;
	}

	void doSomeCalc(int z2) {

	}

	void method2Scope() {
		int i;
		for (i = 0; i < 20000; i++) {
			int blockVariable = 0;
			i++;

		}
		
		System.out.println("Last element is" + i);

		z = 5;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
