package com.capgemini.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);

		/* Without Streams: */
		List<Integer> l1 = new ArrayList<Integer>();
		for (Integer i : l) {
			if (i % 2 == 0) {
				l1.add(i);
			}
		}
		System.out.println(l1);
		/*
		 * With Stream -----------
		 */
		List<Integer> l2 = l.stream().filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(l2);

		/*
		 * Double the size without using stream(Map)
		 * -----------------------------------------
		 */
		List<Integer> l3 = new ArrayList<>();
		System.out.println(l3);
		for (Integer I1 : l) {
			System.out.println(I1 * 2);
			l1.add(I1 * 2);
		}
		System.out.println(l1);
		System.out.println(l1.size());

		/*
		 * Double the size using stream(Map) ---------------------------------
		 */
		l1 = l.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l1.size());
	}
}
