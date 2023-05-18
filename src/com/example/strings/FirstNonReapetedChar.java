package com.example.strings;

import java.util.Scanner;

/*
11. Write a program to find the first non-repeated character in a string.
    Input:
    Enter a string: morning
    Output:
    The first non-repeated character in the string is: m
*/
public class FirstNonReapetedChar {
	public char getFirstNonReapetedChar(String inputStr) {
		boolean isRepeating = true;
		if(inputStr.length() == 1) {
			char outputStr= inputStr.charAt(0);
		}
		for (int i = 0; i <inputStr.length(); i++) {//0,1,2,3,4,5,6,7,8,9
			String currentChar = inputStr.substring(i, i + 1);//(0,1)->m,(1,1+1)->m,(2,2+1)->o,(3,3+1)->o,(4,4+1)->r,(5,5+1)->n,(6,6+1)->i,(7,7+1)->n,(8,8+1)->g,false
			String stringBeforeChar = inputStr.substring(0, i);
			String stringAfterChar = inputStr.substring(i + 1);
			String remainingString = stringBeforeChar + stringAfterChar;//1->moorning,2->oorning,3->orning,4->rning,5->ning,6->ing,7->ng,8->g,9-false
			if (!remainingString.contains(currentChar)) {//false,
				System.out.println("The first non-repeated character in the string is: " + currentChar);
				isRepeating = false;
				break;
			}
		}	
		return outputStr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");//mmoorning->9
		String inputStr = scanner.nextLine();
		int length = inputStr.length();
		scanner.close();
		
		
		if(isRepeating) {
			System.out.println("There is no first non-repeated character in the string");
		}
		
	}
}
