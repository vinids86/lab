package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class CenturyFromYearTest {

	@Test
	void givenAYear_whenYearIsBiggerThen100() {
		int input = 1905;
		int actual = new CenturyFromYear().centuryFromYear(input);
		int expected = 20;

		assertEquals(expected, actual);
	}

	@Test
	void givenAYear_whenYearIsLessThan100() {
		int input = 54;
		int actual = new CenturyFromYear().centuryFromYear(input);
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	void givenAYear_whenYearEndingWith00() {
		int input = 1700;
		int actual = new CenturyFromYear().centuryFromYear(input);
		int expected = 17;

		assertEquals(expected, actual);
	}
}