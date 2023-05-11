package com.nikolanew.testingnew.helper.l2;

public class LongestPolindormSubString {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int high = 0;
        int low = 0;
        int start = 0;
        int maxLength = 0;

        for (int i =0;i < len; i++) {
            high = i+1;
            low = i-1;

            while (high < len && s.charAt(i) == s.charAt(high)) {
                high++;
            }
            while(low >=0 && s.charAt(i) == s.charAt(low)) {
                low--;
            }

            while (low >0 && high < len && s.charAt(high) == s.charAt(low)) {
                high++;
                low--;
            }

            int len2 = high -low -1;

            if (maxLength < len2) {
                maxLength = len2;
                start = low +1;
            }
        }


        return s.substring(start, start + maxLength);
    }

}
