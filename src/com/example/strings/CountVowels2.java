package com.example.strings;

import java.util.Scanner;
/*
3.Write a program to count the number of vowels in a string.
  Input:
  Enter a string: hello world
  Output:
  The number of vowels in the string is: 3
*/
public class CountVowels2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hello world
		String inputStr = scanner.nextLine();
		String vowels="aeiou";
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if(vowels.indexOf(inputStr.charAt(i))>=0){//h->-1->false->0,e->1->true->1,l,l,o, ,w,o,r,l,d
				count++;
			}
		}
		System.out.print("The number of vowels in the string is:" + count);
		scanner.close();
	}

}
