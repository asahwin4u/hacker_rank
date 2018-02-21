package com.capgemini.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s1 = in.next();
			String s2 = in.next();
			String result = twoStrings(s1, s2);
			System.out.println(result);
		}
	}

	static String twoStrings(String s1, String s2) {
		char[] c = s1.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for (char ch : c){
		hs.add(ch);
		        }
		c = s2.toCharArray();
		        
		for (char ch : c){
		if (hs.contains(ch)){
		return "YES";
		            }
		        }
		return "NO";
	}
}
