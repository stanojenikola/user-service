package com.nikolanew.testingnew.helper.leecode;

public class LongestPolindromSubstring {

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len < 2) {
            return s;
        }

        int maxLength = 1,start=0;
        int low, high;


        for (int i = 0; i < len; i++) {
            low = i -1;
            high = i + 1;
            while (high < len && s.charAt(high) == s.charAt(i)) {
                high++;
            }
            while (low>= 0 && s.charAt(low) == s.charAt(i)) {
                low--;
            }
            while (low >= 0 && high < len && s.charAt(high) == s.charAt(low)) {
                high++;
                low--;
            }

            int length = high - low - 1;
            if (maxLength < length) {
                maxLength = length;
                start = low+1;
            }
        }



        return s.substring(start, start + maxLength );

    }
}
