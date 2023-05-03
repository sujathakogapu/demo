package com.example.basics;

/*
4.Write a program to sum of first n natural numbers using a while loop
  Input:
  Enter n: 6
  Output:
  Sum of first 6 natural numbers is: 21
*/
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//6
		int num = scanner.nextInt();
		int i = 1;
		while (i <= num) {//0<=6,1<=6,2<=6,3<=6,4<=6,5<=6,6<=6
			sum = sum + i;//1+2+3+4+5+6
			i++;//2,3,4,5,6
		}
		System.out.print("Sum of first n natural numbers is:" + sum);
		scanner.close();
	}
}
