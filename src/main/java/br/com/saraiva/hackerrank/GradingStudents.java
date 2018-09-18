package br.com.saraiva.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sara on set, 2018
 *
 * https://www.hackerrank.com/challenges/grading/problem
 *
 * HackerLand University has the following grading policy:
 *
 * Every student receives a in the inclusive range from to . Any less than is a failing
 * grade. Sam is a professor at the university and likes to round each student's according
 * to these rules:
 *
 * If the difference between the and the next multiple of is less than , round up to the
 * next multiple of . If the value of is less than , no rounding occurs as the result will
 * still be a failing grade. For example, will be rounded to but will not be rounded
 * because the rounding would result in a number that is less than .
 *
 * Given the initial value of for each of Sam's students, write code to automate the
 * rounding process.
 *
 * Function Description
 *
 * Complete the function gradingStudents in the editor below. It should return an integer
 * array consisting of rounded grades.
 *
 * gradingStudents has the following parameter(s):
 *
 * grades: an array of integers representing grades before rounding Input Format
 *
 * The first line contains a single integer, , the number of students. Each line of the
 * subsequent lines contains a single integer, , denoting student 's grade.
 */
public class GradingStudents {
	private static final Scanner scan = new Scanner(System.in);

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {

		int[] result = new int[grades.length];

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 38 && nextMultipleOf5(grades[i]) - grades[i] < 3) {
				result[i] = nextMultipleOf5(grades[i]);
			}
			else {
				result[i] = grades[i];
			}
		}

		return result;
	}

	private static int nextMultipleOf5(int grade) {
		return 5 - (grade % 5) + grade;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write("\n");
			}
		}

		bw.newLine();

		bw.close();
	}
}
