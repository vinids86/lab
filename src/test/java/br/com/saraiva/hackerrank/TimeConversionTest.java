package br.com.saraiva.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sara on set, 2018
 */
class TimeConversionTest {

    @Test
    void givenATimeIn12Format_whenTimeIsPM_thenConvertItToMilitary24() {

        final String input = "07:05:45PM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "19:05:45";

        assertEquals(expected, actual);
    }

    @Test
    void givenATimeIn12Format_whenTimeIsAM_thenConvertItToMilitary24() {

        final String input = "10:46:21AM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "10:46:21";

        assertEquals(expected, actual);
    }

    @Test
    void givenATimeIn12Format_whenTimeIsLessThan10_thenConvertItToMilitary24With0() {

        final String input = "07:05:45AM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "07:05:45";

        assertEquals(expected, actual);
    }

    @Test
    void givenATimeIn12Format_whenTimeIsMidnight_thenConvertItToMilitary24() {

        final String input = "12:00:00AM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "00:00:00";

        assertEquals(expected, actual);
    }

    @Test
    void givenATimeIn12Format_whenTimeIsNoon_thenConvertItToMilitary24() {

        final String input = "12:00:00PM";
        final String actual = TimeConversion.timeConversion(input);
        final String expected = "12:00:00";

        assertEquals(expected, actual);
    }
}