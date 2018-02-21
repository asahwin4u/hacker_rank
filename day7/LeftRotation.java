package com.capgemini.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {
	static int[] leftRotation(int[] a, int d) {
		List<Integer> list = Arrays.stream(a).boxed()
				.collect(Collectors.toList());
		Collections.rotate(list, a.length - d);
		
		//converts list of int elements to int array
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
