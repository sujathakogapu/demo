package com.example.wrapperclasses;

public class WrapperClassExamples {
	public static void main(String[] args) {
		// create an Integer object
		Integer number = new Integer(100);
		System.out.println("Integer number: "+number);
		// convert a String to an Integer object
		String string = "500";
		Integer number2 = Integer.valueOf(string);
		System.out.println( "Integer to string: "+number2);
		// Autoboxing:convert int to Integer object
		int salary = 10000;
		Integer number3 = salary;
		System.out.println("Autoboxing: "+number3);
		// Unboxing:convert Integer object to int
		int number4 = number3;
		System.out.println("unboxing: "+number4);

		// create a Float object
		Float number5 = new Float(3.4);
		System.out.println("Float object: "+number5);
		// convert a String to a Float object
		String string2 = "75.5";
		Float number6 = Float.valueOf(string2);
		System.out.println("Float to string: "+number6);
		// Autoboxing:convert float to Float object
		float salary2 = 10000;
		Float number7 = salary2;
		System.out.println("Autoboxing: "+number7);
		// unboxing:convert Float object to float
		float number8 = number7;
		System.out.println("unboxing: "+number8);

		// create a Double object
		Double number9 = new Double(120.34);
		System.out.println("Double Object: "+number8);
		// convert a String to Double object
		String strin3 = "123.456";
		Double number10 = Double.valueOf(strin3);
		System.out.println("Double to string: "+number10);
		// Autoboxing:convert double to Double object
		double salary3 = 5000.456;
		Double number11 = salary3;
		System.out.println("Autoboxing: "+number11);
		// unboxing:convert Double object to double
		double number12 = number11;
		System.out.println("unboxing: "+number12);

		// create a Character object
		Character char1 = new Character('a');
		System.out.println("Character object: "+char1);
		// convert a String to a Character object
		String string4 = "Teekshi";
		Character char2 = string4.charAt(5);
		System.out.println("char to string: "+char2);
		// Autoboxing:convert to char to Character object
		char char3 = 's';
		Character char4 = char3;
		System.out.println("Auto boxing:"+char4);
		// Unboxing:convert a Character object to char
		char char5 = char4;
		System.out.println("unboxing: "+char5);

		// create a Boolean object
		Boolean isStudent = new Boolean(true);
		System.out.println(isStudent);
		// convert a String to Boolean object
		String string5 = "true";
		Boolean isStudent2 = Boolean.valueOf(string5);
		System.out.println(string5);
		// Autoboxing:convert to boolean to Boolean object
		boolean isStudent3 = false;
		Boolean isStudent4 = isStudent3;
		System.out.println(isStudent4);
		// unboxing:convert a Boolean object to boolean
		boolean isStudent5 = isStudent4;
		System.out.println(isStudent5);

		// create a Byte object
		byte byteVar= 20;
		Byte byteobj = new Byte(byteVar);
		System.out.println("Byte object: "+byteobj);
		// convert a String to Byte object
		String string6 = "12";
		Byte str = Byte.valueOf(string6);
		System.out.println(str);
		// Autoboxing:convert byte to Byte object
		byte num = 12;
		Byte num2 = byteVar;
		System.out.println(num2);
		// unboxing:convert to Byte object to byte
		byte num3 = num2;
		System.out.println(num3);

		// create a Long object
		Long num4 = new Long(12345);
		System.out.println(num4);
		// convert a String to Long object
		String string7 = "world";
		Long num5 = Long.getLong(string7, num4);
		System.out.println(num5);
		// Autoboxing:convert long to Long object
		long num6 = 1234567;
		Long num7 = num6;
		System.out.println(num7);
		// unboxing:convert a Long object to long
		long num8 = num7;
		System.out.println(num8);

		// create a Short object
		short shortVar = 20;
		Short abc = new Short(shortVar);
		System.out.println(abc);
		// convert a String to Short object
		String string8 = "12345";
		Long klm = Long.valueOf(string8);
		System.out.println(klm);
		// Autoboxing:convert a short to Short object
		short pqr = 12;
		Short xyz = pqr;
		System.out.println(xyz);
		// unboxing:convert a Short object to short
		short ijk = xyz;
		System.out.println(ijk);

	}
}
