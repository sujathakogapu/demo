package com.example.basics;

/*
26. Write a program to convert a given binary number to decimal.
    Input:
    Enter the binary number: 101010
    Output:
    Decimal number = 42
*/
import java.util.Scanner;

public class ConvertToBinaryToDecimal {
	private static String binaryString;

	public int getDecimal(String binaryString) {
		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a binary form number: ");
		ConvertToBinaryToDecimal obj = new ConvertToBinaryToDecimal();
		int output = obj.getDecimal(binaryString);
		System.out.println("Decimal number: " + output);
		scanner.close();
	}

}
