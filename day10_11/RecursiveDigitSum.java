package com.capgemini.day10_11;

import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class RecursiveDigitSum {
	/*static int digitSum(String str, int k) {
        long num = 0;
		char s[] = str.toCharArray();
		for(char st : s)
		{
			num = num + (st - 48);
		}
        num = num * k;
		str = num + "";
		long l = str.length();
		while(l>1)
		{
			num = 0;
			s = str.toCharArray();
			for(char st : s)
			{
				num = num + (st - 48);
			}
			str = num + "";
			l = str.length();
		}
		return Integer.parseInt(str);
	}*/
	static int digitSum(String str, int k) {
		long num = 0;
		char s[] = str.toCharArray();
		for(char st : s)
		{
			num = num + (st - 48);
		}
        num = num * k;
		return getSuperDigit(num+"");
	}
	 
	static int getSuperDigit(String str) {
		int l = str.length();
		if (l == 1)
			return Integer.parseInt(str);
		long num = 0;
		char s[] = str.toCharArray();
		for(char st : s)
		{
			num = num + (st - 48);
		}
		return getSuperDigit(num + "");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int k = in.nextInt();
		int result = digitSum(n, k);
		System.out.println(result);
		in.close();
	}
}

 /*using recursion --> static int digitSum(String n, int k) { String str = "";
 for (int i = 0; i < k; i++) { str = str + n; } return getSuperDigit(str); }
 
 static int getSuperDigit(String str) { int l = str.length(); if (l == 1)
 return Integer.parseInt(str); int num = 0; for(int i=0;i<l;i++) { num = num +
 Integer.parseInt(str.charAt(i)+""); } return getSuperDigit(num + ""); }
 */
