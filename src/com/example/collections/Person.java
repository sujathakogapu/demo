package com.example.collections;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Person person = (Person) obj;
		if (this.age == person.age && this.name.equals(person.name))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		int result = this.name.hashCode();
		result = result + age;
		return result;
	}

	@Override
	public int compareTo(Person obj) {
		if (this.age < obj.age) {
			return -1;
		} else if (this.age > obj.age) {
			return 1;

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Person person1 = new Person("sujatha", 26);
		Person person2 = new Person("Padmavathi", 30);
		int compare=person1.compareTo(person2);
		if(compare==1) {
			System.out.println(person1.name + " is older than "+ person2.name);
		}else if(compare==-1){
			System.out.println(person1.name + " is younger than "+ person2.name);
		}
		else {
			System.out.println(person1.name + " and  "+ person2.name+ " have the same age");
		}
	}

}
