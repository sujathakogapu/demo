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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a binary form number:");
		String binaryString=" ";
			int decimal=Integer.parseInt(binaryString,2);  
			System.out.println(decimal);
			scanner.close();
			}
		
	}


