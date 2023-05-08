package com.example.accessmodifiers2;

import com.example.accessmodifiers1.SameClass;

public class DifferntpackegeChildClass extends SameClass {
	public static void main(String[] args) {
		DifferntpackegeChildClass obj = new DifferntpackegeChildClass();
		obj.publicVar = 10;//// we can access public variable because public is visible in every where
		// obj.privateVar = 20;//we cannot access private because different class and
		// different package
		// obj.defaultVar = 30;//we cannot access default because different package and
		// different class
		obj.protectedVar = 40;// we can access because different package and child class
	}
}
