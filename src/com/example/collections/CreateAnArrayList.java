package com.example.collections;
/*
1.Write a program to create an ArrayList and add five integers to it. Then
  print the elements of the ArrayList.
*/

import java.util.ArrayList;

public class CreateAnArrayList {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(5);
		obj.add(10);
		obj.add(15);
		obj.add(20);
		System.out.print(obj);
	}

}
