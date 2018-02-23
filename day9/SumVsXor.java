package com.capgemini.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import javax.swing.GroupLayout.ParallelGroup;

import com.capgemini.day3.InstreamDemo;

public class SumVsXor {
	static long solve(long n) {
		long count = 0;
		if (n == 0) {
			return 1;
		} else {

			int l = 0;
			long[] le = LongStream.iterate(0, a -> a + 1).limit(n).toArray();
			System.out.println(Arrays.toString(le));
			// System.out.println(list);
			/*
			 * count = LongStream.range(0, n).parallel() .filter(a -> ((a ^ n)
			 * == (a + n))).count();
			 */

			/*count = LongStream.of(le).filter(a -> ((a ^ n) == (a + n)))
					.parallel().count();*/

			return count;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long result = solve(n);
		System.out.println(result);
	}
}

/*
 * static long solve(long n) { final long count = 0; if (n == 0) { return 1; }
 * else {
 * 
 * int l = 0; long[] le = LongStream.iterate(0, a -> a + 1).limit(n).toArray();
 * System.out.println(Arrays.toString(le)); // LongStream.of(le). /*
 * LongStream.of(le).parallel().forEach(a -> { System.out.println("hello " + n +
 * " " + a + " "+le+" "+count); if ((n ^ a) == (n + a)) { a = -1; } });
 */

/*
 * long c = LongStream.of(le).filter(a -> ((a ^ n) == (a + n)))
 * .parallel().count(); System.out.println(c);
 */

/*
 * LongStream.of(le).filter(a -> a > 4) .peek(a -> System.out.println(a));
 * 
 * LongStream.of(le).filter(a -> a > 4).forEach(System.out::println);
 */

// System.out.println(Arrays.toString(le));
/*
 * LongStream.range(0, n).parallel().forEach( { int t = 0; if((n ^ a) == (n +
 * a)) { t++; } System.out.println(t); });
 */
/*
 * for (long i = 0; i < n; i++) { if ((n ^ i) == (n + i)) count++; }
 */
/*
 * return count; } }
 */

