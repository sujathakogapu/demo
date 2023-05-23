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
	double radius = 0;//instance variable radius
	public Circle(double radius) {//parameterized constructor
		this.radius = radius;//assign value to the instance variable radius
	}
	
	public double calArea() {
		double area = (22 * this.radius * this.radius) / 7;
		return area;
	}

	public double calCircumference() {
		double circumference = (22 * this.radius) / 7;
		return circumference;
	}

	public static void main(String[] args) {
		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius of the circle:");// 5
		double radius = scanner.nextDouble();
		
		//object creation and initialize the state/variables
		Circle obj = new Circle(radius);//while object creation pass radius
		
		//calculate area
		double area = obj.calArea();
		System.out.println("Area of the circle is:" + area);// 78.54
		
		//calculate circumference
		double circumference = obj.calCircumference();
		System.out.println("The circumference of the circle: " + circumference);
		scanner.close();
	}
}
