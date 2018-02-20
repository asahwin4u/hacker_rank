package com.capgemini.day6;

import java.util.Scanner;

public class CaeserCipher {
	static String caesarCipher(String s, int k) {
		int l = s.length();
		String result = "";
		for (int i = 0; i < l; i++) {
			char c = s.charAt(i);
			if (c > 64 && c < 91) {
				c = (char) (c + k);
				while (c > 90) {
					c = (char) (c - 90 + 64);
				}
				result = result + (char) c;
			} else if (c > 96 && c < 123) {
				c = (char) (c + k);
				while (c > 122) {
					c = (char) (c - 122 + 96);
				}
				result = result + (char) c;
			} else {
				result = result + (char) c;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		String result = caesarCipher(s, k);
		System.out.println(result);
		in.close();
	}
}
