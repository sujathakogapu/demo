package com.example.strings;

import java.util.Scanner;
/*
9.Write a program to find the frequency of a character in a string.
  Input:
  Enter a string: hello world
  Enter a character: l
  Output:
  The frequency of 'l' in the string is: 3
*/
public class FrequencyOfACharacterInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//hello world
		String inputStr = scanner.nextLine();
		System.out.print("Enter a character:");//l
		char ch = scanner.nextLine().charAt(0);
		int freq = 0;
		for (int i = 0; i < inputStr.length(); i++) {//h,e,l,l,o, ,w,o,r,l,d
			if (inputStr.charAt(i) == ch) {//h->false->0,e->false->0,l->true->1,l->true->2,o->false->2, ->false->2,w->false->2,o->false->2,l->true->3,d->false->3
				freq++;
			}
		}
		System.out.print("The frequency of 'l' in the string is:" + freq);
		scanner.close();
	}
}
