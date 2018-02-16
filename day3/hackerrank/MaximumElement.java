package com.capgemini.day3.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), t;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			t = scanner.nextInt();
			switch (t) {
			case 1:
				list.add(scanner.nextInt());
				break;
			case 2:
				list.remove(list.size() - 1);
				break;
			case 3:
				System.out.println(Collections.max(list));
				break;
			}
		}
	}
}

/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); int n = scanner.nextInt(); List<Integer> list = new
 * ArrayList<Integer>(); for (int i = 0; i < n; i++) { switch
 * (scanner.nextInt()) { case 1: list.add(scanner.nextInt()); break; case 2: if
 * (!list.isEmpty()) list.remove(list.size() - 1); break; case 3:
 * System.out.println(Collections.max(list)); break; } } }
 */