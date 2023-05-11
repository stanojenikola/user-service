package com.nikolanew.testingnew.helper.digitalocean;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factoriat(5));
    }

    static long factoriat(long n) {
         if ( n == 1) {
             return n;
         } else {
             return (n * factoriat(n-1));
         }
    }

}
