package com.example.basics;

import java.util.Scanner;

/*
13. Write a program to calculate the area of a circle.
    Input:
    Enter the radius of the circle: 5
    Output:
    The area of the circle is: 78.54
*/
public class Circle {
	public double calArea(double radius) {
		double area = (22 * radius * radius) / 7;
		return area;
	}

	public double calCircumference(double radius) {
		double circumference = (22 * radius) / 7;
		return circumference;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius of the circle:");// 5
		double radius = scanner.nextDouble();
		Circle circle = new Circle();
		double area = circle.calArea(radius);
		System.out.println("Area of the circle is:" + area);// 78.54
		double circumference = circle.calCircumference(radius);
		System.out.println("The circumference of the circle: " + circumference);
		scanner.close();
	}
}
