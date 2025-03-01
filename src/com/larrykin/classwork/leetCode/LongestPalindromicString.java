package com.larrykin.classwork.leetCode;

/**
 * Finding the longest palindromic substring
 */
public class LongestPalindromicString {
    public static void main(String[] args) {

        String s = "dabcba";
        solution(s);
        solution2(s);
        solution3(s);
    }

    //? Naive Approach - time complexity is O(nˆ 3)
    public static void solution(String s) {
        int maxPalindromeLength = 0;
        String longestPalindrome = null;
        int length = s.length();

        //check all possible substring
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int len = j - i;
                String curr = s.substring(i, j + 1);
                if (isPalindrome(curr)) {
                    if (len > maxPalindromeLength) {
                        maxPalindromeLength = len;
                        longestPalindrome = curr;
                    }
                }
            }
        }
        System.out.printf("Longest  Palindrome: %s", longestPalindrome);
    }

    private static boolean isPalindrome(String curr) {
//        return curr.contentEquals(new StringBuilder(curr).reverse());
        for (int i = 0; i < curr.length() - 1; i++) {
            if (curr.charAt(i) != curr.charAt(curr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    //? Dynamic Programming - Time O(nˆ 2) Space O(nˆ 2)
    public static void solution2(String s) {
        /* Define a 2-dimension array "table" and let table[i][j] denote whether substring from
         i to j is palindrome.
         Start condition:
         table[i][i] == 1;
         table[i][i+1] == 1 => s.charAt(i) == s.charAt(i+1)
         Changing condition:
         table[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)
         =>
         table[i][j] == 1*/

        if (s == null) System.out.println("null");
        assert s != null;
        if (s.length() <= 1) System.out.println(s);

        int maxLen = 0;
        String longestStr = null;

        int length = s.length();

        int[][] table = new int[length][length];

        //every single letter is a palindrome
        for (int i = 0; i < length; i++) {
            table[i][i] = 1;
        }
        printTable(table);

        //two consecutive letters are palindrome
        for (int i = 0; i <= length - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = 1;
                longestStr = s.substring(i, i + 2);
            }
        }
        printTable(table);

        //condition to calculate the whole table
        for (int l = 3; l <= length; l++) {
            for (int i = 0; i <= length - l; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] == 1 && l > maxLen)
                        longestStr = s.substring(i, j + 1);
                    else {
                        table[i][j] = 0;
                    }
                    printTable(table);
                }
            }
            System.out.println(longestStr);
        }


    }

    private static void printTable(int[][] table) {
        for (int[] y : table) {
            for (int z : y) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }


    //?Simple Algorithm - TimeO(nˆ 2),SpaceO(1)
    public static void solution3(String s) {
        if (s.isEmpty()) System.out.println("Null");
        if (s.length() == 1) System.out.println(s);

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            //get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
            //get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        System.out.println(longest);
    }

    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }

}
