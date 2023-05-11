package com.nikolanew.testingnew.helper.java672new;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringDuplicate {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicate("nikakla")));


    }
    private static Character[] duplicate(String duplicate)  {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (Character c: duplicate.toCharArray()) {
            map.put(c, map.containsKey(c)? map.get(c) + 1: 1);
        }

        for (Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                stringBuilder.append(entry.getKey());
                count++;
            }
        }
        var result = new Character[count];

        for (int i = 0; i < stringBuilder.length(); i++) {
            result[i] = stringBuilder.charAt(i);
        }
        return result;
    }

}
