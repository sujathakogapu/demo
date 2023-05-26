package com.example.oops;

public class Vehicle {
	public void start() {
		System.out.println("vehicle started");
	}
	public void stop() {
		System.out.println("vehicle stopped");
	}
	public void drive() {
		System.out.println("Driving vehicle");
	}
	public static void main(String[] args) {
		BankEncapsulation obj=new BankEncapsulation();
		obj.setBankBalance(10000);
		System.out.println(obj.getBankBalance());
	}

}
