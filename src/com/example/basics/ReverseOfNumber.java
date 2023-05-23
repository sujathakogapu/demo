package com.example.basics;
/*
21. Write a program to find the reverse of a given number.
    Input:
    Enter n: 1234
    Output:
    Reverse = 4321
*/
import java.util.Scanner;
public class ReverseOfNumber {
	int reverse = 0, reminder;
	public int getReverse(int num) {
		while(num>0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num=num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");//1234
		int num = scanner.nextInt();
		ReverseOfNumber obj=new ReverseOfNumber();
		int output=obj.getReverse(num);
		System.out.println("the reverse of a given number is:" + output);
		scanner.close();
	}
}
