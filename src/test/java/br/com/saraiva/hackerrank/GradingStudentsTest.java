package br.com.saraiva.hackerrank;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class GradingStudentsTest {

	@Test
	void gradingStudents() {

		int[] grades = { 73, 67, 38, 33 };
		final int[] actual = GradingStudents.gradingStudents(grades);

		int[] expected = { 75, 67, 40, 33 };

		assertArrayEquals(expected, actual);
	}
}