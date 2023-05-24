package com.example.oops;

public class Rabbit extends Animal {
	public void sound() {
		System.out.println("Rabbit is hrr");
	}

	public static void main(String[] args) {
		Rabbit obj = new Rabbit();
		obj.eat();
		obj.sleep();
		obj.sound();
	}
}
