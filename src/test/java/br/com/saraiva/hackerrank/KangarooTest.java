package br.com.saraiva.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class KangarooTest {

	@Test
	void whenKangoroo1IsFasterAndStartAhead() {
		final String actual = Kangaroo.kangaroo(10, 4, 5, 3);
		final String expected = "NO";
		assertEquals(expected, actual);
	}

	@Test
	void whenKangoroo2IsFasterAndStartAhead() {
		final String actual = Kangaroo.kangaroo(0, 2, 5, 3);
		final String expected = "NO";
		assertEquals(expected, actual);
	}

	@Test
	void whenKangoroo1ReachesKangoroo2() {
		final String actual = Kangaroo.kangaroo(0, 2, 5, 1);
		final String expected = "YES";
		assertEquals(expected, actual);
	}

	@Test
	void whenKangoroo2ReachesKangoroo1() {
		final String actual = Kangaroo.kangaroo(5, 2, 2, 3);
		final String expected = "YES";
		assertEquals(expected, actual);
	}

	@Test
	void whenKangorooHasSameJumpAndDiferentStart() {
		final String actual = Kangaroo.kangaroo(0, 2, 6, 2);
		final String expected = "NO";
		assertEquals(expected, actual);
	}

	@Test
	void whenKangorooHasSameJumpAndSameStart() {
		final String actual = Kangaroo.kangaroo(0, 2, 0, 2);
		final String expected = "YES";
		assertEquals(expected, actual);
	}

	@Test
	void whenAfterOneJumpPositionIsEquals() {
		final String actual = Kangaroo.kangaroo(2564, 5393, 5121, 2836);
		final String expected = "YES";
		assertEquals(expected, actual);
	}
}