package com.example.basics;

/*
14. Write a program to print the first n prime numbers
    Input:
    Enter the value of n: 7
    Output:
    2 3 5 7 11 13 17
*/
import java.util.Scanner;

public class FirstNPrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//7->2,3,5,7,11,13,17
		int num = scanner.nextInt();
		for(int i=2;1<num;i++) {//2,3,4,5,6
			if(num%i==0) {
				System.out.print("not prime");
			}
			else {
				System.out.print("prime");
			}
			scanner.close();	
			
			}
		}
}
