package com.nikolanew.testingnew.helper;

public class PolindromCheck {

    public static void main(String[] args) {
        System.out.println(isPolindrom(101));
    }

    static boolean isPolindrom(int number) {

        var current = number;
        var remainder = 0;

        while (current != 0) {
            remainder = remainder * 10 + current % 10;
            current = current / 10;
        }

        return number == remainder;
    }

}
