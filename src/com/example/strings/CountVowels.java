package com.example.strings;

import java.util.Scanner;
/*
3.Write a program to count the number of vowels in a string.
  Input:
  Enter a string: hello world
  Output:
  The number of vowels in the string is: 3
*/
public class CountVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hello world
		String inputStr = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' || inputStr.charAt(i) == 'i'
					|| inputStr.charAt(i) == 'o' || inputStr.charAt(i) == 'u') {//h->false->0,e->true->1,l->false->1,l->false->1,o->true->2, ->false->2,w->false->2,o->true->3,r->false->3,l->false->3,d->false->3
				count++;
			}
		}
		System.out.print("The number of vowels in the string is:" + count);
		scanner.close();
	}
}
