package com.capgemini.day6;

import java.math.BigInteger;
import java.util.Scanner;

public class SeparateNumbers {
	static void separateNumbers(String s) {
		int l = s.length();
		int le = l / 2;
		BigInteger n = null;
		StringBuilder sb;
		BigInteger one = new BigInteger("1");
		boolean flag = false;
		for (int i = 0; i < le; i++) {
			sb = new StringBuilder();
			BigInteger num = new BigInteger(s.substring(0, i + 1));
			n = num;
			int lb = sb.length();
			while (lb < l) {
				sb.append(num);
				num = num.add(one);
				lb = sb.length();
			}
			if (sb.toString().equals(s)) {
				flag = true;
				break;
			} 
		}
		if(flag)
		{
			System.out.println("YES "+n);
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			separateNumbers(s);
		}
		in.close();
	}
}
