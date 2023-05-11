package com.nikolanew.testingnew.helper.leecode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int rigth = 0; rigth < s.length(); rigth++) {

            if (!set.contains(s.charAt(rigth))) {
                set.add(s.charAt(rigth));
                maxLength = Math.max(maxLength, rigth - left +1);
            } else {
                while(s.charAt(rigth) != s.charAt(left)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(rigth));

            }
        }

        return maxLength;
    }
}
