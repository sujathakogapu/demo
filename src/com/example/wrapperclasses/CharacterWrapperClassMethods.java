package com.example.wrapperclasses;

import java.util.Scanner;

public class CharacterWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first character: ");
		char character=scanner.next();
		System.out.println("ENter a second number: ");
		int num2=scanner.nextInt();
		char char1='a';
		char char2='b';
        Character char3 = new Character(char1);
        System.out.println(Character.charCount(num2));
	}}
