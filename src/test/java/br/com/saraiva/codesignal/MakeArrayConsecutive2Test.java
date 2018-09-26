package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class MakeArrayConsecutive2Test {

	@Test
	void execute() {
		final int[] input = { 6, 2, 3, 8 };
		final int actual = new MakeArrayConsecutive2().execute(input);
		final int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	void execute2() {
		final int[] input = { 0, 3 };
		final int actual = new MakeArrayConsecutive2().execute(input);
		final int expected = 2;

		assertEquals(expected, actual);
	}
}