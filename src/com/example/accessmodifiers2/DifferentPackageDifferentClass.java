package com.example.accessmodifiers2;

import com.example.accessmodifiers1.SameClass;

public class DifferentPackageDifferentClass {
	public static void main(String[] args) {
		SameClass obj = new SameClass();
		obj.publicVar = 10;// we can access public variable because public is visible in every where
		// obj.privateVar = 20;//we cannot access private variables because different
		// package different different class
		// obj.defaultVar = 30;// we cannot access default variable because different
		// package and different class
		// obj.protectedVar = 40;// we cannot access protect variable because different
		// package and different class

	}

}
