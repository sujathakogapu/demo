package com.example.basics;

import java.util.Scanner;

public class SumOfNaturalNo {
	public int getNaturalNumbersSum(int num) {
		int sum=0;
		int i = 1;
		while (i <= num) {
			// for (int i = 1; i <= num; i++) {//
			// i=1;1<=5;1++,2<=5;2++,3<=5;3++;4<=5,4++;5<=5,5++,6<=5
			sum = sum + i;
			i++;// 0+1=1,1+2=3,3+3=6,6+4=10,10+5=15
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();// num=5
		SumOfNaturalNo obj=new SumOfNaturalNo();
		int output=obj.getNaturalNumbersSum(num);
		System.out.println("The sum of natural no:" + output);
		scanner.close();

	}

}
