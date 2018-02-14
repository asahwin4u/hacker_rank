package com.capgemini.string.day2;

public class RotateString {
	public static void main(String[] args) {
		String str = "Capgemini";
		
		// getting last charater to the front
		int length = str.length();
		str = str.charAt(length-1) + str.substring(0, length-1);
		System.out.println(str);
		
		// getting last n charaters to the front
		str = "Capgemini";
		int n = 4;
		while(n > 0)
		{
			str = str.charAt(length-1) + str.substring(0, length-1);
			n--;
		}
		System.out.println(str);
	}
}


