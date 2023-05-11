package com.nikolanew.testingnew.helper.java672new;

public class ReverseUsingRecursion {

    public static void main(String[] args) {
        System.out.println(reverse("nikola"));
    }

    public static  String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

}
