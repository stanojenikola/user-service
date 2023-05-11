package com.nikolanew.testingnew.helper.leecode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println("end: " + longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i =1; i <strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

}
