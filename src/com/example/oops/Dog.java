package com.example.oops;

public class Dog extends Animal{
	public void sound() {
		System.out.println("Dog is barking");
	}
	public static void main(String[] args) {
		Animal obj=new Dog();//you can create a child object using parent reference
		//Dog obj=new Dog();// you can create a child object directly
		//Animal obj=new Animal();//you can create a parent object directly
		//Dog obj=new Animal();//you cannot create parent object using child reference
		obj.eat();//this from super or parent class
		obj.sleep();//this from super or parent class
		obj.sound();//this from sub or child class
	}

}
