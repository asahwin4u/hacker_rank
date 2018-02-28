package com.capgemini.day10_11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HowManySubString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		for (int a0 = 0; a0 < q; a0++) {
			int left = in.nextInt();
			int right = in.nextInt();
			if (((right + 1) - left) <= 1) {
				System.out.println(1);

			} else {
				Set<String> set = new HashSet<String>();
				String t = "";
				if (right == (n - 1)) {
					t = s.substring(left);
				} else {
					t = s.substring(left, right + 1);
				}
				int length = t.length();
				for (int c = 0; c < length; c++) {
					for (int i = 1; i <= length - c; i++) {
						set.add(t.substring(c, c + i));
					}
				}
				System.out.println(set.size());
				set.clear();
			}
		}
	}
}
