package com.nikolanew.testingnew.helper;



public class FibonnacciSeries {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int i;
        int count = 20;
        int n3;

        for (i = 2; i <count; ++i) {
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }


    static void f() {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        int count = 10;

        int i;

        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1= n2;
            n2 = n3;
        }
    }

}
