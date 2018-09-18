package br.com.saraiva.codesignal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComeOnDownChallengeTest {

    private ComeOnDownChallenge comeOnDown;

    @BeforeEach
    void setUp() {
        this.comeOnDown = new ComeOnDownChallenge();
    }

    /**
     * With a bid of 973, you would have 1040 chances of winning (you win if the price is anything within the inclusive range from 973 to 2012).
     */
    @Test
    void whenTheBestBidInTheMiddle() {


        int maxPrice = 3250;
        int[] bids = {2599, 972, 700, 2013};
        int actual = comeOnDown.comeOnDown(maxPrice, bids);
        int expected = 973;

        assertEquals(expected, actual);
    }

    /**
     * With a bid of 16, you have 20 chances of winning (anything between 16 and 35 would work).
     * You would have the same number of chances to win with a bid of 37, but since 16 is smaller, it's the one you should choose.
     */
    @Test
    void whenTheBestBidIsSmallerBetween() {

        int maxPrice = 75;
        int[] bids = {15, 57, 36, 250};
        int actual = comeOnDown.comeOnDown(maxPrice, bids);
        int expected = 16;

        assertEquals(expected, actual);
    }

    /**
     * The broadest range would be between 1 and 3499, so you should choose 1.
     */
    @Test
    void whenTheBestBidIsOne() {

        int maxPrice = 10000;
        int[] bids = {5000, 3500, 7250, 8999};
        int actual = comeOnDown.comeOnDown(maxPrice, bids);
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void whenTheBestBidIsLastBelowMaxPrice() {

        int maxPrice = 5999;
        int[] bids = {2727, 6430, 833, 6744, 6685, 9266, 713, 803, 2940, 9662};
        int actual = comeOnDown.comeOnDown(maxPrice, bids);
        int expected = 2941;

        assertEquals(expected, actual);
    }

    @Test
    void whenTheBestBidIsTheLast() {

        int maxPrice = 41;
        int[] bids = {10, 20};
        int actual = comeOnDown.comeOnDown(maxPrice, bids);
        int expected = 21;

        assertEquals(expected, actual);
    }
}