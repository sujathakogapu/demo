package com.example.accessmodifiers1;

public class SamePackageChildClass extends SameClass {
	public static void main(String[] args) {
		SamePackageChildClass obj = new SamePackageChildClass();
		obj.publicVar = 10;// we can access public variable because public is visible in every where
		// obj.privateVar = 20;//we cannot access private variables because same package
		// and different class
		obj.defaultVar = 30;// we can access default variable because same package and different class
		obj.protectedVar = 40;// we can access protect variable because same package and different class
	}

}
