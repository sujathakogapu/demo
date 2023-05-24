package com.example.oops;

public class Pig extends Animal {
	public void sound() {
		System.out.println("pig is oink");
	}

	public static void main(String[] args) {
		Pig obj = new Pig();
		obj.eat();
		obj.sleep();
		obj.sound();
	}
}
