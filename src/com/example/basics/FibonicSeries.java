package com.example.basics;

import java.util.Scanner;

/*
12. Write a program to print the Fibonacci series up to n terms.
    Input:
    Enter the number of terms: 7
    Output:
    0 1 1 2 3 5 8
 */
public class FibonicSeries {// recursion
	public int[] getFibonic(int num) {
		//step1: create array object
		int[] arr=new int[num];//7 -> 0,1,2,3,4,5,6
		int n1 = 0, n2 = 1, n3;
		//step2: assign the first two fibonacci values to array
		arr[0]=0;//0
		arr[1]=1;//1
		//step3: calculate remaining fibonacci values till given number
		for (int i = 2; i < num; i++) {// 2,3,4,5,6
			n3 = n1 + n2;// n3=0+1=1,1+1=2,1+2,2+3,3+5,5+8
			//step4: assign fibonacci values to the array
			arr[i]=n3;//2,3,4,5,6
			n1 = n2;// n1=1,1,2,3,5,8
			n2 = n3;// n2=1,2,3,5,8,13
		}
		//step5: return the array
		return arr;
	}
	public static void main(String[] args) {
		//step6: get the input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of terms:");// 7
		int num = scanner.nextInt();
		//step7: create object, call the method and get output array
		FibonicSeries obj=new FibonicSeries();
		int[] output=obj.getFibonic(num);//output -> output[i]
		//step8: print the output array
		System.out.println("Output: ");
		for (int i = 0; i < num; i++) {
			System.out.print(output[i]+" ");
		}
		scanner.close();
	}
}
