package com.capgemini.string.day2;

public class StringContainsCopy {
	public static void main(String[] args) {

		// contains(CharSequence s)
		String str = "Capgemini";
		System.out.println(str.contains("gem")); // return true
		System.out.println(str.contains("gam")); // return false

		// contentEquals(CharSequence cs) or contentEquals(StringBuffer buffer),
		// this method is usefull when comparing the objects of different class
		// having same values or not
		String str2 = "Capgemini";
		String str3 = "Capgamini";
		StringBuffer buffer = new StringBuffer("Capgemini");
		System.out.println(str.contentEquals(buffer)); // return true
		System.out.println(str3.contentEquals(str2)); // return false
		
		//copyValueOf(char[] data)
		// character array
	      char[] charArr = { 'C', 'O', 'M', 'P', 'I', 'L', 'E', ' ',
	         'O', 'N', 'L', 'I', 'N', 'E' };

	      /* returns a String that contains the characters of the character
	         array with offset as 8 and length as 6 */
	      str = str.copyValueOf(charArr, 8, 6); 
	      System.out.println(str);
	      str = String.copyValueOf(charArr, 8, 6); 
	      System.out.println(str);
	      str = str.copyValueOf(charArr);
	      // prints the substring with length as 6 
	      System.out.println(str);
	      
	      String cap = "Capgemini";
	      char[] capChar = cap.toCharArray();
	      System.out.println(capChar[1]);
	}
}
