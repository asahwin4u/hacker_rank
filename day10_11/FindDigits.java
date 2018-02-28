package com.capgemini.day10_11;

import java.util.Scanner;

public class FindDigits {
	static int findDigits(int n) {
		int num = n;
		int count = 0;
		while (n > 0) {
			int d = n % 10;
			if(d == 0)
			{
				n = n / 10;
				continue;
			}
			if ((num % d) == 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = findDigits(n);
			System.out.println(result);
		}
		in.close();
	}
}
