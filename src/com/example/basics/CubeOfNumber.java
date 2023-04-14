package com.example.basics;

import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scanner.nextInt();
		int cube = (num * num * num);
		System.out.println("The cube of a number is:" + cube);
		scanner.close();

	}

}
