package com.capgemini.day3.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class SamAndSubStrings {

	static BigInteger substrings(String balls) {
		int length = balls.length();
		BigInteger total = new BigInteger("0");
		BigInteger n = new BigInteger("0");
		for (int i = 0; i < length; i++) {
			for (int j = 1; j <= (length - i); j++) {

				total = total.add(new BigInteger(balls.substring(i, j + i)));
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String balls = in.next();
		BigInteger result = substrings(balls);
		System.out.println(result);
		in.close();
	}
}
