package com.capgemini.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class InstreamDemo {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int sumInt = IntStream.of(new int[] { 10, 20, 30, 40, 50 }).sum();
		System.out.println("sumInt = " + sumInt);

		double[] b = { 1.20, 20.76, 30.7, 4.1, 0.5 };
		double sumDouble = DoubleStream.of(b).sum();
		System.out.println("sumDouble = " + sumDouble);

		long c[] = { 10, 20, 30, 40, 50 };
		long sumLong = LongStream.of(c).sum();
		System.out.println("sumLong = " + sumLong);

		// allMatch && anyMatch
		IntStream i = IntStream.concat(IntStream.of(6, 5, 7, 1, 2, 3, 3),
				IntStream.of(9, 8));
		boolean d = i.allMatch(n -> n < 8);
		System.out.println(d);

		int[] e = { 10, 20, 30, 40, 50 };
		List alist = Arrays.asList(e);
		List<Integer> list = new ArrayList<>();
		
		//boxed method , convert int[] array to Integer list
		list = Arrays.stream(e).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		//anyMatch
		System.out.println(list.stream().anyMatch(n -> n > 10)); //return true
		System.out.println(list.stream().allMatch(n -> n > 10)); //return false
		
		System.out.println(list.stream().count()); //count()
		System.out.println(list.stream().collect(Collectors.toList())); //collect
		
		//converting Integer list to int[] using streams
		int[] f = list.stream().mapToInt(j->j).toArray();
		System.out.println(IntStream.of(f).sum());

		

	}
}
