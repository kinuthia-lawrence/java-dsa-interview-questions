package com.larrykin.classwork.leetCode;


/**
 * Implement regular expression matching with support for ’.’ and ’*’.
 * ’.’ Matches any single character.
 * ’*’ Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * Some examples:
 * isMatch("aa","a") return false
 * isMatch("aa","aa") return true
 * isMatch("aaa","aa") return false
 * isMatch("aa", "a*") return true
 * isMatch("aa", ".*") return true
 * isMatch("ab", ".*") return true
 * isMatch("aab", "c*a*b") return true
 */
public class ExpressionMatching {
    public static void main(String[] args) {
        System.out.printf("false:: %b\n", isMatch("aa", "a"));
        System.out.printf("true:: %b\n", isMatch("aa", "aa"));
        System.out.printf("false:: %b\n", isMatch("aaa", "a"));
        System.out.printf("true:: %b\n", isMatch("aa", "a*"));
        System.out.printf("true:: %b\n", isMatch("aa", ".*"));
        System.out.printf("true:: %b\n", isMatch("ab", ".*"));
        System.out.printf("true:: %b\n", isMatch("aab", "c*a*b"));
        System.out.println();
        System.out.printf("false:: %b\n", isMatch1("aa", "a"));
        System.out.printf("true:: %b\n", isMatch1("aa", "aa"));
        System.out.printf("false:: %b\n", isMatch1("aaa", "a"));
        System.out.printf("true:: %b\n", isMatch1("aa", "a*"));
        System.out.printf("true:: %b\n", isMatch1("aa", ".*"));
        System.out.printf("true:: %b\n", isMatch1("ab", ".*"));
        System.out.printf("true:: %b\n", isMatch1("aab", "c*a*b"));
    }

    public static boolean isMatch(String string, String pattern) {
        if (pattern.length() == 0) return string.length() == 0;
        //pattern length 1 is special case
        if (pattern.length() == 1 || pattern.charAt(1) != '*') {
            if (string.length() < 1 || (pattern.charAt(0) != '.' && string.charAt(0) != pattern.charAt(0))) return false;
            return isMatch(string.substring(1), pattern.substring(1));
        } else {
            int len = string.length();
            int i = -1;
            while (i < len && (i < 0 || pattern.charAt(0) == '.' || pattern.charAt(0) == string.charAt(i))) {
                if (isMatch(string.substring(i + 1), pattern.substring(2))) return true;
                i++;
            }
            return true;
        }
    }

    public static boolean isMatch1(String s, String p) {
        //base case
        if (p.isEmpty()) return s.isEmpty();

        //special case
        if (p.length() == 1) {
            //if the length of s is 0, return false.
            if (s.isEmpty()) {
                return false;
            }
            //if the first does not match, return false
            else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) return false;
                //otherwise compare the rest of the string s and p
            else return isMatch1(s.substring(1), p.substring(1));
        }

        //case 1: when the second char of p is not '*'
        if (p.charAt(1) != '*') {
            if (s.isEmpty()) {
                return false;
            }
            if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) return false;
            else return isMatch1(s.substring(1), p.substring(1));
        }

        //case 2: when the second char of p is '*', complex case
        else {
            //case 2.1 a char & '*' can stand for 0 element
            if (isMatch1(s, p.substring(2))) return true;
//            case 2.2: a char & '*' can stand for 1 or more preceding element, so try every substring
            int i = 0;
            while (i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')) {
                if (isMatch1(s.substring(i + 1), p.substring(2))) return true;
                i++;
            }
            return true;
        }
    }
}
