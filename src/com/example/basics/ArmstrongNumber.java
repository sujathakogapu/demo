package com.example.basics;

import java.util.Scanner;

/*
24. Write a program to check if a given number is an Armstrong number or
    not.An Armstrong number is the sum of its digits, each raised to the
    power of the digits' number, i.e., if we have a three-digit number, then
    the sum of the cube of all the digits must equal the number itself.
    For instance, 153 is an armstrong number.
    153 = 1
    3 + 5
    3 + 3
    3 = 1 + 125 + 27 = 153.
    Since the sum of the cube of all digits is equal to the number itself,
    hence it is the Armstrong number.
    For instance,1634 is an armstrong number.
    1634 = 1
    4 + 6
    4 + 3
    4 + 4
    4 = 1 + 1296 + 81 + 256 = 1634
    Since the sum of the cube of all digits is equal to the number itself,
    hence it is the Armstrong number.
    Input1:
    Enter n: 153
    Output1:
    153 is an Armstrong number.
    Input2:
    Enter n: 152
    Output2:
    152 is not an Armstrong number.
*/
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");//153
		int num = scanner.nextInt();
		int temp = num;
		int power = 0;
		while (num > 0) {//153>0->true
			int rem = num % 10;//153%10->3,5
			power = power + (rem * rem * rem);//3*3*3,5*5*5,1*1*1
			num = num / 10;//15/10->
		}
		if (temp == power) {
			System.out.println("Yes. It is Armstrong No.");
		} else {
			System.out.println("No. It is not an Armstrong No.");
		}
		scanner.close();
	}
}
