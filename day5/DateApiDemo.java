package com.capgemini.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class DateApiDemo {
	public static void main(String[] args) {
		/*
		 * Date & Time API --------------- Until 1.7 Date Calender Timestamp
		 * 
		 * Abover classes are not useful wrt performance and convenience
		 * 
		 * Date and Time api in Java 8 developed by joda.org
		 */

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		/*
		 * LocalDate and LocalTime under package java.time
		 * 
		 * Getting individually date,month and year
		 * ----------------------------------------
		 */
		date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + "-" + mm + "-" + yyyy);
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		/*
		 * Getting individually hour,mins,secs,nano secs
		 * ---------------------------------------------
		 */

		time = LocalTime.now();
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanoSec = time.getNano();

		System.out.printf("%d:%d:%d:%d", hour, min, sec, nanoSec);

		/*
		 * LocalDateTime -------------- Can handle both date and time
		 */
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		dd = dt.getDayOfMonth();
		mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("Date : %d-%d-%d", dd, mm, yy);
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("\nTime:%d:%d:%d:%d", h, m, s, n);

		/*
		 * If you want to hold say joining date or birthdate (not current date
		 * and time)
		 */

		dt = LocalDateTime.of(yy, mm, dd, h, m, s, n);

		dt = LocalDateTime.of(1995, 05, 24, 11, 45);
		// you can take Month.May instead of 05
		System.out.println("After six months :" + dt.plusMonths(6));
		System.out.println("After six months :" + dt.minusMonths(6));
		System.out.println(dt);

		/*
		 * Period ------
		 */
		LocalDate birthday = LocalDate.of(1982, 10, 04);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Your age is %d years %d months %d days",
				p.getYears(), p.getMonths(), p.getDays());

		/*
		 * Year ---- 2020 is a Leap year : divisible by 4
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		n = sc.nextInt();
		Year y = Year.of(n);
		if (y.isLeap()) {
			System.out.printf("%d year is Leap year", n);
		} else {
			System.out.printf("%d year is not Leap Year", n);
		}
	}
}
