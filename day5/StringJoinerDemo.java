package com.capgemini.day5;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString(); // aaa,bbb,ccc
		System.out.println(result);

		StringJoiner sk = new StringJoiner("-", "preffix-", "-suffix");
		sk.add("aaa");
		sk.add("bbb");
		sk.add("ccc");
		result = sk.toString(); // aaa,bbb,ccc
		System.out.println(result);

		// Collectors.joining
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println(result);

		System.out.println(list.stream().toString());

		Stream.iterate(new long[] { 1, 1 },
				p -> new long[] { p[1], p[0] + p[1] }).limit(92)
				.forEach(p -> System.out.println(p[0]));
	}
}
