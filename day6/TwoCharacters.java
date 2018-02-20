package com.capgemini.day6;

import java.util.Scanner;

public class TwoCharacters {
	static int twoCharaters(String s) {
		// StringBuilder sb = new StringBuilder(s);
		int l = s.length();

        if(l == 2)
        {
            if(s.charAt(0)!=s.charAt(1)){
                return 2;
            }
        }
		//int i = 0;
		while (l != 0) {

			for (int i = 1; i < l; i++) {
				if (s.charAt(i - 1) == s.charAt(i)) {
					s = s.replaceAll(s.charAt(i - 1) + "", "");
					l = s.length();
					System.out.println(s);
				}
			}
		}
		return l;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String s = in.next();
		int result = twoCharaters(s);
		System.out.println(result);
		in.close();
	}
}
