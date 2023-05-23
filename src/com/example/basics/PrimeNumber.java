package com.example.basics;

/*
14. Write a program to print the first n prime numbers
    Input:
    Enter the value of n: 7
    Output:
    2 3 5 7 11 13 17
*/
import java.util.Scanner;

public class PrimeNumber {
	public boolean isPrime(int num) {
	boolean	isPrime=true;
		for(int i=2;1<num;i++) {//2,3,4,5,6
			if(num%i==0) {
				isPrime=false;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//7->2,3,5,7,11,13,17
		int num1 = scanner.nextInt();
		PrimeNumber obj=new PrimeNumber();
		boolean output=obj.isPrime(num1);
		System.out.println("number is prime:?"+output);
			scanner.close();
	}
	}
			
