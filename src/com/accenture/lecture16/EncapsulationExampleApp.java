package com.accenture.lecture16;


class BankAccount {
	private String owner;
	private int balance;
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}

public class EncapsulationExampleApp {

	public static void main(String[] args) {
		
		BankAccount johnAccount = new BankAccount();
		johnAccount.setOwner("John");
		johnAccount.setBalance(100); 

	}

}
