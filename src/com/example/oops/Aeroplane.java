package com.example.oops;

public class Aeroplane extends Vehicle {
	public void drive() {
		System.out.println("Taxiing the Aeroplane");
	}

	public static void main(String[] args) {
		Aeroplane obj = new Aeroplane();
		obj.start();
		obj.stop();
		obj.drive();
	}

}
