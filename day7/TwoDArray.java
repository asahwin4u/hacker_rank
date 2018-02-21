package com.capgemini.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < 6; i++) {
			list.add(Arrays
					.stream(Stream.of(sc.nextLine().split(" "))
							.mapToInt(Integer::parseInt).toArray()).boxed()
					.collect(Collectors.toList()));
		}
		int max = -1000;
		int fRow = 0;
		int mRow = 0;
		int lRow = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				fRow = list.get(i).get(j-1) + list.get(i).get(j) + list.get(i).get(j+1);
				mRow = list.get(i+1).get(j);
				lRow = list.get(i+2).get(j-1) + list.get(i+2).get(j) + list.get(i+2).get(j+1);
				
				int temp = fRow + mRow + lRow;
				if(temp > max)
				{
					max = temp;
				}
			}
		}
		System.out.println(max);
	}
}
