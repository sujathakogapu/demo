package com.example.basics;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius:");
		double rad = scanner.nextDouble();
		double area = (22 * rad * rad) / 7;
		System.out.println("Area of circle is:" + area);
		scanner.close();
	}

}
