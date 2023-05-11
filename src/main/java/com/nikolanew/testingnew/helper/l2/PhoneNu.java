package com.nikolanew.testingnew.helper.l2;

import java.util.LinkedList;
import java.util.List;

public class PhoneNu {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> linkedList = new LinkedList<String>();

        if (digits.isEmpty()) {
            return linkedList;
        }



        var mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        linkedList.add("");
        for (int i = 0; i< digits.length(); i++) {
            int d = Character.getNumericValue(digits.charAt(i));

            while (linkedList.peek().length() == i) {
                String t =   linkedList.remove();

                for (char c: mapping[d].toCharArray()) {
                    linkedList.add(t+c);
                }
            }


        }

        return linkedList;
    }}
