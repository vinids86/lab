package br.com.saraiva.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class CheckPalindromeTest {

	@Test
	void checkPalindrome() {
		String input = "aabaa";
		boolean actual = new CheckPalindrome().execute(input);
		boolean expected = true;

		assertEquals(expected, actual);
	}
}