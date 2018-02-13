package com.capgemini.string;

public class StringConcat {
	public static void main(String[] args) {

		String str1 = "Capgemini";
		String str2 = "Pvt Ltd";
		
		String concat = str1.concat(" "+str2);
		System.out.println(concat);
	}
}
