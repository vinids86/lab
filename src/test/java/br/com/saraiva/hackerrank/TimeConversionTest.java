package br.com.saraiva.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sara on set, 2018
 */
class TimeConversionTest {

    @Test
    void givenATimeIn12Format_thenConvertItToMilitary24() {

        final String input = "07:05:45PM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "19:05:45";

        assertEquals(actual, expected);
    }

    @Test
    void givenATimeIn12Format_whenTimeIsMidnight_thenConvertItToMilitary24() {

        final String input = "07:05:45PM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "19:05:45";

        assertEquals(actual, expected);
    }
}