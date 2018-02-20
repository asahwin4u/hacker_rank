package com.capgemini.day5;

import java.util.Arrays;
import java.util.List;

public class Streamdemo2 {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Sachin", 30),
				new Person("Nilesh", 20), new Person("Pankaj", 40));

		Person result1 = persons
				.stream()
				.filter((p) -> "Nilesh".equals(p.getName()) && 20 == p.getAge())
				.findAny().orElse(null);

		System.out.println("result 1 :" + result1);

		// or like this
		Person result2 = persons.stream().filter(p -> {
			if ("Nilesh".equals(p.getName()) && 20 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("result 2 :" + result2);

	}
}

class Person
{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
