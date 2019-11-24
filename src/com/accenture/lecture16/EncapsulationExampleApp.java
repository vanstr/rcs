package com.accenture.lecture16;


class BankAccount {
	private String owner;
	private int balance;
		
	public BankAccount(String owner, int initialBalance) {		
		this.owner = owner;
		this.balance = initialBalance;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}
	
}

public class EncapsulationExampleApp {

	public static void main(String[] args) {
		
		BankAccount johnAccount = new BankAccount("John" ,100); 

	}

}
