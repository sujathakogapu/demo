package com.example.basics;

import java.util.Scanner;

public class CubeOfNumber {
	public int getCube(int num) {
		int cube=0;
		return cube = (num * num * num);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scanner.nextInt();
		CubeOfNumber obj = new CubeOfNumber();
		int cube = obj.getCube(num);
		System.out.println("The cube of a number is:" + cube);
		scanner.close();

	}

}
