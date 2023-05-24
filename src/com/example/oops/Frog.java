package com.example.oops;

public class Frog extends Animal {
	public void sound() {
		System.out.println("Frog is ribbet");
	}

	public static void main(String[] args) {
		Frog obj = new Frog();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
