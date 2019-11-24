package com.accenture.lecture16;


class BankAccount {
	String owner;
	int balance;

}

public class EncapsulationExampleApp {

	public static void main(String[] args) {
		BankAccount johnAccount = new BankAccount();
		johnAccount.owner = "John";
		johnAccount.balance = 100; 

	}

}
