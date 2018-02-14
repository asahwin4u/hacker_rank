package com.capgemini.string.day2;

import java.util.Arrays;

public class CommandLineDemo {
	public static void main(String[] args) {
		Arrays.stream(args).forEach(str -> System.out.print(str + " "));

		System.out.println(" Addition = " + (Integer.parseInt(args[0])
				+ Integer.parseInt(args[1])));
	}
}
