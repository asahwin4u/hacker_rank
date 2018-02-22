package com.capgemini.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigSorting {
	static String[] bigSorting(String[] arr) {

		List<String> list = Arrays.asList(arr);
		
		list.sort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				int l1 = o1.length();
				int l2 = o2.length();
				if(l1>l2)
				{
					return 1;
				} else if(l1<l2)
				{
					return -1;
				} else {
					for(int i=0;i<l1;i++)
					{
						if(o1.charAt(i) > o2.charAt(i))
						{
							return 1;
						} else if(o1.charAt(i) < o2.charAt(i))
						{
							return -1;
						}
					}
					return 0;
				}
			}
		});
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		String[] result = bigSorting(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
