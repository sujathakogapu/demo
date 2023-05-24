package com.example.oops;

public class Elephant extends Animal {
	public void sound() {
		System.out.println("Elephant is trumpet");
	}

	public static void main(String[] args) {
		Elephant obj = new Elephant();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
