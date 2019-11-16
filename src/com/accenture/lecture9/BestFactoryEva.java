package com.accenture.lecture9;

public class BestFactoryEva {
	String worker;
	String location;
	int workerAmount = 25;
	boolean bancrupt = false;

	void hireNewWorker(int n) {
		if (bancrupt) {
			System.out
					.println("Your Factory is now BANCRUPT! operation prohibited");
		} else {			
			++workerAmount;
			System.out.println("In Factory now is working " + workerAmount
					+ " Oompa Loompas!");
		}
	}

	void fireWorker(int amountOfWorkersToFire) {
		if (bancrupt) {
			System.out.println("Your Factory is now BANCRUPT!");
		} else {
			if (this.workerAmount < amountOfWorkersToFire) {
				this.workerAmount = 0;
			} else {
				workerAmount = workerAmount - amountOfWorkersToFire;
			}
			System.out.println("In your Factory now is working " + workerAmount
					+ " Oompa Loompas!");
		}
	}

	void fireAll() {
		if (bancrupt) {
			System.out.println("Your Factory is now BANCRUPT!");
		} else {
			workerAmount = 0;
			System.out.println("There are " + workerAmount
					+ " Oompa Loompas in your Factory!");
		}
	}

	void bancrupt() {
		fireAll();
		this.bancrupt = true;
		System.out.println("Your Factory is now BANCRUPT!");
	}

	void status() {
		System.out.println("Factory location:" + location + " worker amount: "
				+ workerAmount + " bancrupt=" + bancrupt);
	}

	public static void main(String[] args) {
		BestFactoryEva chocolateFactory = new BestFactoryEva();
		chocolateFactory.location = "Liepaja";
		chocolateFactory.status();

		chocolateFactory.hireNewWorker(5);
		chocolateFactory.fireWorker(555);
		chocolateFactory.status();

		chocolateFactory.bancrupt();
		chocolateFactory.status();

		chocolateFactory.fireAll();
		chocolateFactory.hireNewWorker(3);
		chocolateFactory.status();
	}
}