package com.capgemini.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Pangrams {
	public static void main(String args[]) throws Exception {
		/*
		 * Scanner s = new Scanner(System.in); StringBuilder sb = new
		 * StringBuilder(s.nextLine().trim().toLowerCase().replaceAll(" ", ""));
		 * int l = sb.length(); String result = ""; int count = 0; for (int i =
		 * 0; i < l; i++) { if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') { if
		 * (!result.contains(sb.charAt(i)+"")) { result = result + sb.charAt(i);
		 * count++; } if (count == 26) { System.out.println("pangram"); break; }
		 * } else { System.out.println("not pangram"); System.exit(0); } }
		 * if(count!=26) { System.out.println("not pangram"); }
		 */
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(s.nextLine().trim().toLowerCase()
				.replaceAll(" ", ""));
		Set set = new HashSet();
		int l = sb.length();
		for(int i=0;i<l;i++)
		{
			set.add(sb.charAt(i)+"");
			if(set.size() == 26)
			{
				System.out.println("pangram");
				System.exit(0);
			}
		}
		System.out.println("not pangram");
	}
}
