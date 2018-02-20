package com.capgemini.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
	public static void main(String[] args) {
		/*
		 * peek :
		 * 
		 * Stream<T> peek(Consumer<? super T> action)\
		 * 
		 * Returns a stream consisting of the elements of this stream,
		 * additionally performing the provided action on each element as
		 * elements are consumed from the resulting stream.
		 * 
		 * This method exists mainly to support debugging, where you want to see
		 * the elements as they flow past a certain point in a pipeline:
		 */

		Set set = Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Filtered value: " + e))
				.filter(e -> e.equalsIgnoreCase("four"))
				.peek(e -> System.out.println("your string = " + e))
				.collect(Collectors.toSet());
		
		System.out.println(set);

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.map(String::toUpperCase).forEach(System.out::println);

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(5);
		System.out.println(list);

		list.stream().filter(e -> e > 4).peek(e -> System.out.println(e))
				.collect(Collectors.toList());

		list.stream().filter(e -> e > 1).forEach(System.out::println);
		
		List l1 =  Stream.iterate(1, n -> n + 1).limit(26).collect(Collectors.toList());
		System.out.println(l1);
		

	}
}
