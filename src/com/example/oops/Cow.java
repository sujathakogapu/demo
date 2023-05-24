package com.example.oops;

public class Cow extends Animal {
	public void sound() {
		System.out.println("Cow is moo");
	}

	public static void main(String[] args) {
		Cow obj = new Cow();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
