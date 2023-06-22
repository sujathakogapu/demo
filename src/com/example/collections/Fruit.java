package com.example.collections;

import java.util.HashMap;

public class Fruit {
	private String name;
	private String colour;
	private String taste;

	public Fruit(String name, String colour, String taste) {
		this.name = name;
		this.colour = colour;
		this.taste = taste;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Fruit fruit = (Fruit) obj;
		if (this.name.equals(fruit.name) && this.colour.equals(fruit.colour) && this.taste.equals(fruit.taste)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		int result=this.name.hashCode();
		result=result+this.colour.hashCode();
		result=result+result+this.taste.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", colour=" + colour + ", taste=" + taste + "]";
	}

	public static void main(String[] args) {
		HashMap<Fruit,Integer>fruitStock=new HashMap<>();//custom class as key and wrapper class as value
		Fruit mango = new Fruit("mango","yellow","Sweet");
		fruitStock.put(mango,100);
		Fruit apple=new Fruit("apple","red","Sweet");
		fruitStock.put(apple, 200);
		for(Fruit fruit:fruitStock.keySet()) {
			System.out.println(fruit);
			System.out.println(fruitStock.get(fruit));

		}
		HashMap<Integer,Fruit>fruitStock1=new HashMap<>();//wrapper class as key and custom class as value
		fruitStock1.put(100, apple);
		fruitStock1.put(200, mango);
	}

}

