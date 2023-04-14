package com.example.basics;

public class Operator {
	public static void main(String[] args) {
		// Arithmetic operators
		int x = 10;
		int y = 20;
		int addition = x + y;
		int subtraction = x - y;
		int multiplication = x * y;
		int division = x / y;
		int modulus = x % y;
		System.out.println("addition:" + addition);
		System.out.println("subtraction:" + subtraction);
		System.out.println("multiplication:" + multiplication);
		System.out.println("division:" + division);
		System.out.println("modulus:" + modulus);
		// Assignment operators
		String name = "sujatha";// equals to
		System.out.println(name);
		int p = 0;
		p += 10;// plus equal to p=p+10=0+10=10
		System.out.println("plus equal to:" + p);
		p -= 10;// minus equal to p=p-10=10-10=-10;
		System.out.println("minus equal to:" + p);
		p *= 10;// multiplication equal to p=p*p=0*10=0;
		System.out.println("multiplication equal to:" + p);
		p /= 10;// division equal to p=p/p=0/10=0
		System.out.println("division equal to:" + p);
		// Comparison or relational operators
		int a = 2;
		int b = 5;
		boolean equalTo = (a == b);// false
		boolean notEqualTo = (a != b);// true
		boolean greaterThan = (a > b);// false
		boolean lessthan = (a < b);// true
		boolean greaterThanEqualTo = (a >= b);// false
		boolean lessThanEqualTo = (a <= b);// true
		System.out.println("eual to:" + equalTo);
		System.out.println("not Equal to:" + notEqualTo);
		System.out.println("greaterThan:" + greaterThan);
		System.out.println("lessThan:" + lessthan);
		System.out.println("greaterThanEqualTo:" + greaterThanEqualTo);
		System.out.println("lessThanEqualTo:" + lessThanEqualTo);
		// logical operators
		boolean logicalAnd = (a < b) && (b > 4);// true && true=true
		boolean logicalOr = (a > b) || (b == 5);// false || true=true
		boolean logicalNot = !(a == b);// !false=true
		boolean logicalAnd1 = (a > b) && (b < 8);// false && true=false
		boolean logicalOr1 = (a > b) || (b == 9);// false || false=false
		boolean logicalNot1 = !(a <= b);// true= false
		System.out.println("logicalAnd:" + logicalAnd);
		System.out.println("logicalor:" + logicalOr);
		System.out.println("logicalnot:" + logicalNot);
		System.out.println("logicalAnd1:" + logicalAnd1);
		System.out.println("logicalor1:" + logicalOr1);
		System.out.println("logicalnot1:" + logicalNot1);

	}

}
