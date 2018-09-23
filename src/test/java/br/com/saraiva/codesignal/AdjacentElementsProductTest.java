package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class AdjacentElementsProductTest {

	@Test
	void givenAnArrayOfIntegers_whenHasPositiveAndNegativeNumbers_thenReturnBiggest() {
		final int[] input = { 3, 6, -2, -5, 7, 3 };
		final int actual = new AdjacentElementsProduct().execute(input);
		final int expected = 21;

		assertEquals(expected, actual);
	}

	@Test
	void givenAnArrayOfIntegers_whenHasOnlyNegativeNumbers_thenReturnBiggest() {
		final int[] input = { -1, -2 };
		final int actual = new AdjacentElementsProduct().execute(input);
		final int expected = 2;

		assertEquals(expected, actual);
	}
}