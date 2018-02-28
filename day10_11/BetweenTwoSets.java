package com.capgemini.day10_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BetweenTwoSets {
	static int getTotalX(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		int l = a.length;
		Set<Integer> s = new HashSet<Integer>();
		for (int i = a[a.length-1]; i <= b[0]; i++) {
			int c = 0;
			for (int j = 0; j < b.length; j++) {
				if((b[j] % i) == 0)
				{
					c++;
				}
			}
			if(c == b.length)
			{
				s.add(i);
			}
		}
		for(Integer i : s)
		{
			int c = 0;
			for(int j : a)
			{
				if(i % j == 0)
					c++;
			}
			if(c==a.length)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
