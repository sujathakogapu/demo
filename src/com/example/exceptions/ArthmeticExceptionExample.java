package com.example.exceptions;

import java.util.Scanner;

public class ArthmeticExceptionExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a numaretor: ");
		int numaretor=scanner.nextInt();
		System.out.println("Enter a denominator: ");
		int denominator=scanner.nextInt();
		try {
		int output=numaretor/denominator;
		System.out.println(output);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}finally {
			scanner.close();
		}
		System.out.println("Rest of the program");
		
	}

}
