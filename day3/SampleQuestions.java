package com.capgemini.day3;

public class SampleQuestions {
	public static void main(String[] args) {
		
		//Swapping of numbers without using third variable
		int a = 10;
		int b = 30;
		
		a = a ^ b;
		System.out.println(a);
		b = a ^ b;
		System.out.println(b);
		a = a ^ b;
		System.out.println(a + " "+ b);
	}
}
