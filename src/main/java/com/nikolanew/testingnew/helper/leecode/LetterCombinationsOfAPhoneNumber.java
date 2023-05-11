package com.nikolanew.testingnew.helper.leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        System.out.println(letterCombinations("29"));
    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> linkedList = new LinkedList<String>();
        if (digits.isEmpty()) return linkedList;
        var mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        linkedList.add("");

        for (int i = 0; i < digits.length(); i++) {
            int d = Character.getNumericValue(digits.charAt(i));

            System.out.println("peek: " + linkedList.peek());
            while(linkedList.peek().length() == i) {
                String t = linkedList.remove();

                System.out.println("remove: " + t);
                System.out.println("tocharArray: " + Arrays.toString(mapping[d].toCharArray()));

                for (char s: mapping[d].toCharArray()) {
                    System.out.println("t: " + t);
                    System.out.println("s: " + s);
                    linkedList.add(t+s);
                }

            }

        }
        return linkedList;
    }

}
