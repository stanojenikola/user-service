package com.nikolanew.testingnew.helper.java672;

import org.junit.Assert;
import org.junit.Test;

public class IsPolindromString {

    public static void main(String[] args) {
        System.out.println( isPolindromString("abc"));

        System.out.println("reverse: " +  reverse("nikola"));
        System.out.println(isP("aba"));
    }


    private static boolean isPolindromString(String str) {
        System.out.println(new StringBuilder(str).reverse());
        return new StringBuilder(str).reverse().toString().equals(str);
    }


    static  boolean isP(String str) {
        return reverse(str).equals(str);
    }

    private static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void test() {
        Assert.assertTrue("aba", isPolindromString("aba"));
        Assert.assertFalse("nikola", isPolindromString("nikola"));

    }

}
