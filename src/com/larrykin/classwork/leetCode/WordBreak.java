package com.larrykin.classwork.leetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a string s and a dictionary of words dict, determine if s can be segmented into
 * a space-separated sequence of one or more dictionary words. For example, given s =
 * "leetcode", dict = ["leet", "code"]. Return true because "leetcode" can be segmented as
 * "leet code".
 */
public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<>();
        Collections.addAll(dict, "leet", "lee", "code", "leetc");
        System.out.println(solution1(s, dict, 0));
        System.out.println(solution2(s, dict));
        System.out.println(solution3());


    }

    /*
     *Time: O(nˆ 2)
     *This solution exceeds the time limit.
     * */
    private static boolean solution1(String s, Set<String> dict, int start) {
        if (s.length() == start) return true;

        //the segment cannot be greater than the string.
        for (String word : dict) {
            int len = word.length();
            int end = start + len;
            if (end > s.length()) {
                continue;
            }

            if (s.substring(start, end).equals(word)) {
                if (solution1(s, dict, end)) {
                    return true;
                }
            }
        }
        return false;

    }

    /*
     * Dynamic programming approach
     * • Define an array t[] such that t[i]==true =>0-(i-1) can be segmented using dictionary
     * • Initial state t[0] == true
     * */
    private static boolean solution2(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true; //to set the initial state

        for (int i = 0; i < s.length(); i++) {
            //it should continue from a match position -- true
            if (!t[i]) continue;

            for (String word : dict) {
                int len = word.length();
                int end = i + len;
                if (end > s.length()) continue;

                if (t[end]) continue;

                if (s.substring(i, end).equals(word)) {
                    t[end] = true;
                }
            }
        }
        return t[s.length()];
    }


    /*
     *  The problem is supposed to be equivalent to matching the regexp (leet|code)*, which means that it can be solved by building a DFA in O(2 ˆ m) and executing it in O(n).
     *  Leetcode online judge does not allow using Pattern class though.
     * */
    private static boolean solution3() {
        HashSet<String> dict = new HashSet<String>();
        Collections.addAll(dict, "go", "goal", "goals", "special");

        StringBuilder sb = new StringBuilder();

        for (String s : dict) {
            sb.append(s).append("|");
        }

        String pattern = sb.substring(0, sb.length() - 1);
        pattern = "(" + pattern + ")*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("goalss");

        if (m.matches()) {
            System.out.println("match");
            return true;
        }
        return false;
    }
}
