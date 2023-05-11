package com.nikolanew.testingnew.helper.digitalocean2;

import org.junit.Assert;
import org.junit.Test;

public class PolindromString {

    String str = "acbca";
    String str2 = "acbka";

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        Assert.assertEquals(str, new StringBuilder(str).reverse().toString());
        Assert.assertNotEquals(str2, new StringBuilder(str).reverse().toString());
        Assert.assertEquals(true, isPalindrome(1234321));

    }

    public boolean isPalindrome(int num) {
        int reversed = 0;
        int savedNumber = num;
        while (num != 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num/=10;
        }

        return savedNumber == reversed;
    }


}
