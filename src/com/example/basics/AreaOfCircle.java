package com.example.basics;

import java.util.Scanner;

/*
13. Write a program to calculate the area of a circle.
    Input:
    Enter the radius of the circle: 5
    Output:
    The area of the circle is: 78.54
*/
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius of the circle:");// 5
		double rad = scanner.nextDouble();
		double area = (22 * rad * rad) / 7;
		System.out.println("Area of the circle is:" + area);// 78.54
		scanner.close();
	}
}
