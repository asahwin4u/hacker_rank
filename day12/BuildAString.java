package com.capgemini.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BuildAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			StringBuilder s = new StringBuilder(sc.next());
			StringBuilder res = new StringBuilder();
			List<Integer> tot = new ArrayList<Integer>();
			Map<StringBuilder, Integer> m = new HashMap<StringBuilder, Integer>();
			for (int j = 0; j < l; j++) {
				char c = s.charAt(i);
				res.append(s.charAt(j) + "");
				if (res.length() > 1) {
					m.put(new StringBuilder(res), 5);
				}
			}
			System.out.println(m);
		}
	}
}
