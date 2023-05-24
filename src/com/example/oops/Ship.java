package com.example.oops;

public class Ship extends Vehicle {
	public void drive() {
		System.out.println("sailing the ship on water");
	}

	public static void main(String[] args) {
		Ship obj = new Ship();
		obj.drive();
		obj.start();
		obj.stop();
	}

}
