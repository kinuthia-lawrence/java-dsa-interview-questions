package com.larrykin.classwork.leetCode;

import java.util.*;

/**
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence
 * where each word is a valid dictionary word. Return all such possible sentences.
 * For example, given s = "catsanddog", dict = ["cat", "cats", "and", "sand", "dog"], the
 * solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        Set<String> dict = new HashSet<String>();
        dict.add("cat");
        Collections.addAll(dict, "cats", "and", "sand", "dog");
        List<String> wordsList = wordBreak(s, dict);
    }

    public static List<String> wordBreak(String s, Set<String> dict) {
        //array of strings
        List<String> dp[] = new ArrayList[s.length() + 1];
        dp[0] = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (dp[i] == null) continue;

            for (String word : dict) {
                int len = word.length();
                int end = i + len;
                if (end > s.length()) continue;

                if (s.substring(i, end).equals(word)) {
                    if (dp[end] == null) {
                        dp[end] = new ArrayList<String>();
                    }
                    dp[end].add(word);
                }
            }
        }

        List<String> result = new LinkedList<String>();
        if (dp[s.length()] == null) return result;

        ArrayList<String> temp = new ArrayList<String>();
        dfs(dp, s.length(), result, temp);

        return result;
    }

    public static void dfs(List<String> dp[], int end, List<String> result, ArrayList<String> tmp) {
        if (end <= 0) {
            String path = tmp.get(tmp.size() - 1);
            for (int i = tmp.size() - 2; i > 0; i--) {
                path += " " + tmp.get(i);
            }

            result.add(path);
            return;
        }
        for (String str : dp[end]) {
            tmp.add(str);
            dfs(dp, end - str.length(), result, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
