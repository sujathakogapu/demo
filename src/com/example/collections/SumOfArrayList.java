package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
4.Write a program to sum elements from one ArrayList to another ArrayList.
  Input:
  ArrayList 1: [10, 20, 30]
  ArrayList 2: [40, 50, 60]
  Output:
  ArrayList1 after adding all elements from ArrayList 2: [50,70,90]
*/

public class SumOfArrayList {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList obj1=new ArrayList();
		System.out.println("Enter the first arraylist elements: ");
		for(int i=0;i<obj1.size();i++)
			ArrayList obj2=new ArrayList();
		System.out.println("Enter the second arraylist elements: ");
		for(int i=0;i<obj2.size();i++) {
			obj2.addAll(obj1);
		}
		System.out.println(obj2.size());
	}

}
