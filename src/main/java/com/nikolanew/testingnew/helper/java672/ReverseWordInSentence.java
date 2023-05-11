package com.nikolanew.testingnew.helper.java672;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordInSentence {

    public static void main(String[] args) {
        var a = "ab b bb aaa nikola";
        StringBuilder stringBuilder = new StringBuilder();
        var list = Arrays.asList(a.split("\\s"));

        for (int i = list.size()-1; i>=0; i--)  {
            stringBuilder.append(list.get(i));
            stringBuilder.append(" ");
        }

        // System.out.println(stringBuilder.toString());

        System.out.println(reverseWord("nikola"));

    }



    private static String reverseWord(String str) {

        if (str.length() < 2) {
            System.out.println(str);
            return str;
        }

        return reverseWord(str.substring(1) ) + str.charAt(0);
    }





}
