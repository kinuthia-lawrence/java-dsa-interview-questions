package com.larrykin.classwork.algorithm_techniques;

/**
 * Greedy Technique
 * Makes the locally optimal choice at each step.
 */
public class GreedyTechnique {
    public static int coinChange(int[] coins, int amount) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        System.out.println(coinChange(coins, 37));
    }
}

