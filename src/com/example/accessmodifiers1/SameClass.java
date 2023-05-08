package com.example.accessmodifiers1;

public class SameClass {
	// Program on testing access modifiers
	// public, private,default,protected
	public int publicVar;// public variable
	private int privateVar;// private variable
	int defaultVar;// default variable
	protected int protectedVar;// protected variable

	public static void main(String[] args) {
		SameClass obj = new SameClass();
		obj.publicVar = 10;// we can access public variable because public is visible in every where
		obj.privateVar = 20;// we can access private variables because same package and same class
		obj.defaultVar = 30;// we can access default variable because same package and same class
		obj.protectedVar = 40;// we can access protect variable because same package and same class
	}
}
