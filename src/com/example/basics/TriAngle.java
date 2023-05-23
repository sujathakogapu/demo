package com.example.basics;

import java.util.Scanner;

/*
 * perimetr=a+b+c;
 * area=1/2*b*h;
 */
public class Triangle {
	double a, b, c, height = 0;

	public Triangle(double a, double b, double c, double height) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.height = height;
	}

	public double calPerimeter() {
		return this.a + this.b + this.c;
	}

	public double calArea() {
		return 1 / 2 * this.b * this.height;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of A:");
		double a = scanner.nextDouble();
		System.out.println("Ebter the side of B: ");
		double b = scanner.nextDouble();
		System.out.println("Enter the side of C: ");
		double c = scanner.nextDouble();
		System.out.println("Enter the height of the Triangle: ");
		double height = scanner.nextDouble();
		scanner.close();
		Triangle obj = new Triangle(a, b, c, height);
		double perimeter = obj.calPerimeter();
		System.out.println("The perimeter of the triangle is: " + perimeter);
		double area = obj.calArea();
		System.out.println("The area of the triangle is: " + area);

	}

}
