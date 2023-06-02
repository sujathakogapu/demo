package com.example.collections;
/*
Write a program to remove all strings from an ArrayList that have a
length 6.
Input:
[Apple,Banana,Mango,Orange,Pineapple]
Output:
ArrayList after removing strings with length 6:[Apple,Mango,Pineapple]

 */

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveStrings {
	public ArrayList removeStringsFromArrayList(ArrayList obj, int length) {
		for (int i = 0; i < obj.size(); i++) {
			String str = (String) obj.get(i);
			if (str.length() == length) {
				obj.remove(str);
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of strings");
		int size = scanner.nextInt();
		ArrayList obj = new ArrayList();
		scanner.nextLine();
		System.out.println("Enter strings");
		for (int i = 0; i < size; i++) {
			obj.add(scanner.nextLine());
		}
		System.out.println("Enter the length of the String to be remove");
		int length=scanner.nextInt();
		RemoveStrings rmstr=new RemoveStrings();
		ArrayList strList=rmstr.removeStringsFromArrayList(obj,length);
		System.out.println("ArrayList after removing strings with length "+length+":"+strList);
		

	}

}
