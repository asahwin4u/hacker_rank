package com.capgemini.day10_11;

import java.util.Scanner;

public class PowerSum {
	static int powerSum(int X, int N, int i) {
		int count = 0;
		X = X - (int) Math.pow(i, N);
		System.out.println(X);
		if (X == 0)
			return 1;
		if (X > 0) {
			int sum = 0;
			for (int j = i + 1; Math.pow(j, N) <= X; j++)
				sum = sum + powerSum(X, N, j);
			return sum;
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int N = in.nextInt();
		int result = powerSum(X, N, 0);
		System.out.println(result);
		in.close();
	}
}
