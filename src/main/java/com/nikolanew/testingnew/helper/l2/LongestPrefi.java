package com.nikolanew.testingnew.helper.l2;

public class LongestPrefi {
    public String longestCommonPrefix(String[] strs) {
        var prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }

        return prefix;
    }
}
