package com.capgemini.day9;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumSubArraySum {
	static long maximumSum(long[] a, long m) {
		Set<Long> set = new HashSet<Long>();
		int l = a.length;
		for (int i = 0; i < a.length; i++) {
			long sum = 0;
			for (int j = i; j < a.length; j++) {
				for (int k = 0; k < a.length - j; k++) {
					sum = sum + a[j];
				}
				set.add(sum % m);
			}
		}
		return Collections.max(set);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			long m = in.nextLong();
			long[] a = new long[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextLong();
			}
			long result = maximumSum(a, m);
			System.out.println(result);
		}
		in.close();
	}
}
