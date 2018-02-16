package com.capgemini.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		Collection c = new ArrayList(); // creates an empty list
		List list = new ArrayList(c); // creates an arraylist and adds the
										// element from passed collection object
		List list1 = new ArrayList(90); // creates an arraylist with capacity 90

		c.add("Capgemin");
		c.add("Pvt");
		c.add("Ltd");
		System.out.println(c);
		list.addAll(c); // adds all the element collection c object
		System.out.println(list);
		list.clear(); // removes all the elements from the list
		System.out.println(list);
		list.addAll(c);
		ArrayList aList = (ArrayList) list;
		list1 = (List) aList.clone();
		System.out.println(list1);

		// removeIf
		List<String> strList = new ArrayList<String>();
		strList.add("Capgemin");
		strList.add("Pvt");
		strList.add("Ltd");
		strList.removeIf(s -> s.equals("Pvt"));
		System.out.println(strList);

		// sort
		strList = new ArrayList<String>();
		strList.add("Capgemin");
		strList.add("Pvt");
		strList.add("Ltd");
		strList.add("India");
		// Collections.sort(strList); Sorted using Collections method
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Yeshwant", 29, 98984008l));
		personList.add(new Person("Srikhant", 30, 8984008l));
		personList.add(new Person("Ashwin", 27, 3984008l));
		System.out.println(personList);
		personList.sort(Person.personComparator);
		System.out.println(personList);

		// splitIterator
		Spliterator<String> s1 = strList.spliterator();
		/*
		 * s1.forEachRemaining(System.out::println);
		 * System.out.println(s1.characteristics());
		 */
		Spliterator<String> s2 = s1.trySplit();
		s1.forEachRemaining(System.out::println);
		System.out.println("----------------");
		s2.forEachRemaining(System.out::println);
		System.out.println("------------");
		strList = new ArrayList<String>();
		strList.add("Capgemin");
		strList.add("Pvt");
		strList.add("Ltd");
		strList.add("India");
		Spliterator<String> s3 = strList.spliterator();
		s3.tryAdvance(System.out::println); // it removes the element at index
											// at 1 and return
		System.out.println(s3.estimateSize()); // it return the size of the
												// collection
		System.out.println(s3.getExactSizeIfKnown());// it returns the exat size
														// of the collection
		s3.tryAdvance(System.out::println);
		
		//sublist
		strList = new ArrayList<String>();
		strList.add("Capgemin");
		strList.add("Pvt");
		strList.add("Ltd");
		strList.add("India");
		
		List<String> strList1 = strList.subList(0, 2);
		System.out.println(strList1);
	}
}

class Person {
	String name;
	int age;
	long phone;

	public Person(String name, int age, long phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static Comparator<Person> personComparator = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.name.compareTo(o2.name);
		}
	};

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone
				+ "]";
	}

}