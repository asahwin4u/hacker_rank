package com.capgemini.day4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Sample Input 0
 * 
 * 5 1 2 3 4 10 Sample Output 0
 * 
 * 0 1 2 10 100
 * 
 * @author learning
 *
 */
public class DecibinaryNumbers {
	static long decibinaryNumbers(long x) {
		int k = 0;
		BigInteger n = new BigInteger("0");
		BigInteger num = new BigInteger(x + "");
		BigInteger i = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		while (!num.equals(BigInteger.ZERO)) {
			i = num.mod(ten);
			num = num.divide(ten);
			n = n.add(i.multiply(new BigInteger("2").pow(k)));
			k++;
		}
		return n.longValue();
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			long x = in.nextLong();
			long result = decibinaryNumbers(x);
			System.out.println(result);
		}
		in.close();
	}
}

/*
 * int k = 0; BigInteger n = new BigInteger("0"); BigInteger x = new
 * BigInteger("10"); BigInteger i = new BigInteger("0"); BigInteger ten = new
 * BigInteger("10"); while (!x.equals(BigInteger.ZERO)) { i = x.mod(ten); x =
 * x.divide(ten); System.out.println(i + " " + " " + x + " " + n + " " + k);
 * System.out.println(new BigInteger("2").pow(k));
 * System.out.println(i.multiply(new BigInteger("2").pow(k)));
 * System.out.println(n.add(i.multiply(new BigInteger("2").pow(k)))); n =
 * n.add(i.multiply(new BigInteger("2").pow(k))); k++; } System.out.println(n);
 */
