package array;

public class LeetCodeExercise {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    /*
    You are given an array prices where prices[i]
    is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single
    day to buy one stock and choosing a different day in the
    future to sell that stock. Return the maximum profit you can
    achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                count = i;
            }
        }
        int max = prices[count];
        for (int i = count; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        if (max == min) {
            return 0;
        }
        return max - min;
    }
}
