package com.nikolanew.testingnew.helper.digitalocean;

public class OnlyOdd {

    public static void main(String[] args) {

        int a[] = new int[]{3, 4, 5};

        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println("have even number");

                break;
            }
            if (i == a[a.length - 1]) {
                System.out.println("is without even number");

            }
        }

    }

}
