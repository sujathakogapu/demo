package com.example.oops;

public class Train extends Vehicle {
	public void drive() {
		System.out.println("Driving the train on track");
	}

	public static void main(String[] args) {
		Train obj = new Train();
		obj.drive();
		obj.start();
		obj.stop();
	}

}
