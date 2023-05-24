package com.example.oops;

public class Donkey extends Animal {
	public void sound() {
		System.out.println("Donkey is hee-haw");
	}

	public static void main(String[] args) {
		Donkey obj = new Donkey();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
