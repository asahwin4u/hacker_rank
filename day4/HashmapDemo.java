package com.capgemini.day4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		
		System.out.println(hm);
		
		//hm.computeIfAbsent("Zara", mappingFunction)
		
		Set smap = hm.keySet();
		smap.spliterator().forEachRemaining(System.out::println);
		//smap.
		
		
	}
}
/*TreeMap<String, Double> tm = new TreeMap<String, Double>();

tm.put("Zara", new Double(3434.34));
tm.put("Mahnaz", new Double(123.22));
tm.put("Ayan", new Double(1378.00));
tm.put("Daisy", new Double(99.22));
tm.put("Qadir", new Double(-19.08));

System.out.println(tm);*/