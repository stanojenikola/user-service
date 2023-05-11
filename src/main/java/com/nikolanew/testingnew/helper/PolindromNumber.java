package com.nikolanew.testingnew.helper;

public class PolindromNumber {

    public static void main(String[] args) {
        System.out.println( polindromNumber(101));
    }

    private static boolean polindromNumber(int anyNumber) {
        int polindrom = anyNumber;
        int reverse = 0;

        while (polindrom != 0) {
            int remaindir = polindrom % 10;
            System.out.println("remaindir: "+ remaindir);
            reverse = reverse * 10 + remaindir;
            System.out.println("reverse: "+ reverse);
            polindrom = polindrom /10;
        }

        if (anyNumber == reverse) {
            return true;
        }

        return false;
    }

}
