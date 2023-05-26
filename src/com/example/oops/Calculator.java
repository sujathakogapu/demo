package com.example.oops;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) { //same method + no inheritance + different signatures -> static polymorphism -> method overloading
		return a + b + c;//
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(2, 5));
		System.out.println(obj.add(2, 5, 3));//compile time polymorphism or static 
	}
}
