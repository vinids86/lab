package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class CheckPalindromeTest {

	@Test
	void givenAString_whenIsAPalindrome_thenReturnTrue() {
		String input = "aabaa";
		boolean actual = new CheckPalindrome().execute(input);
		boolean expected = true;

		assertEquals(expected, actual);
	}

	@Test
	void givenAString_whenIsNotAPalindrome_thenReturnFalse() {
		String input = "abac";
		boolean actual = new CheckPalindrome().execute(input);
		boolean expected = false;

		assertEquals(expected, actual);
	}
}