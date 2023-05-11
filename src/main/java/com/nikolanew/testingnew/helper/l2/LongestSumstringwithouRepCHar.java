package com.nikolanew.testingnew.helper.l2;

import java.util.HashSet;

public class LongestSumstringwithouRepCHar {
    public int lengthOfLongestSubstring(String s) {
        var set = new HashSet<Character>();
        var maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right- left + 1);
            } else {
                while(s.charAt(right) != s.charAt(left)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }


        return maxLength;
    }

}
