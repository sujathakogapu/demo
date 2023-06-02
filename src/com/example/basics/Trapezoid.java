package com.example.basics;

/*
 * perimeter=1/2h(b1+b2)
 * area=a1+b1+a2+b2
 */
import java.util.Scanner;

public class Trapezoid {
	double a1, b1, a2, b2=0;
	double h=0;

	public Trapezoid(double a1, double b1, double a2, double b2, double h) {
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.h = h;
	}

	public double calPerimeter() {
		return (1 / 2) *this.h*(this.b1 + this.b2);//common sense is the rare sense
	}



	public double calArea() {
		return a1 + b1 + a2 + b2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a side A1: ");
		double a1 = scanner.nextDouble();
		System.out.println("Enter a side A2: ");
		double a2 = scanner.nextDouble();
		System.out.println("Enter a side B1: ");
		double b1 = scanner.nextDouble();
		System.out.println("Enter a side B2: ");
		double b2 = scanner.nextDouble();
		System.out.println("Enter a height of a trapezoid: ");
		double h = scanner.nextDouble();
		scanner.close();
		Trapezoid obj = new Trapezoid(a1, b1, a2, b2, h);
		double perimeter = obj.calPerimeter();
		System.out.println("The perimeter of the Trapezoid is: " + perimeter);
		double area = obj.calArea();
		System.out.println("The area of the TrapeZoid is: " + area);

	}

}
