package com.capgemini.day7;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayManipulation {
	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int n = in.nextInt(); int m =
		 * in.nextInt();
		 * 
		 * 
		 * List<Integer> list = Stream.iterate(0, k -> 0).limit(n+1)
		 * .collect(Collectors.toList()); //System.out.println(list.size()); for
		 * (int a0 = 0; a0 < m; a0++) { int a = in.nextInt(); int b =
		 * in.nextInt(); int k = in.nextInt(); list.set(a, list.get(a) + k); if
		 * ((b+1) <= n) list.set(b+1, list.get(b+1) - k);
		 * 
		 * for(int j=a;j<=b;j++) { list.set(j-1, list.get(j-1) + k); }
		 * 
		 * System.out.println(list); }
		 * System.out.println(Collections.max(list)); in.close();
		 */

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		// This will be the "difference array". The entry arr[i]=k indicates
		// that arr[i] is exactly k units larger than arr[i-1]
		long[] arr = new long[n];

		int lower;
		int upper;
		long sum;

		for (int i = 0; i < n; i++)
			arr[i] = 0;

		for (int i = 0; i < m; i++) {
			lower = scan.nextInt();
			upper = scan.nextInt();
			sum = scan.nextInt();
			arr[lower - 1] += sum;
			if (upper < n)
				arr[upper] -= sum;
			System.out.println(Arrays.toString(arr));
		}

		long max = 0;
		long temp = 0;

		for (int i = 0; i < n; i++) {
			temp += arr[i];
			if (temp > max)
				max = temp;
		}

		System.out.println(max);
	}
}
