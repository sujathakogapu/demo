package com.example.basics;

/*
 * perimeter=2length*2width
 * area=length*width
 */
import java.util.Scanner;

public class Rectangle {
	double length = 0;// instance variable
	double width = 0;

	public Rectangle(double length, double width) {// parameterized constaructor
		this.length = length;
		this.width = width;
	}

	public double calArea() {
		return this.length * this.width;
	}

	public double calPerimeter() {
		return 2 * this.length + 2 * this.width;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// inputs from user
		System.out.println("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width = scanner.nextDouble();
		scanner.close();
		// object creation
		Rectangle obj = new Rectangle(length, width);
		// mathod call and calaculate the area
		double area = obj.calArea();
		System.out.println("The area of the Rectangle is: " + area);
		// method call and calculate the perimeter
		double perimeter = obj.calPerimeter();
		System.out.println("the perimeter of the Rectangle is: " + perimeter);

	}

}
