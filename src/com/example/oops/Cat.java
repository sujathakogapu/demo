package com.example.oops;

public class Cat extends Animal {
	public void sound() {
		System.out.println("Cat is Meow");
	}

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
