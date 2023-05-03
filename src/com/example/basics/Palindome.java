package com.example.basics;
/*
22. Write a program to check if a given number is a palindrome or not.
    If the reverse of a number is the same as the original number, it is
    called a palindrome number. For example: 121, 34566543, 6, 56765, 87678,
    909 etc.
    For instance, 121 is a palindrome.
    After reversing 121, the reversed number is 121, so it is a palindrome
    number.
    Input1:
    Enter n: 121
    Output1:
    121 is palindrome
    Input2:
    Enter n: 123145
    Output2:
    123145 is not a palindrome
 */
import java.util.Scanner;

public class Palindome {
	public static void main(String[] args) {
		int reverce, sum = 0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		temp = num;
		while (num > 0) {//121>0
			reverce = num % 10;// 1,2,1
			sum = (sum * 10) + reverce;//0+1,12,120+1
			num = num / 10;//12,1
		}
		if (temp == sum)
			System.out.println("Given no is palindrome");
		else
			System.out.println("Given no is not palindome");
		scanner.close();
	}

}
