package com.example.basics;
/*
21. Write a program to find the reverse of a given number.
    Input:
    Enter n: 1234
    Output:
    Reverse = 4321
*/
import java.util.Scanner;
public class ReverseOfNumber {
	public static void main(String[] args) {
		int reverse = 0, reminder;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//1234
		int num = scanner.nextInt();
		while(num>0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num=num/10;
		}
		System.out.println("the reverse of a given number is:" + reverse);
		scanner.close();
	}
}
