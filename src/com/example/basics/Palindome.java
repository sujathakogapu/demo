package com.example.basics;

import java.util.Scanner;

public class Palindome {
	public static void main(String[] args) {
		int reverce, sum = 0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		temp = num;
		while (num > 0) {//121>0
			reverce = num % 10;// getting reminder,121%10=1,
			sum = (sum * 10) + reverce;//0*10+1=1
			num = num / 10;//
		}
		if (temp == sum)
			System.out.println("Given no is palindrome:" + num);
		else
			System.out.println("Given no is not palindome:" + num);
		scanner.close();
	}

}
