package br.com.saraiva.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class KangarooTest {

	@Test
	void kangorroTest() {
		final String actual = Kangaroo.kangaroo(0, 2, 5, 3);
		final String expected = "NO";
		assertEquals(expected, actual);
	}
}