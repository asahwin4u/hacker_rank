package com.capgemini.day6;

import java.util.Scanner;

public class HackerRankInAString {
	static String hackerrankInString(String s) {
		StringBuilder str = new StringBuilder(s);
		String h = "hackerrank";
		int hIndex = 0;
		int l = s.length();
		String result = "";
		for (int i = 0; i < l; i++) {
			if (h.charAt(hIndex) == str.charAt(i)) {
				result = result + str.charAt(i);
				hIndex++;
			}
			if (h.equals(result)) {
				return "YES";
			}
		}
		return "NO";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
		in.close();
	}
}
