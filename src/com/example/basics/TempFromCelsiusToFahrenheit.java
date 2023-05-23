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
	public float getFahrenheit(float celsius) {
		float fahrenheit = 0;
		fahrenheit = ((celsius * 9) / 5) + 32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius:");// 25
		float celsius = scanner.nextFloat();
		TempFromCelsiusToFahrenheit obj = new TempFromCelsiusToFahrenheit();
		float output = obj.getFahrenheit(celsius);
		System.out.println(output + "F");
		scanner.close();
	}
}
