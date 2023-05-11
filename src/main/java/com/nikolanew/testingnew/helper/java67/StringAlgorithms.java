package com.nikolanew.testingnew.helper.java67;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class StringAlgorithms {

    public static void main(String[] args) {
        // System.out.println(isAnagram("nikola", "alokin"));
        // System.out.println(getFirstNoRepetedChar("tesstt"));
        // reverseRecursively("test");
        // hasDigits();
        // System.out.println(containsOnlyDigits("11"));
        // duplicateCharacteresInString("testnikoloa");
        // countVowelsInString("testnikoloatestnikoloa");
        // occurrenceOfTheCharInString('n', "testnikoloatestnikoloa");
        allPermutationOfTheString("", "xyc");
    }

    // 1 anagram
    public static boolean isAnagram(String word, String anagram) {

        if (word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagram.indexOf(c);

            if (index != -1) {
                System.out.println(" index: " + index);
                anagram =
                    anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }

        return anagram.isEmpty();
    }

    private static char getFirstNoRepetedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());

        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("didn't find the characters");
    }

    public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }
        System.out.println(str);
        System.out.println("char 0: " + str.charAt(0));
        //char 0: t
        //    est
        // char 0: e
        //    st
        //char 0: s
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    private static void hasDigits() {
        Pattern pattern = Pattern.compile(".*[^0-9].*");

        String[] inputs = {"123", "123", "abc"};

        for (String s : inputs) {
            System.out.println("is match: " + s + " -  " + !pattern.matcher(s).matches());
        }
    }

    private static boolean hasDigits(String str) {
        return true;
    }

    public static boolean containsOnlyDigits(String s) {

        if (s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            char temp = (char) (s.charAt(i) - '0');
            System.out.println("test: " + temp);

            if (temp < 0 || temp > 9) {
                return false;
            }
        }

        return true;
    }

    private static void duplicateCharacteresInString(String str) {
        char[] chars = str.toCharArray();
        var set = new HashSet<Character>();
        for (int i = 0; i < chars.length; i++) {
            boolean isAdded = set.add(chars[i]);

            if (!isAdded) {
                System.out.println("duplicate: " + chars[i]);
            }
        }
    }

    private static void countVowelsInString(String sentence) {
        char[] chars = sentence.toCharArray();

        int count = 0;

        for (char c : chars) {
            switch (c) {
                case 'e':
                case 'a':
                case 'o':
                case 'i':
                case 'u':
                    count++;
                    break;
                default:

            }
        }

        System.out.println("count of the vowels in the " + sentence + " is: " + count);
    }

    private static void occurrenceOfTheCharInString(char c, String sentence) {
        char[] chars = sentence.toCharArray();

        for (char _c : chars) {

            if (_c == c) {
                System.out.println("char: " + _c + " is there");

            }
        }
    }

    private static void allPermutationOfTheString(String temp, String str) {
        if (str.length() < 2) {
            System.err.println(temp + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                allPermutationOfTheString(temp + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
            }

        }
    }
}
