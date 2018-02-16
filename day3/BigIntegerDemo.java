package com.capgemini.day3;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		// create 2 BigInteger objects
		BigInteger bi1, bi2;

		// BigInteger flipbit
		// assign value to bi1
		bi1 = new BigInteger("8");// 1000
		bi1 = bi1.add(new BigInteger("4"));
		System.out.println(bi1);
		bi2 = bi1.flipBit(3); // 11000
		System.out.println(bi1.flipBit(3));
		System.out.println(bi1.flipBit(3));
		String str = "Flipbit operation on " + bi1 + " at index 1 gives " + bi2;

		/**
		 * input = 4, output = 9 , find out the positions we need to change
		 */
		System.out.println("----------------------");
		BigInteger i1 = new BigInteger("6"); // 110
		BigInteger i2 = new BigInteger("3"); // 011 101
		System.out.println(i1.toString(2));
		System.out.println(i2.toString(2));
		// And, Or, XOR, AndNot operator
		System.out.println(i1.and(i2).toString(2));
		System.out.println(i1.or(i2).toString(2));
		System.out.println(i1.xor(i2).toString(2));
		System.out.println(i1.andNot(i2).toString(2)); // first it does not of
														// 3, then (not of 3)
														// AND 6 i.e. not of 3 =
														// 100, then 011 AND 110
														// --> 100

		
		System.out.println("---------------");
		// left shift, right shift
		// create 3 BigInteger objects

		bi1 = new BigInteger("10"); // 1010 --> 101000

		// perform leftshift operation on bi1 using 2 and -2
		i1 = bi1.shiftLeft(2); // 1010 --> 101000
		i2 = bi1.shiftLeft(-2); // 1010 --> 10

		String str1 = "Leftshift on " + bi1 + ", 2 times gives " + i1;
		String str2 = "Leftshift on " + bi1 + ",-2 times gives " + i2;

		System.out.println(str1);
		System.out.println(str2);
		
		// perform rightshift operation bi1 using 2 and -2
		i1 = bi1.shiftRight(2); // 1010 --> 101000
		i2 = bi1.shiftRight(-2); // 1010 --> 10

		str1 = "Rightshift on " + bi1 + ", 2 times gives " + i1;
		str2 = "Rightshift on " + bi1 + ",-2 times gives " + i2;

		System.out.println(str1);
		System.out.println(str2);
		
		//ClearBit()
		System.out.println("ClearBit()--------------------------");
		BigInteger c1 = new BigInteger("24"); //11000
		System.out.println(c1.toString(2));
		System.out.println(c1.clearBit(2).toString()); //11000 --> 24
		System.out.println(c1.clearBit(3).toString()); //11000 --> 16
		/**
		 * if the given index bit is 0, then no changes in the value
		 * but if the given index bit is 1, then it remove that bit from string
		 */
		
		BigInteger bigInteger = new BigInteger("90");
		System.out.println(bigInteger);
		bigInteger.setBit(44);
		System.out.println(bigInteger);
		

	}
}
