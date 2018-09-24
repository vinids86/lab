package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class ShapeAreaTest {

	@Test
	void execute() {
		final int input = 2;
		final int actual = new ShapeArea().execute(input);
		final int expected = 5;

		assertEquals(expected, actual);
	}

	@Test
	void execute2() {
		final int input = 3;
		final int actual = new ShapeArea().execute(input);
		final int expected = 13;

		assertEquals(expected, actual);
	}
}