package com.nikolanew.testingnew.helper.digitalocean;

public class FibonaciRecursion {

    public static void main(String[] args) {
        fibonaci(10);
    }

    static void fibonaci(int count) {
        int a = 0, b = 1, c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
