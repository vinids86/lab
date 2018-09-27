package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class AlmostIncreasingSequenceTest {

	@Test
	void execute() {
		final int[] input = { 1, 3, 2, 1 };
		final boolean actual = new AlmostIncreasingSequence().execute(input);
		final boolean expected = false;

		assertEquals(expected, actual);
	}
}