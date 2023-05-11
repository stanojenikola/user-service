package com.nikolanew.testingnew.helper.digitalocean2;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 2;
        int b = 22;
        a = a+b; //24
        b = a -b; //2;
        a = a -b;

        System.out.printf("a: %d,  b: % d", a, b);
    }

}
