package com.accenture.lecture17;

import java.util.Random;

public class Vehicle {

	protected int seats;
	protected int number;

	public Vehicle() {
		this(1, new Random().nextInt(1000));
	}

	public Vehicle(int seats, int number) {
		this.seats = seats;
		this.number = number;
		System.out.println("Vehicle is created");
	}

	public void drive() {
		System.out.println("Drive a vehicle");
	}

}
