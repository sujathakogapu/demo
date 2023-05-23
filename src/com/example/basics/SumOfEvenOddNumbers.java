package com.example.basics;

/*
17. Write a program to find the sum of even and odd numbers up to a given
    limit.
    Input:
    Enter a limit: 10
    Output:
    The sum of even numbers up to 10 is: 30
    The sum of odd numbers up to 10 is: 25
*/
import java.util.Scanner;

public class SumOfEvenOddNumbers {
	public int getSumOfEvenOdd(int num) {
		int evenSum = 0, oddSum = 0;
		int sum=evenSum+oddSum;
		for (int i = 1; i <= num; i++) {// 1,2,3,4,5,6,7,8,9,10
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a limit:");// 10->evennos->2,4,6,8,10,odd nos->1,3,5,7,9
		int num = scanner.nextInt();
		scanner.close();
		SumOfEvenOddNumbers obj=new SumOfEvenOddNumbers();
		int output=obj.getSumOfEvenOdd(num);
		System.out.println("The sum of even numbers up to 10 is:" + output);
		System.out.println("The sum of odd numbers up to 10 is:" + output);
	}
}