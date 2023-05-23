package com.example.basics;

import java.util.Scanner;

/*
18. Write a program to find the LCM of two numbers.
    Input:
    Enter the first number: 4
    Enter the second number: 6
    Output:
   The LCM of 4 and 6 is: 12
*/
public class LCMOfTwoNumbers {
	public int getLCM(int num1, int num2) {
		int gcd = 1, lcm = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {// 1,2,3,4
			if (num1 % i == 0 && num2 % i == 0) {// 4%1==0,6%1==0,2,3->false
				gcd = i;// 1,2
			}
			lcm = (num1 * num2) / gcd;// 4*6/2->12
		}
		return lcm;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number:");// 4
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");// 6
		int num2 = scanner.nextInt();
		LCMOfTwoNumbers obj = new LCMOfTwoNumbers();
		int output = obj.getLCM(num1, num2);
		System.out.println("The LCM of " +num1+ " and " + num2+ " is:" + output);
		scanner.close();

	}

}
