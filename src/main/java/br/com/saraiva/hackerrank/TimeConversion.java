package br.com.saraiva.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sara on set, 2018
 * <p>
 * https://www.hackerrank.com/challenges/time-conversion/problem
 * <p>
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon
 * is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * <p>
 * Function Description
 * <p>
 * Complete the timeConversion function in the editor below. It should return a new string
 * representing the input time in 24 hour format.
 * <p>
 * timeConversion has the following parameter(s):
 * <p>
 * s: a string representing time in hour format Input Format
 * <p>
 * A single string containing a time in -hour clock format (i.e.: or ), where and .
 * <p>
 * Constraints
 * <p>
 * All input times are valid Output Format
 * <p>
 * Convert and print the given time in -hour format, where .
 * <p>
 * Sample Input 0
 * <p>
 * 07:05:45PM Sample Output 0
 * <p>
 * 19:05:45
 */
public class TimeConversion {

	private static final Scanner scan = new Scanner(System.in);

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		// 07:05:45PM

		final String[] time = s.split(":");
		final String hours = time[0];
		final String minutes = time[1];
		final String seconds = time[2].substring(0, 2);

        return Integer.valueOf(hours) + 12 + ":" + minutes + ":" + seconds;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
