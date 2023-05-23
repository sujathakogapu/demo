package com.example.basics;

import java.util.Scanner;
/*
23. Write a program to check if a given number is a strong number or not.
    A Strong number is a number, where the sum of the factorial of the
    digits is equal to the number itself. 1, 2, 145, and 40585 are some
    examples of Strong numbers.
    For instance, 145 is a Strong number
    145 = 1!+4!+5! =1+24+120 =145
    Since the sum of the factorial of all digits is equal to the number
    itself, hence it is a Strong number.
    Input1:
    Enter n: 145
    Output1:
    145 is a strong number.
    Input2:
    Enter n: 140
    Output2:
    140 is not a strong number.
 */
public class StrongNumber {
	public boolean isStrongNumber(int num1) {
		int num2 = 0, lastdigit, sumOfFact = 0, fact = 1;
		boolean isStrongNumber=false;
		num2=num1;//num2=145
		while (num2 > 0) {//145>0->true
			lastdigit = num2 % 10;//145%10=5,
			for (int i = 1; i <= lastdigit; i++) {//1,2,3,4,5
				fact = fact * i;//first iteration:1*1,1*2,2*3,6*4,24*5-
			}
			sumOfFact = sumOfFact + fact;
			num2 = num2 / 10;
		}
		if (num1 == sumOfFact) {
			isStrongNumber=true;
		}
		return isStrongNumber;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//145
		int num1 = scanner.nextInt();
		StrongNumber obj=new StrongNumber();
		boolean output=obj.isStrongNumber(num1);
		System.out.println(num1+" is a strong number? "+output);
		scanner.close();

	}
}
//