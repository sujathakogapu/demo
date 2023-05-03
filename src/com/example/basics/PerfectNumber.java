package com.example.basics;
/*
25. Write a program to check if a given number is perfect or not.
    A perfect number is a positive integer whose sum of its proper positive
    divisors equal to the perfect number.
    For instance, The first perfect number is 6.
    1, 2, and 3 are the proper divisors of 6.
    1 + 2 + 3 = 6 is the sum of the correct divisors.As a result, the number
    6 is perfect.
    The number 28 is the second perfect number.
    28's proper divisors are 1, 2, 4, 7, and 14.
    1 + 2 + 4 + 7 +14 = 28 is the sum of its proper divisors. As a result,
    28 is a perfect number.
    Input1:
    Enter n: 6
    Output1:
    6 is perfect.
    Input2:
    Enter n: 20
    Output2:
    20 is not perfect
*/
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		long num, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");//6
		num = scanner.nextLong();
		int i = 1;
		while (i <= num / 2) {//1,2,3
			if (num % i == 0) {//6%1==0,6%2==0,6%3==0
				sum = sum + i;//1,2,3
			}
			i++;
		}
		if (sum == num) {
			System.out.println(num + " is a perfect number.");
		} else
			System.out.println(num + " is not a perfect number.");
		scanner.close();
	}

}
