package com.capgemini.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumber {
	static int[] closestNumbers(int[] arr) {
		List<Integer> l = new ArrayList<Integer>();
		int m = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int j = 0; j < arr.length - 1; j++) {
			int temp = Math.abs(arr[j] - arr[j + 1]);
			if (m > temp && temp > 0) {
				m = temp;
				l.clear();
				l.add(arr[j]);
				l.add(arr[j + 1]);
			} else if (temp == m) {
				l.add(arr[j]);
				l.add(arr[j + 1]);
			}
		}
		Collections.sort(l);
		return l.stream().mapToInt(j -> j).toArray();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = closestNumbers(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}

/**
 * static int[] closestNumbers(int[] arr) { List<Integer> l = new
 * ArrayList<Integer>(); long m = 100000000; Arrays.sort(arr); for (int i = 0; i
 * < arr.length; i++) { for (int j = 0; j < arr.length; j++) { if (i == j)
 * continue; else { if (m > (arr[i] - arr[j]) && (arr[i] - arr[j]) > 0) { m =
 * (arr[i] - arr[j]); l.clear(); l.add(arr[i]); l.add(arr[j]); } else if
 * ((arr[i] - arr[j]) == m) { l.add(arr[i]); l.add(arr[j]); } } } }
 * Collections.sort(l); return l.stream().mapToInt(j -> j).toArray(); }
 */
