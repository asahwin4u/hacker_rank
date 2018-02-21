package com.capgemini.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SparseArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> l = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			l.add(sc.next());
		}
		int m = sc.nextInt();
		for(int i=0;i<m;i++)
		{
			System.out.println(Collections.frequency(l, sc.next()));
		}
		/*Map<String, Integer> aMap = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String str = sc.next();
			if(aMap.containsKey(str))
			{
				aMap.put(str, aMap.get(str)+1);
			} else {
				aMap.put(str, 1);
			}
		}
		
		int m = sc.nextInt();
		for(int i=0;i<m;i++)
		{
			Integer val = aMap.get(sc.next());
			if(val == null)
			{
				System.out.println(0);
			} else {
				System.out.println(val);
			}
		}*/
		
	}
}
