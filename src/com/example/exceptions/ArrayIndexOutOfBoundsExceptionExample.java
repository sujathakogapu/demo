package com.example.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			try {
			System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe.getMessage());
		}
		
	}
		System.out.println("Rest of the program");

}
}
