package com.example.strings;

import java.util.Scanner;

/*
19. Write a program that prompts the user to enter a string and then
    checks if it contains only digits (0-9).
    Input:
    Enter a string: 123456
    Output:
    The string contains only digits
*/
public class InputDigits {
	public boolean checkInputDigits(String inputStr, String digits) {
		boolean isNumber = true;
		for (int i = 0; i < inputStr.length(); i++) {// 0,1,2,3
			char ch = inputStr.charAt(i);// 1,2,3,h
			if (!digits.contains(ch + "")) {// false,false,false,true
				isNumber = false;
				break;
			}
		}
		if (isNumber) {// false
			System.out.println("The string contains only digits");
		} else {// print
			System.out.println("The string not contains only digits");
		}
		return isNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");// 123he56
		String inputStr = scanner.nextLine();
		String digits = "0123456789";
		InputDigits obj = new InputDigits();
		boolean output = obj.checkInputDigits(inputStr, digits);
		System.out.println("The String contains only digits?: " + output);
		scanner.close();
	}
}
