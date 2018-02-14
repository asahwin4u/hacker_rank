package com.capgemini.string.day2;

public class SwithchStatement {
	public static void main(String[] args) {

		String dayTime = "AFT";

		switch (dayTime) {
		case "MRN":
			System.out.println("this is morning");
			break;

		case "AFT":
			System.out.println("this is after noon");
			break;

		case "EVE":
			System.out.println("this is evening");
			break;

		case "NGT":
			System.out.println("Good Night");
			break;
		default:
			break;
		}
		
		//cannot use double or flat in swith statement
		/*float double1 = (float) 0.0;
		
		switch (double1) {
		case 1.23:
			System.out.println("this is 1.23");
			break;
			
		case 4.523:
			System.out.println("this is 4.523");
			break;
			
		case 5.991:
			System.out.println("this is 5.991");
			break;
			
		case -1:
			System.out.println("this is -1");
			break;
		default:
			break;
		}*/
	}
}
