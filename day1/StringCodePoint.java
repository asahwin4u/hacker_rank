package com.capgemini.string;

import java.util.stream.IntStream;

public class StringCodePoint {
	public static void main(String[] args) {
		String str = "Capgemini";
		int codePointAt = str.codePointAt(6); // it returns the ASCII value of
												// the charater (given index)
		System.out.println(codePointAt);

		int codePointBefore = str.codePointBefore(1);
		System.out.println(codePointBefore); // it returns the ASCII value of
												// the charater (previous to
												// given index)

		int codePointCount = str.codePointCount(2, 6);
		System.out.println(codePointCount); // it returns the no. of charaters
											// in given range
		
		IntStream codePoints = str.codePoints();
		System.out.println(codePoints.count());
	}
}
