package com.capgemini.day6;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String str) {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				str = str.substring(0, i - 1) + str.substring(i + 1);
				i = 0;
			}
		}

		if (str.length() == 0)
			str = "Empty String";

		return str;
	}

	/*
	 * static String super_reduced_string(String s) { int l = s.length(); String
	 * result = ""; for (int i = 0; i < l-1; i++) { char fChar = s.charAt(i);
	 * char sChar = s.charAt(i + 1); System.out.println("fchar = "+fChar+" "+
	 * "sChar = "+sChar); System.out.println("fChar == sChar "+(fChar ==
	 * sChar)); if (fChar == sChar) { System.out.println(fChar+"" + sChar + "");
	 * result = s.substring(i, i+2); s.r //result = s.replaceAll(fChar+"" +
	 * sChar + "", ""); //l = result.length(); }
	 * System.out.println("result = "+result); } if(result.isEmpty()) { return
	 * "Empty String"; } else { return result; } }
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
