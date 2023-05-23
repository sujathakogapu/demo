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

public class Palindrome {
	public boolean isPalindrome(int num) {
		boolean isPalindrome = false;
		int sum = 0, temp, reverse;
		temp = num;
		while (num > 0) {// 121>0
			reverse = num % 10;// 1,2,1
			sum = (sum * 10) + reverse;// 0+1,12,120+1
			num = num / 10;// 12,1
		}
		if (temp == sum) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		Palindrome obj = new Palindrome();
		boolean output = obj.isPalindrome(num);
		System.out.println(num + " is a palindrome? " + output);
		scanner.close();
	}

}
