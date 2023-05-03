package com.example.basics;

import java.util.Scanner;

/*
11. Write a program to convert temperature from Celsius to Fahrenheit.
    Input:
    Enter the temperature in Celsius: 25
    Output:
    25°C is equal to 77°F.
*/
public class TempFromCelsiusToFahrenheit {
	public static void main(String[] args) {
		float fahrenheit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius:");//25
		float celsius = scanner.nextFloat();
		fahrenheit =((celsius*9)/5)+32; 
		System.out.println(fahrenheit+"F");
		scanner.close();
	}
}
