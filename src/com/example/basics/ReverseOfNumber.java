package com.example.basics;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int reverse = 0, reminder;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for (; num != 0; num = num / 10) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println("the reverse of a given number is:" + reverse);
		scanner.close();
	}

}
