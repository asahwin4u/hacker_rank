package com.capgemini.day4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add("VA");
		ts.add("AT");
		ts.add("BV");
		ts.add("EQ");
		ts.add("VF");
		ts.add("YD");

		System.out.println(ts.ceiling("C")); // this will work for numbers mostly
		/*TreeSet<Person> personSet = new TreeSet<Person>();
		//personSet.add(new Person("Yeshwant", 29, 98984008l));
		personSet.add(new Person("Srikhant", 30, 8984008l));
		personSet.add(new Person("Ashwin", 27, 3984008l));*/
		
		//Comparator comparator = personSet.comparator(); //getting comparator

		System.out.println(ts);
		//descendingIterator
		Iterator it = ts.descendingIterator();
		it.forEachRemaining(System.out::println);
		System.out.println();
		//descendingSet
		Set set = ts.descendingSet();
		System.out.println(set);
		//floor
		System.out.println(ts.floor("VE"));
		//headset
		System.out.println(ts.headSet("VE"));
		System.out.println(ts.headSet("VE", false));
		
		//spliterator
		System.out.println("==========================");
		System.out.println(ts);
		Spliterator st = ts.spliterator();
		//st.forEachRemaining(System.out::println);
		Spliterator st1 = st.trySplit();
		System.out.println("-------");
		st.forEachRemaining(System.out::println);
		System.out.println("-------");
		st1.forEachRemaining(System.out::println);
		
		//poll
		System.out.println("---------POLL---------");
		System.out.println(ts);
		System.out.println("poll first = "+ts.pollFirst());
		System.out.println("poll last = "+ts.pollLast());
	}
}
