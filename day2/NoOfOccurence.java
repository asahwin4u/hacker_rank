package com.capgemini.string.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfOccurence {

	public static void main(String[] args) {
		
		// case 1
		String str = "hacker rank erp training";
		int length = str.length();
		int count = 0;
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i) == 'e')
			{
				count++;
			}
		}
		System.out.println("count is "+count);
		
		// case 2 using lambda expression
		str.chars().filter(num -> num == '$').count();
		System.out.println(str.chars().filter(ch -> ch == 'e').count());
		
		// case using Pattern
		Pattern pattern = Pattern.compile("[e]");
		Matcher matcher = pattern.matcher(str);
		count = 0;
		while(matcher.find())
		{
			count++;
		}
		System.out.println("count is "+2);
	}
}
