package com.capgemini.day10_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PasswordCracker {
	static String passwordCracker(String[] pass, String attempt) {
		Arrays.sort(pass, Collections.reverseOrder());
		System.out.println(Arrays.toString(pass));
		StringBuilder sb = new StringBuilder(attempt);
		int l = sb.length();
		boolean flag = false;
		String s = "";
		String same = "";
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < pass.length; j++) {

				if (pass[j].startsWith(sb.charAt(i) + "")) {
					/*System.out.println("l = "+l);
					System.out.println("i = "+i);
					System.out.println("pass[j].length() = "+pass[j].length());*/
					/*if (i + pass[j].length() > l) {
						continue;
					}*/
					String str = sb.substring(i, pass[j].length() + i);
					//System.out.println("str = "+str);
					if (str.equals(pass[j])) {
						s = s + str + " ";
						same = same + str;
						i = i + str.length() - 1;
						break;
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(s);
		if (attempt.equals(same))
			return s.trim();
		else
			return "WRONG PASSWORD";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			String[] pass = new String[n];
			for (int pass_i = 0; pass_i < n; pass_i++) {
				pass[pass_i] = in.next();
			}
			String attempt = in.next();
			String result = passwordCracker(pass, attempt);
			System.out.println(result);
		}
		in.close();
	}
}
