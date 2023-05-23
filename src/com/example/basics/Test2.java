package com.example.basics;

import java.util.Scanner;

class Test2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number =scanner.nextInt();
		scanner.close();
		int count=1;
		System.out.print("Even numbers are: ");
		for(int i=2;i<=number;i++) {
			if(i%2==0) {
				count++;
				System.out.print(i+" ");
			}
			if(count>3) {
				return;
			}
		}
		System.out.println("remaining code");
	}

}
