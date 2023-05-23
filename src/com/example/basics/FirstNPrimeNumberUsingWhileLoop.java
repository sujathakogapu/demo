package com.example.basics;

import java.util.Scanner;

/*
14. Write a program to print the first n prime numbers
    Input:
    Enter the value of n: 7
    Output:
    2 3 5 7 11 13 17
*/
public class FirstNPrimeNumberUsingWhileLoop {
	public int[] getFirstNPrimeNumbers(int num) {
		int[] arr = new int[num];
		int primeCount = 0;
		int currentNumber = 2;
		//step1: create a while loop to get n prime numbers
		while (primeCount  < num) {//7<7
			//step2: check whether the cureentNumber is prime number or not?
			boolean isPrimeNumber = true;
			for (int i = 2; i < currentNumber; i++) {//currentNumber -> (2,currentNumber) -> not a primeNumber
				if(currentNumber % i ==0) {
					isPrimeNumber = false;
					break;
				}
			}
			//step3: if prime number save the value in array and increment the prime count
			if(isPrimeNumber) {
				arr[primeCount]=currentNumber;
				primeCount++;
			}
			//step4: increment the current number
			currentNumber++;
		
		}
		//Step5: return the array
		return arr;
	}

	public static void main(String args[]) {
		//step6: take the input from the user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int num = scanner.nextInt();
		//step7: create the object and call the method to get first n prime numbers
		FirstNPrimeNumberUsingWhileLoop obj=new FirstNPrimeNumberUsingWhileLoop();
		int[] output = obj.getFirstNPrimeNumbers(num);
		//step8: print the array output 
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+" ");
		}
		scanner.close();
}
}
