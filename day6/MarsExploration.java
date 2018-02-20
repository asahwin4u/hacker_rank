package com.capgemini.day6;

import java.util.Scanner;

public class MarsExploration {
	static int marsExploration(String s) {
		int l = s.length();
		StringBuilder sb = new StringBuilder(s);
		int count = 0;
		if (l % 3 == 0) {
			for (int i = 0; i < l; i = i + 3) {
				if (!(sb.charAt(i) == 'S')) {
					count++;
				}
				if (!(sb.charAt(i + 1) == 'O')) {
					count++;
				}
				if (!(sb.charAt(i + 2) == 'S')) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int result = marsExploration(s);
		System.out.println(result);
		in.close();
	}
}
