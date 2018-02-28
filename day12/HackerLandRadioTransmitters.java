package com.capgemini.day12;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLandRadioTransmitters {
	static int hackerlandRadioTransmitters(int[] x, int k) {
		Arrays.parallelSort(x);
		int count = 0;
		int i = 0;
		// System.out.println(Arrays.toString(x));
		for (i = x[0] + k; i <= x[x.length - 1]; i = i + k) {
			// System.out.println("i = "+i);
			count++;
			i += k;
		}
		// System.out.println("i = "+i);
		if (i - k < x[x.length - 1]) {
			count++;
		} else if (x[0] == x[x.length - 1]) {
			return 1;
		}
		// if(i-(2*k) < x[x.length-1])
		/*
		 * if(i - x[x.length-1] == k) { count++; }
		 */
		return count;
	}

	/*
	 * 8 2 7 2 4 6 5 9 12 11 2 3 4 5 6 7 8 9 10 11 12 5 1 1 2 3 4 5
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextInt();
		}
		int result = hackerlandRadioTransmitters(x, k);
		System.out.println(result);
		in.close();
	}
}
