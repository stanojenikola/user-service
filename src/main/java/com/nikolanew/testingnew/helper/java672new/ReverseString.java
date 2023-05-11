package com.nikolanew.testingnew.helper.java672new;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {

    private String reverse(String str) {
        if (str.length()  <2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void isCorrect() {
        Assert.assertEquals("cba", reverse("abc"));
    }
}
