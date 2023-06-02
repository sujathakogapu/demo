package com.example.exceptions;

import java.util.Scanner;

public class IllegalArgumentExceptionExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age=scanner.nextInt();
		if(age<0) {
			System.out.println("not valid");
		}else {
			System.out.println("valid");
		}
		
	}

}
