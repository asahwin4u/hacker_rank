package com.capgemini.string.day2;

public class ReplaceString {
	public static void main(String[] args) {
		
		String str = "Hacker Hacker rank ERP training day 2";
		//Replacing a with e a character
		System.out.println(str.replace('a', 'e'));
		
		//Replacing a string
		str = "Hacker Hacker rank ERP training day 2";
		System.out.println(str.replaceAll("[*a]", "bl"));
		
		
	}
}
