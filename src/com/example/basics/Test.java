package com.example.basics;

import java.util.Scanner;

public class Test {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter a number: ");
		int number=scanner.nextInt();
		if(number<0) {
			System.out.println("please provide positive number");
			return;
		}
		System.out.println("Remaining code");
	}
}
