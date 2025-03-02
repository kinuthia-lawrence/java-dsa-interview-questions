package com.larrykin.classwork.leetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:
 * Only one letter can be changed at a time Each intermediate word must exist in the
 * dictionary For example,
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit"->"hot"->"dot"->"dog"->"cog", the program
 * should return its length 5.
 * Note: Return 0 if there is no such transformation sequence. All words have the same
 * length. All words contain only lowercase alphabetic characters.
 */
public class WordLadder {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        HashSet<String> dict = new HashSet<String>();
        Collections.addAll(dict, "hot", "dot", "dog", "lot", "log");

        System.out.println(solution1(start, end, dict));
        System.out.println(solution2(start, end, dict));
    }

    /* Naive Approach
     *In a simplest way, we can start from start word, change one character each time, if it
     *is in the dictionary, we continue with the replaced word, until start == end.*/
    public static int solution1(String start, String end, HashSet<String> dict) {
        int len = 0;
        HashSet<String> visited = new HashSet<String>();

        for (int i = 0; i < start.length(); i++) {
            char[] startarr = start.toCharArray(); //convert start to array of characters

            for (char c = 'a'; c <= 'z'; c++) {
                if (c == start.toCharArray()[i]) continue;

                startarr[i] = c;
                String temp = new String(startarr);
                if (dict.contains(temp)) {
                    len++;
                    start = temp;
                    if (temp.equals(end)) {
                        return len;
                    }
                }
            }
        }
        return len;
    }


    /* Breath First Search
     * We can use two queues to traverse the tree, one stores the nodes, the other stores the step numbers.
     * */
    public static int solution2(String start, String end, HashSet<String> dict) {
        if (dict.isEmpty()) return 0;

        dict.add(end);

        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();

        wordQueue.add(start);
        distanceQueue.add(1);

        //track the shortest path
        int result = Integer.MAX_VALUE;
        while (!wordQueue.isEmpty()) {
            String currWord = wordQueue.pop();
            Integer currDistance = distanceQueue.pop();

            if (currWord.equals(end)) {
                result = Math.min(result, currDistance);
            }

            for (int i = 0; i < currWord.length(); i++) {
                char[] currCharArr = currWord.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    currCharArr[i] = c;

                    String newWord = new String(currCharArr);
                    if (dict.contains(newWord)) {
                        wordQueue.add(newWord);
                        distanceQueue.add(currDistance + 1);
                        dict.remove(newWord);
                    }
                }
            }
        }

        if (result < Integer.MAX_VALUE)
            return result;
        else
            return 0;
    }
}
