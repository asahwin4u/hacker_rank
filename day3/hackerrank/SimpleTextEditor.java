package com.capgemini.day3.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleTextEditor {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner s = new Scanner(System.in);
		int noOfOperations = s.nextInt();
		List<String> operationRecord = new ArrayList<String>();
		for (int i = 0; i < noOfOperations; i++) {
			switch (s.nextInt()) {
			case 1:
				str.append(s.next());
				storeUnd(str, operationRecord);
				break;

			case 2:
				int d = s.nextInt();
				if (str.length() - d > 0) {
					str = str.replace(str.length() - d, str.length(), "");
				} else {
					str = str.replace(0, str.length(), "");
				}
				storeUnd(str, operationRecord);
				break;

			case 3:
				int c = s.nextInt();
				if (str.length() >= c) {
					System.out.println(str.charAt(c - 1));
				}
				break;

			case 4:
				operationRecord.remove(operationRecord.size() - 1);
				str = new StringBuilder(operationRecord.get(operationRecord.size() - 1));
				break;
			}
		}
	}

	private static void storeUnd(StringBuilder str, List<String> operationRecord) {
		operationRecord.add(str.toString());
	}
}

/*
 * package com.capgemini.day3;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * import java.util.Scanner;
 * 
 * public class SimpleTextEditor { public static StringBuilder str = new
 * StringBuilder();
 * 
 * public static void main(String[] args) { Scanner s = new Scanner(System.in);
 * /*System.out.println("1 - append");
 * System.out.println("2 - print specified index charated"); System.out
 * .println("3 - delete last charaters(specify the no. of charaters)");
 * System.out.println("4 - undo the previous operation");
 * System.out.print("Enter the no. of operations to be performed:"); int
 * noOfOperations = s.nextInt();
 * /*System.out.println("Now specify the operations one by one\n"); List<List>
 * listOfOperation = new ArrayList<List>(); List operationRecord = new
 * ArrayList(); s.nextLine(); for (int i = 0; i < noOfOperations; i++) { String
 * operation = s.nextLine();
 * listOfOperation.add(Arrays.asList(operation.split(" "))); }
 * //System.out.println(listOfOperation);
 * 
 * for (int i = 0; i < noOfOperations; i++) { List list = (List)
 * listOfOperation.get(i); int option = Integer.parseInt((String) list.get(0));
 * switch (option) { case 1: append(list, operationRecord); break;
 * 
 * case 3: printTheSpecifiedIndexCharater(list, operationRecord); break;
 * 
 * case 2: deleteLastCharaters(list, operationRecord); break;
 * 
 * case 4: undoLastOperation(list, operationRecord); break;
 * 
 * default: System.exit(0); } }
 * 
 * }
 * 
 * private static void undoLastOperation(List list, List operationRecord) { int
 * length = operationRecord.size(); operationRecord.remove(length - 1); length =
 * operationRecord.size(); str = (String) operationRecord.get(length - 1); }
 * 
 * private static void deleteLastCharaters(List list, List operationRecord) {
 * int deleteChar = Integer.parseInt((String) list.get(1)); str =
 * str.substring(0, str.length() - (deleteChar)); operationRecord.add(str); }
 * 
 * private static void printTheSpecifiedIndexCharater(List list, List
 * operationRecord) { int printIndex = Integer.parseInt((String) list.get(1));
 * System.out.println(str.charAt(printIndex-1)); }
 * 
 * private static void append(List list, List operationRecord) { String
 * appendStr = (String) list.get(1); str = str + appendStr;
 * operationRecord.add(str); } }
 */