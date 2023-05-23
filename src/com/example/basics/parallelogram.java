package com.example.basics;

import java.util.Scanner;

/*
 * area=lh
 * perimeter=2l+2w
 */
public class Parallelogram {
	double length, width, height = 0;

	public Parallelogram(double length, double height, double width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}

	public double calArea() {
		return this.length * this.height;
	}

	public double calPerimeter() {
		return 2 * this.length + 2 * this.width;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height of the parrallalogram: ");
		double height = scanner.nextDouble();
		System.out.println("Enter the width of the parrallalogram: ");
		double width = scanner.nextDouble();
		System.out.println("Enter the length of the parrallalogram: ");
		double length = scanner.nextDouble();
		scanner.close();
		Parallelogram obj = new Parallelogram(height, width, length);
		double area = obj.calArea();
		System.out.println("The area of the parrallalogram: " + area);
		double perimeter = obj.calPerimeter();
		System.out.println("The parimeter of the parrallalogram: " + perimeter);

	}

}
