package com.nikolanew.testingnew.transpefect;

public class Primenumbers {

    public static void main(String[] args) {
        int limit = 500;
        int i = 1;
        while (i <= limit) {
            if (i == 1) {
                System.out.println(i + " " + (i + 4));
                i = 3;
            }
            if (i >= 3) {
                if ((i + 4) <= limit) {
                    System.out.println(i + " " + (i + 4));
                    i += 4;
                }
            }
        }
    }
}
