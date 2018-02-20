package com.capgemini.day6;

import java.util.Scanner;

public class FunnyString {
	static String funnyString(String s) {
		StringBuilder rs = new StringBuilder(s);
		rs = rs.reverse();
		int l = s.length();
		for (int i = 1; i < l; i++) {
			if (!((Math.abs(s.charAt(i - 1) - s.charAt(i))) == (Math.abs(rs
					.charAt(i - 1) - rs.charAt(i))))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = funnyString(s);
			System.out.println(result);
		}
	}
}

/*
 * public class FunnyString { static String funnyString(String s) {
 * StringBuilder sb = new StringBuilder(s); StringBuilder rb = new
 * StringBuilder(sb.reverse().toString()); System.out.println(sb);
 * System.out.println(sb.reverse()); int l = sb.length(); for (int i = 1; i < l;
 * i++) { System.out.println("sb.charAt(i - 1) - sb.charAt(i) " + sb.charAt(i -
 * 1)+" "+ sb.charAt(i) + " " + (sb.charAt(i - 1) - sb.charAt(i)));
 * System.out.println("rb.charAt(i - 1) - rb.charAt(i) " + rb.charAt(i - 1)+" "+
 * rb.charAt(i) + " " + (rb.charAt(i - 1) - rb.charAt(i)));
 * System.out.println(); if (!((Math.abs(sb.charAt(i - 1) - sb.charAt(i))) ==
 * (Math.abs(rb .charAt(i - 1) - rb.charAt(i))))) { return "Not Funny"; } }
 * 
 * return "Funny"; }
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * int q = in.nextInt(); for (int a0 = 0; a0 < q; a0++) { String s = in.next();
 * String result = funnyString(s); System.out.println(result); } } }
 */
