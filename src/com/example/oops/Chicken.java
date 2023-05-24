package com.example.oops;

public class Chicken extends Animal {
	public void sound() {
		System.out.println("chicken is chuk");
	}

	public static void main(String[] args) {
		Chicken obj = new Chicken();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
