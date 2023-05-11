package com.nikolanew.testingnew.helper.java672;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {


    public static void main(String[] args) {
        System.out.println("test: " + isAnagram("niola", "ikolan"));

    }

    private static boolean isAnagram(String word, String anagram) {
        char[] chars = word.toCharArray();
        char[] charsAnagram = anagram.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charsAnagram);
        return Arrays.equals(charsAnagram, chars);
    }



}
