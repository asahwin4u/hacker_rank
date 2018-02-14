package com.capgemini.string.day2;

public class ReverseString {
	public static void main(String[] args) {
		
		// case 1
		String str = "Capgemini";
		int length = str.length();
		String rotateStr = "";
		for(int i=length-1;i>=0;i--)
		{
			rotateStr = rotateStr + str.charAt(i);
		}
		System.out.println(rotateStr);
		
		//case 2
		
	}
}
