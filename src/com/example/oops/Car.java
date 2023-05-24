package com.example.oops;

public class Car extends Vehicle {
	public void drive() {
		System.out.println("Driving car on road");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.start();
		obj.stop();
		obj.drive();
	}

}
