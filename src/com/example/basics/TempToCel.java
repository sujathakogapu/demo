package com.example.basics;

import java.util.Scanner;

public class TempToCel {
	public static void main(String[] args) {
		float celsius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Body temperature");
		float temp = scanner.nextFloat();
		System.out.println("Temperature in celsius is:");
		celsius = ((temp - 32) * 5) / 9;
		System.out.println(celsius);
		scanner.close();
	}

}
