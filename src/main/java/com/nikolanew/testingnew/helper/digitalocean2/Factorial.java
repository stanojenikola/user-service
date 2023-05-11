package com.nikolanew.testingnew.helper.digitalocean2;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
