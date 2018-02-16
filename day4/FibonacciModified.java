package com.capgemini.day4;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	static BigInteger fibonacciModified(int t1, int t2, int n) {
		BigInteger result = new BigInteger("0");
		BigInteger nt1 = new BigInteger(t1+"");
		BigInteger nt2 = new BigInteger(t2+"");
		for(int i=2;i<n;i++)
		{
			result = nt1.add(nt2.pow(2));
			nt1 = nt2;
			nt2 = result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int n = in.nextInt();
		BigInteger result = fibonacciModified(t1, t2, n);
		System.out.println(result);
		in.close();
	}
}
