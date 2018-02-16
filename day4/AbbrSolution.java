package com.capgemini.day4;

import java.util.Scanner;

public class AbbrSolution {
	static String abbreviation(String a, String b) {
		a = a.toUpperCase();
		System.out.print("a = "+a+" "+"b = "+b + " --> ");
		/*
		 * if (a.equals(b)) { return "NO"; } else
		 */ if (a.contains(b)) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String a = in.next();
			String b = in.next();
			String result = abbreviation(a, b);
			System.out.println(result);
		}
		in.close();
	}
}
