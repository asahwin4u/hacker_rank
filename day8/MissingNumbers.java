package com.capgemini.day8;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {
	static int[] missingNumbers(int[] arr, int[] brr) {

		Map<Integer, Integer> arrMap = duplicateHashmap(arr);
		Map<Integer, Integer> brrMap = duplicateHashmap(brr);

		int sizeArr = arrMap.size();
		int sizeBrr = brrMap.size();

		List<Integer> list = new ArrayList<Integer>();

		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> bSet = brrMap.keySet();
		Iterator<Integer> itr = bSet.iterator();

		while (itr.hasNext()) {
			int n = itr.next();
			if (!brrMap.containsKey(n)) {
				set.add(n);
			} else {
				if (brrMap.get(n) > arrMap.get(n)) {
					set.add(n);
				}
			}
		}

		return set.stream().mapToInt(i -> i).toArray();
	}

	public static Map<Integer, Integer> duplicateHashmap(int[] arr) {
		Map<Integer, Integer> arrMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arrMap.containsKey(arr[i])) {
				int value = arrMap.get(arr[i]);
				value++;
				arrMap.put(arr[i], value);
			} else {
				arrMap.put(arr[i], 1);
			}
		}
		return arrMap;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] brr = new int[m];
		for (int brr_i = 0; brr_i < m; brr_i++) {
			brr[brr_i] = in.nextInt();
		}
		int[] result = missingNumbers(arr, brr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
