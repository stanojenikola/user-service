package com.nikolanew.testingnew.helper.digitalocean;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 1;


        a = a + b; // 11
        b = a-b; // 10
        a = a-b;

        System.out.println(a);
        System.out.println(b);

    }

}
