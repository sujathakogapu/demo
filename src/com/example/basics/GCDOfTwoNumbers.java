package com.example.basics;

/*
19. Write a program to find the GCD of two numbers.
    Input:
    Enter the first number: 12
    Enter the second number: 18
    Output:
    The GCD of 12 and 18 is: 6
*/
import java.util.Scanner;

public class GCDOfTwoNumbers {
	public int getGCD(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {// 1,2,3,4,5,6,7,8,9,10,11,12->common factors1,2,3,6
			if (num1 % i == 0 && num2 % i == 0) {// 1,2,3,6
				gcd = i;// 6
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");// 12->1,2,3,4,6,12
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");// 18->1,2,3,6,9,18
		int num2 = scanner.nextInt();
		GCDOfTwoNumbers obj = new GCDOfTwoNumbers();
		int output = obj.getGCD(num1, num2);
		System.out.println("The GCD of num1 and num2 is:" + output);
		scanner.close();
	}
}
