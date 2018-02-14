package com.capgemini.string.day2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ArraysDemo {

	public static void main(String[] args) {
		// sort
		int[] arr = { 3, 4, 3, 9, 2, 33, 92, 6, 2 };
		Arrays.sort(arr, 3, 6);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// parallel sort
		int[] arr1 = { 3, 4, 3, 9, 2, 33, 92, 6, 2 };
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		Arrays.stream(arr1).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// parallel sort comparat, object sorting
		User user[] = User.getUsers();
		Arrays.parallelSort(user);
		Consumer<User> printUser = usr -> System.out.print(usr + "\n");
		Arrays.stream(user).forEach(printUser);
		
		// parallel preffix
		int[] arr2 = { 3, 4, 3, 9, 2, 6, 2 };
		Arrays.parallelPrefix(arr2, 2, 7, (a , b) -> (a + b));
		System.out.println(Arrays.toString(arr2));
		Arrays.stream(arr2).forEach(n -> System.out.print(n + " "));
		//(arr2).forEach(n -> System.out.println(n + " "));
		
		// binary search
		System.out.println();
		int[] arr3 = {3, 4, 3, 9, 2, 6, 2, 9 };
		int index = Arrays.binarySearch(arr3, 9);
		System.out.println(index);
		System.out.println(Arrays.binarySearch(arr3, 0, 3, 9));
		
	}

}

class User implements Comparable<User> {
	private String name;
	private int age;

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

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static User[] getUsers() {
		User[] users = new User[6];
		users[0] = new User("Ram", 25);
		users[1] = new User("Shyam", 22);
		users[2] = new User("Mohan", 21);
		users[3] = new User("Suresh", 30);
		users[4] = new User("Ramesh", 20);
		users[5] = new User("Dinesh", 27);
		return users;
	}

	@Override
	public int compareTo(User o) {
		// return name.compareTo(o.name); // need to check if we can sort with b
		return age - o.age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
