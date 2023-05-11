package com.example.wrapperclasses;

import java.util.Scanner;

public class BooleanWrapperClassMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a first number: ");
			int num1 = scanner.nextInt();
			System.out.println("Enter a second number: ");
			int num2 = scanner.nextInt();
			Boolean number1 = new Boolean(true);
			Boolean number2 = new Boolean(false);
			System.out.println("compareTo method: "+number1.compareTo(number2));
			System.out.println("Equals method: "+number1.equals(number2));
			System.out.println(" boolean toString method: "+Boolean.toString(false));
	        System.out.println("boolean getBoolean method: "+Boolean.getBoolean(null));
	       System.out.println(" boolean valueOf method: "+Boolean.valueOf(true));
	       System.out.println(" boolean parseBoolean method: "+Boolean.parseBoolean(null));
	       System.out.println("hash code method: "+Boolean.hashCode(false));
	       System.out.println("logical OR method: "+Boolean.logicalOr(true, true));
	       System.out.println("logical AND: "+Boolean.logicalAnd(false, true));
	       System.out.println("boolean false :"+Boolean.FALSE);
	       System.out.println("boolean type: "+Boolean.TYPE);
	       System.out.println("boolean true: "+Boolean.TRUE);
	}

}
