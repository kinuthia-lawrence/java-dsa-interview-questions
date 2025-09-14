package com.larrykin.classwork.algorithm_techniques;

/**
 * Backtracking Technique
 * Used for solving constraint satisfaction problems (e.g., permutations, combinations).
 */
public class BacktrackingTechnique {
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        permute("ABC", "");
    }
}

