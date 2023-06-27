package com.example.keywords;

public class KeyWordDemo {
	public static void main(String[] args) {//it is call by jvm(jvm call with class name)
		StaticExample obj=new StaticExample();
		System.out.println(obj.name);//here name variable non static so we called with object
		StaticExample.run();//here run method is static so we called with class name
		//so static variable or methods not at  an object level but it is at class level
		//so non static variable or methods at an object level but it is not at class level
		//FinalExample obj2=new FinalExample();
		//FinalExample.name="Sujatha";
		System.out.println(Constants.NAME);
		System.out.println(Math.PI);

	}

}
