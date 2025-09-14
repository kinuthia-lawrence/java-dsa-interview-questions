package com.larrykin.classwork.algorithm_techniques;

/**
 * Hashing Technique
 * Uses hash tables for fast lookup, insertion, and deletion.
 */
import java.util.HashMap;

public class HashingTechnique {
    public static void demo() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("A"));
    }
    public static void main(String[] args) {
        demo();
    }
}

