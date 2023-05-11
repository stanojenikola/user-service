package com.nikolanew.testingnew.helper.java672;

import java.util.HashSet;

public class DuplicateCharsInString {


    public static void main(String[] args) {
        String test = "abcda";
        // char[] charArray = test.toCharArray();
        var set = new HashSet<Character>();
        for (int i = 0; i< test.length(); i++) {

            var canBeAdded = set.add(test.charAt(i));

            if (!canBeAdded) {
                System.out.println("duplicate: " + test.charAt(i));
            }
        }
    }

}
