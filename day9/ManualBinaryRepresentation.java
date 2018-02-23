package com.capgemini.day9;

import java.util.Scanner;

public class ManualBinaryRepresentation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "";
		if (num < 0)
			System.out.println("Not a binary number");
		else if(num == 0)
			System.out.println("0");
		else {
			while (num != 0) {
				int n = num % 2;
				result = n + result;
				num = num / 2;
			}
			System.out.println(result);
		}
			

		/* num = 101; */

		/*
		 * int n = 0; int m = 0;//1001 while(num != 0) { int templ = num % 10; n
		 * = n + (templ * (int)Math.pow(2, m)); num = num / 10; m++; }
		 * System.out.println(n);
		 */
	}
}
