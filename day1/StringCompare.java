package com.capgemini.string;

public class StringCompare {
	public static void main(String[] args) {

		/*
		 * String str1 = "Capgemini Services"; String str2 =
		 * "Capgemini Pvt Ltd";
		 */

		String str1 = "CB CA";
		String str2 = "CA AB";

		String str3 = "Capgemini Pvt Ltd";
		String str4 = "Capgemini pvt ltd";

		int result = str1.compareTo(str2); // compares the string
											// lexographically, compares the
											// ascii value of first character of
											// both string, if its same then it
											// checks the second, if it finds
											// any diffence returns the
											// difference or else returns zero 

		System.out.println(result);

		result = str3.compareToIgnoreCase(str4);
		System.out.println(result);

	}
}
