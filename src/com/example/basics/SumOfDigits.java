package com.example.basics;

import java.util.Scanner;

/*
16. Write a program to find the sum of digits of a given number.
    Input:
    Enter a number: 12345
    Output:
    The sum of digits of 12345 is: 15
*/
public class SumOfDigits {
	public int getDigitsSum(int number) {
		int sum=0;
		int digit=0;
		while(number>0) {//12345>0,
			digit=number%10;//5,4,3,2,1
			sum=sum+digit;//5+4+3+2+1->15
			number=number/10;//1234,123,12,1,0
		}
		return sum;
	}
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number:");//12345
	int number=scanner.nextInt();
	scanner.close();
	SumOfDigits obj=new SumOfDigits();
	int output=obj.getDigitsSum(number);
	System.out.print("The sum of digits of:"+output);
}
}
