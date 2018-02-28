package com.capgemini.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StrongPassword {
	static int minimumNumber(int n, String password) {
		Pattern lp = Pattern.compile("([a-z])");
		Pattern up = Pattern.compile("([A-Z])");
		Pattern np = Pattern.compile("(\\d)");
		Pattern sp = Pattern.compile("(\\W)");
		StringBuilder pwd = new StringBuilder(password);
		int count = 0;
		if (!lp.matcher(pwd).find()) {
			pwd.append("a");
			count++;
		}
		if (!up.matcher(pwd).find()) {
			pwd.append("a");
			count++;
		}
		if (!np.matcher(pwd).find()) {
			pwd.append("a");
			count++;
		}
		if (!sp.matcher(pwd).find()) {
			pwd.append("a");
			count++;
		}
		
		if (pwd.length() < 6) {
			/*int temp = 6 - (count + pwd.length());
			count = count + temp;*/
			count = count + (6 - pwd.length());
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String password = in.next();
		int answer = minimumNumber(n, password);
		System.out.println(answer);
		in.close();
	}
}
