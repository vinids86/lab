package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class CenturyFromYearTest {

	@Test
	void centuryFromYear() {
		int input = 1905;
		int actual = new CenturyFromYear().centuryFromYear(input);
		int expected = 20;

		assertEquals(expected, actual);
	}
}