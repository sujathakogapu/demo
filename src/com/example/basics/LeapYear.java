package com.example.basics;
/*
15. Write a program to check whether a given year is a leap year or not.
    Input:
    Enter a year: 2024
    Output:
    2024 is a leap year.
*/
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year:");//2024
		int year = scanner.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {//2024
			System.out.println("Leap year:" + year);
		} else {
			System.out.println("Not Leap year:" + year);
		}
		scanner.close();
	}
}
