package com.example.basics;

/*
15. Write a program to check whether a given year is a leap year or not.
    Input:
    Enter a year: 2024
    Output:
    2024 is a leap year.
*/
import java.util.Scanner;

public class Year {
	public boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {// 2024
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year:");// 2024
		int inputYear = scanner.nextInt();
		Year year = new Year();
		boolean isLeapYear = year.isLeapYear(inputYear);
		System.out.println("Is leap year? " + isLeapYear);
		scanner.close();
	}
}
