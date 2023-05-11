package com.nikolanew.testingnew.helper.digitalocean2;

public class Fibonnaci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;


        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public void test() {

    }



}
