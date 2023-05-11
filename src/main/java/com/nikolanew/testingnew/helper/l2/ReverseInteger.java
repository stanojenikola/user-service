package com.nikolanew.testingnew.helper.l2;

public class ReverseInteger {
    public int reverse(int x) {
        int current = x;
        int reversedNumber = 0;
        while (current != 0) {
            var rem = current % 10;
            reversedNumber = reversedNumber * 10 + rem;
            current = current / 10;
        }

        if (reversedNumber < Integer.MAX_VALUE && reversedNumber > Integer.MIN_VALUE) {
            return reversedNumber;
        }

        return 0;

    }
}
