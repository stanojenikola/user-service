package com.nikolanew.testingnew.helper.l2;

public class PolNumber {
    public boolean isPalindrome(int x) {
        int curr = x;
        boolean flag = false;
        int value = 0;

        while (curr != 0) {
            int last = curr %10;
            value = value * 10 + last;
            curr = curr/ 10;
        }

        if (x < 0) {
            return false;
        }

        return value == x;
    }
}
