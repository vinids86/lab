package br.com.saraiva.codesignal;

import java.util.Arrays;

/**
 * https://app.codesignal.com/challenge/W3iEJPAy39CsM2B6g
 * <p>
 * You've been chosen as a contestant on a popular TV game show celebrating the excesses of consumerism!
 * <p>
 * You and several other contestants will be taking turns estimating the price of a fancy item. The bidding is done according to the following rules:
 * <p>
 * Bids are rounded to the nearest dollar amount
 * The lowest acceptable bid is $1
 * All bids must be unique (no repeats)
 * The contestant whose estimate was closest to the actual price without going over wins
 * You're the last one to bid, and you'd like to strategize - your plan is to choose the number that would give the broadest range of possible winning values. You have a pretty good idea of what the maximum possible price could be, so you can use that in calculating the best option.
 * <p>
 * Given an integer maxPrice representing the highest price possible for the fancy item, and an array of integers bids representing the other contestants' estimates, your task is to find the winning bid (ie: the value of the bid that would give you the highest chance of winning, assuming a uniform distribution over all possible prices). In the event of a tie, choose the smallest possible bid among the winners.
 * <p>
 * NOTE: It's possible that some contestants bid above maxPrice!
 * <p>
 * Example
 * <p>
 * For maxPrice = 3250 and bids = [2599, 972, 700, 2013], the output should be 973.
 * <p>
 * With a bid of 973, you would have 1040 chances of winning (you win if the price is anything within the inclusive range from 973 to 2012).
 * <p>
 * For maxPrice = 75 and bids = [15, 57, 36, 250], the output should be 16.
 * <p>
 * With a bid of 16, you have 20 chances of winning (anything between 16 and 35 would work). You would have the same number of chances to win with a bid of 37, but since 16 is smaller, it's the one you should choose.
 * <p>
 * For maxPrice = 10000 and bids = [5000, 3500, 7250, 8999], the output should be 1
 * <p>
 * The broadest range would be between 1 and 3499, so you should choose 1.
 * <p>
 * Input / Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer maxPrice
 * <p>
 * An integer representing the highest possible price for the fancy item.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ maxPrice ≤ 109
 * <p>
 * [input] array.integer bids
 * <p>
 * An array of integers representing the other contestants' bids.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ bids.length ≤ 1000
 * 1 ≤ bids[i] ≤ 109
 * <p>
 * [output] integer
 * <p>
 * An integer representing the value of the smallest bid that would maximize your chances of winning.
 */
class ComeOnDownChallenge {

    int comeOnDown(int maxPrice, int[] bids) {

        Arrays.sort(bids);
        int bestBid = 1;
        int interval = bids[0] - 1;

        for (int i = 0; i < bids.length - 1; i++) {
            if (bids[i + 1] > maxPrice) {
                if (maxPrice - bids[i] > interval + 1) {
                    bestBid = bids[i] + 1;
                }
                break;
            } else if (bids[i + 1] - bids[i] > interval + 1) {
                interval = bids[i + 1] - bids[i] - 1;
                bestBid = bids[i] + 1;
            }

        }

        if (maxPrice - bids[bids.length - 1] > interval)
            bestBid = bids[bids.length - 1] + 1;

        return bestBid;
    }
}
