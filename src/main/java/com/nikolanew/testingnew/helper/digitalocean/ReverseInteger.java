package com.nikolanew.testingnew.helper.digitalocean;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse("nikola"));
    }

    static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) +  str.charAt(0);
    }

}
