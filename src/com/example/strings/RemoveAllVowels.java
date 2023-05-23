package com.example.strings;

import java.util.Scanner;

/*
14. Write a program to remove all the vowels from a string.
    Input:
    Enter a string: Hello World
    Output:
    The string without vowels is: Hll Wrl
*/
public class RemoveAllVowels {
	public String removeVowels(String inputStr) {
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' || inputStr.charAt(i) == 'i'
					|| inputStr.charAt(i) == 'o' || inputStr.charAt(i) == 'u' || inputStr.charAt(i) == 'A'
					|| inputStr.charAt(i) == 'E' || inputStr.charAt(i) == 'I' || inputStr.charAt(i) == 'O'
					|| inputStr.charAt(i) == 'U') {
				inputStr = inputStr.replace(inputStr.charAt(i) + "", "");
			}
		}
		return inputStr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence:");// HI hello
		String inputStr = scanner.nextLine();
		RemoveAllVowels obj = new RemoveAllVowels();
		String output = obj.removeVowels(inputStr);
		System.out.println(output);
		scanner.close();
	}
}
