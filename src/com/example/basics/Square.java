package com.example.basics;
/*
 * Square perimeter=4s
 * square area=s*s
 */

import java.util.Scanner;

public class Square {
	double side = 0;//instance variable side

	public Square(double side) {//parameterized constructor
		this.side = side;//assign value to the instance variable side
	}

	public double calArea() {
		return this.side * this.side;
	}

	public double calPerimeter() {
		return 4 * this.side;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		double side = scanner.nextDouble();
		scanner.close();
		//object creation
		Square obj = new Square(side);
		//calculate and call the method for area of the square
		double areaOfSquare = obj.calArea();
		System.out.println("The Area of the Square is: " + areaOfSquare);
		double perimeterSquare = obj.calPerimeter();
		//calculate and call the method for perimeter square
		System.out.println("The perimeter of the Square is: " + perimeterSquare);

	}

}
