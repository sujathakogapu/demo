package com.example.basics;

public class SwitchEvenOdd {
	public static void main(String[] args) {
		int number = 11;
		switch (number % 2) {
		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}
}
