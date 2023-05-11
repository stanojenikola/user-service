package com.nikolanew.testingnew.helper.java672;

import org.junit.Assert;
import org.junit.Test;

public class ReverseUsingRecursion {

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }


    private static String reverse(String str) {

        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }


    @Test
    public void test() {
        Assert.assertEquals("cba", reverse("abc"));
    }

}
