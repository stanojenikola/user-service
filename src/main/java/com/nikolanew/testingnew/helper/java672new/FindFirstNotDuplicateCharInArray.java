package com.nikolanew.testingnew.helper.java672new;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;

public class FindFirstNotDuplicateCharInArray {

    public static void main(String[] args) {


        String text = Optional.of(args[0]).orElse("");

        HashMap<Character, Integer> hashMap = new HashMap<>();
        char firstNotRepeted;
        for (char c : text.toCharArray()) {
            hashMap.put(c, hashMap.containsKey(c) ? hashMap.get(c) + 1 : 1);
        }
        for (Entry<Character, Integer> entry: hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                firstNotRepeted = entry.getKey();
                System.out.println(firstNotRepeted);
                break;
            }
        }

    }

}
