package br.com.saraiva.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by sara on set, 2018
 */
class AppleAndOrangeTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	void out() {
		int[] apples = { -2, 2, 1 };
		int[] oranges = { 5, -6 };
		AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
		assertEquals("1\n1\n", outContent.toString());
	}
}