package com.example.oops;

public class Tiger extends Animal {
	public void sound() {
		System.out.println("tiger is growel");
	}

	public static void main(String[] args) {
		Tiger obj = new Tiger();
		obj.eat();
		obj.sleep();
		obj.sound();
	}
}
