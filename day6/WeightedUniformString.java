package com.capgemini.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		List<Integer> iList = new ArrayList<Integer>();
		for (int a0 = 0; a0 < n; a0++) {
			iList.add(in.nextInt());
		}
		StringBuilder sb = new StringBuilder(s + " ");
		int l = sb.length();
		Set<Integer> set = new HashSet<Integer>();
//abccddde
		for (int i = 0; i < l-1 ; i++) {
			int j = 0;
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				set.add(new Integer(sb.charAt(i) - 96));
				j = j + (sb.charAt(i) - 96);
				while (sb.charAt(i) == sb.charAt(i + 1)) {
					j = j + (sb.charAt(i) - 96);
					set.add(new Integer(j));
					i++;
				}
				j = 0;
			} else {
				set.add(new Integer(sb.charAt(i) - 96));
			}
		}
		for(Integer i : iList)
		{
			if(set.contains(i))
			{
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

/*
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * String s = in.next(); int n = in.nextInt(); List<Integer> iList = new
 * ArrayList<Integer>(); for (int a0 = 0; a0 < n; a0++) {
 * iList.add(in.nextInt()); } StringBuilder sb = new StringBuilder(s + " "); int
 * l = sb.length(); List<String> list = new ArrayList<String>(); Set<Integer>
 * set = new HashSet<Integer>();
 * 
 * for (int i = 0; i < l-1 ; i++) { String st = ""; int j = 0; if (sb.charAt(i)
 * == sb.charAt(i + 1)) { list.add(sb.charAt(i) + ""); set.add(new
 * Integer(sb.charAt(i) - 96)); st = st + sb.charAt(i); j = j + (sb.charAt(i) -
 * 96); while (sb.charAt(i) == sb.charAt(i + 1)) { st = st + sb.charAt(i);
 * list.add(st); j = j + (sb.charAt(i) - 96); set.add(new Integer(j)); i++; } j
 * = 0; } else { list.add(sb.charAt(i) + ""); set.add(new Integer(sb.charAt(i) -
 * 96)); } } for(Integer i : iList) { if(set.contains(i)) {
 * System.out.println("Yes"); } else { System.out.println("No"); } } }
 */
