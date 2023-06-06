package com.example.collections;
/*
12. Write a program to check if a linked list is palindrome.
    Input:
    [1 2 3 2 1]
    Output:
    It is a palindrome
 */

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeLinkedList {
	public boolean isPalindrome(LinkedList list) {
		boolean isPalindrome = false;
		for(int i=0;i<list.size();i++) {
			for(int j=list.size()-1;j>=0;j--) {
				if(list(i)==list(j)) {
					isPalindrome=true;
				}
			}
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		LinkedList list=new LinkedList();
		System.out.println("Enter a elements: ");
		for(int i=0;i<size;i++) {
			list.add(scanner.nextInt());
	}
		PalindromeLinkedList obj=new PalindromeLinkedList();
		boolean list2=obj.isPalindrome(list);
		System.out.println("It is palindrome: "+list2);
	}
}
